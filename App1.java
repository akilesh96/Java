import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class App1 extends Applet implements MouseListener
{
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent a)
	{
		setBackground(Color.BLACK);
		
	}
	public void mouseEntered(MouseEvent a)
	{
		setBackground(Color.GREEN);
	}
	public void mousePressed(MouseEvent a){}
	public void mouseReleased(MouseEvent a){}
	public void mouseExited(MouseEvent a)
	{
		setBackground(Color.RED);
	}
}
