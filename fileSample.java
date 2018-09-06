import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileSample {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		try{
		File f=new File("C:/Users/AKILESH/Desktop/WebProject/sample.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		String ad="Akilesh";
		int i=1;
		while(true){
			if(i==10)
				break;
			ad=""+i;
			bw.append(ad);
			i++;
		}
		bw.flush();
		}
		catch(Exception e){
			e.getMessage();
		}
	}

}
