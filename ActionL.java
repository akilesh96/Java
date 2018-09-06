import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ActionL extends Applet implements ActionListener
{
	TextField t1;
	TextField t2;
	Button b1,b2;
	
	public void init()
	{
		setLayout(null);
		t1=new TextField(25);
		t2=new TextField(25);
		b1=new Button("Copy");
		b2=new Button("Clear");
		t1.setBounds(300, 300, 100, 20);
		t2.setBounds(420, 300, 100, 20);
		b1.setBounds(300, 325, 100, 20);
		b2.setBounds(420, 325, 100, 20);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String a;
		if(ae.getSource()==b1)
		{
			a=t1.getText();
			t2.setText(a);
		}
		else if(ae.getSource()==b2)
		{
			t1.setText(" ");
			t2.setText(" ");
		}
	}

}
