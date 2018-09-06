import java.applet.*;
import java.awt.*;
public class App extends Applet
{
	public void init()
	{
		setBackground(Color.YELLOW);
		setForeground(Color.GREEN);
	}
	public void paint(Graphics a)
	{
		Font s=new Font("Times New Roman",Font.BOLD+Font.ITALIC,25);
		a.setFont(s);
		a.drawString("First Java SAA", 200, 200);
		Font b=new Font("Arial",Font.ROMAN_BASELINE,30);
		a.setFont(b);
		a.setColor(Color.black);
		a.drawString("MY NAME IS JAMUNATH", 300, 410);
	}

}
