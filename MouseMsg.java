import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMsg extends Applet
{
	int x,y;
	String m;
	public void init()
	{
		setBackground(Color.black);
		addMouseListener(new mn());
	}

 class mn extends MouseAdapter
{
	

	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		m="Clicked";
		repaint();
	}
	public void paint(Graphics g)
	{
		Font f=new Font("Arial",Font.BOLD,25);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString(m, x, y);
	}

}
}

