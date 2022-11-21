import java.awt.*;
import java.awt.event.*;	//step 1
import javax.swing.*;

public class KrishContact extends Frame implements ActionListener{
    Label l1,l2,l3,l4;
	TextField t1;
	TextField t2;
	Button b1;     //step 3
	Panel p1;
	
	public KrishContact()
	{
	l1=new Label("ENTER NUMBER 1");	
	l2=new Label("ENTER NUMBER 2");
	l3=new Label("RESULT");
	l4=new Label("");
	t1=new TextField();
	//t1.setText("100");
	//t1.setEditable(false);
	t2=new TextField();
	//t2.setEchoChar('$');
	b1=new Button("ADD");		//step 4
	p1=new Panel(); 
	
	setLayout(new BorderLayout());	//step 5 - choose the layout
	p1.setLayout(new GridLayout(3,2));
	
	p1.add(l1);
	p1.add(t1);
	p1.add(l2);
	p1.add(t2);
	p1.add(l3);
	p1.add(l4);
							//step 6
							
	add(p1,"Center");
	add(b1,"South");
	
	b1.addActionListener(this);
	
	setVisible(true);
	setTitle("ADD TWO NUMBERS");
	setSize(200,200);
	
	}//constructor ends
	
	public void actionPerformed(ActionEvent ae){
			String cap=ae.getActionCommand();
			if(cap.equals("ADD"))
			{
			int n1=	Integer.parseInt(t1.getText());
			int n2=	Integer.parseInt(t2.getText());
			int n3=n1+n2;
			l4.setText(n3+"");
			}
	}
	
	
	public static void main(String args[])
	{
	
	new KrishContact();
	}
}
