package train;

import java.util.ArrayList;
import java.util.Scanner;

class seat{
	int stationCount;
	int[]stations;
	public seat(int count){
		stationCount=count-1;
		stations=new int[stationCount];
	}
	public boolean available(int startstation,int endstation){
		for(int i=startstation;i<endstation;i++){
			if(stations[i]!=0)
				return false;
		}
			return true;
	}
}

class Ticket{
	int pnr,seats,start,end,cancelled;
	int[] seatnos;
	public Ticket(int ses,int p,int str,int ed){
		pnr=p;
		seats=ses;
		start=str;
		end=ed;
		seatnos=new int[seats];
	}
}

public class ProjectStart {
	static int pnrMain=1;
	static seat s[]=new seat[10];
	static int wlCount=0;
	static ArrayList<Ticket> tickets=new ArrayList<>();
	
	public static void start(){
		for(int i=0;i<10;i++){
			s[i]=new seat(5);
		}
	}
	
	static boolean available(int seats,int start,int end){
		int count=0;
		for(int i=0;i<8;i++){
			if(s[i].available(start,end))
				count++;
		}
		if(count+(2-wlCount)>=seats)
			return true;
		else
			return false;
	}
	
	static boolean WLavailable(int seats,int start,int end){
		int count=0;
		for(int i=0;i<8;i++){
			if(s[i].available(start,end))
				count++;
		}
		if(count>=seats)
			return true;
		else
			return false;
	}
	
	static void book(int seats,int start,int end){
		Ticket temp=new Ticket(seats,pnrMain,start,end);
		int count=0;
		for(int i=0;i<8;i++){
			if(s[i].available(start,end)){
				for(int j=start;j<end;j++){
					s[i].stations[j]=1;
				}
				temp.seatnos[count]=i;
				count++;
			}
			if(count==seats)
				break;
		}
		while(count!=seats){
			temp.seatnos[count++]=7+(++wlCount);
			s[7+wlCount].stations[0]=pnrMain;
		}
		tickets.add(temp);
		pnrMain++;
	}
	
	static void WLbook(int seats,int start,int end,Ticket temp,int index){
		int c=0;
		for(int i=0;i<8;i++){
			if(s[i].available(start,end)){
				for(int j=start;j<end;j++){
					s[i].stations[j]=1;
				}
				temp.seatnos[index]=i;
				c=1;
			}
			if(c==1)
				break;
		}
	}
	
	static void display(){
		System.out.println("  A B C D E");
		for(int i=0;i<8;i++){
			System.out.print(i+1+" ");
			for(int j=0;j<s[i].stations.length;j++){
				if(s[i].stations[j]==1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			System.out.println("-");
		}
		for(Ticket i:tickets){
			System.out.print("PNR:"+i.pnr+" Seats:"+i.seats+" Start:"+i.start+" End:"+i.end+" Cancelled:"+i.cancelled+" Seats No.:");
			for(int j=0;j<i.seatnos.length;j++){
				if(i.seatnos[j]>=8)
					System.out.print("WL"+(i.seatnos[j]-7)+" ");
				else if(i.seatnos[j]!=-1)
				System.out.print(i.seatnos[j]+1+" ");
				}
			System.out.println();
		}
	}
	
	static void cancel(int p,int seats){
		Ticket process = null;
		for(Ticket i:tickets){
			if(i.pnr==p){
				process=i;
				break;
			}
		}
		process.cancelled=seats;
		int count=1;
		while(seats!=0){
			int sno=process.seatnos[process.seatnos.length-count];
			process.seatnos[process.seatnos.length-count]=-1;
			for(int i=process.start;i<process.end;i++){
				s[sno].stations[i]=0;
			}
			seats--;
			count++;
		}
		while(wlCount>0){
			int pn=s[7+wlCount].stations[0];
			for(Ticket i:tickets){
				if(i.pnr==pn){
					process=i;
					break;
				}
			}
			if(WLavailable(1,process.start,process.end)){
				int seno=0;
				for(int i=0;i<process.seatnos.length;i++){
					if(7+wlCount==process.seatnos[i])
						seno=i;
				}
				WLbook(1,process.start,process.end,process,seno);
				if(wlCount>1){
					s[8].stations[0]=s[9].stations[0];
					int pp=s[8].stations[0];
					for(Ticket i:tickets){
						if(i.pnr==pp){
							process=i;
							break;
						}
					}
					for(int i=0;i<process.seatnos.length;i++)
					if(process.seatnos[i]==9)
						process.seatnos[i]=8;
					wlCount--;
				}
				else
					wlCount--;
			}
			else
				break;
		}
	}

	public static void main(String[] args) {
		start();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Enter book or cancel or display....");
			String str=sc.next().toLowerCase();
			int n;
			if(str.equals("book"))
				n=0;
			else if(str.equals("cancel"))
				n=1;
			else
				n=2;
			switch(n){
			case 0:
				System.out.println("Enter seats,start station,end station...");
				int se=sc.nextInt(),st=sc.nextInt(),end=sc.nextInt();
				if(available(se,st,end))
					book(se,st,end);
				else
					System.out.println("Booking cancelled");
				break;
			case 1:
				System.out.println("Enter PNR,Number of seats");
				int pn=sc.nextInt(),no=sc.nextInt();
				cancel(pn,no);
				break;
			case 2:
				display();
			}
		}
	}

}