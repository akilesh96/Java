import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Checkbex extends Applet implements ItemListener
{
	String m;
	Checkbox t1,t2,t3,t4;
	public void init()
	{
		t1=new Checkbox("T1");
		t2=new Checkbox("T2");
		t3=new Checkbox("T3");
		t4=new Checkbox("T4");
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		t1.addItemListener(this);
		t2.addItemListener(this);
		t3.addItemListener(this);
		t4.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		m="T1"+t1.getState();
		int x=300,y=300;
		g.drawString(m, x, y);
		m="T2"+t2.getState();
		g.drawString(m, x, y+20);
		m="T3"+t3.getState();
		g.drawString(m, x, y+40);
		m="T4"+t4.getState();
		g.drawString(m, x, y+60);
	}

}
