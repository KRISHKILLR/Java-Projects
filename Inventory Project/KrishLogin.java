import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class KrishLogin extends Frame implements ActionListener
{
    String user = "root", pass = "krish";
	Label title,l1,l2,l3;
	JTextField t1;
	JPasswordField t2;
	Button b1, fp;
	Panel p1;
    Checkbox c1;
	
	public KrishLogin()
	{
	
        l1=new Label("Username:");	
	    l2=new Label("Password:");
        l3=new Label("");
        t1=new JTextField();
        t2=new JPasswordField();
        b1=new Button("Login");
        p1=new Panel();
        c1 = new Checkbox("View Password", false);     
        
        p1.setLayout(null);
        
        l1.setBounds(20,25,70,25);
        l2.setBounds(20,75,70,25); 
        l3.setBounds(200,150,175,25);
        t1.setBounds(100,25,175,25); 
        t2.setBounds(100,75,175,25);
        b1.setBounds(50,125,200,30);
        c1.setBounds(150,100,130,25);

        add(p1,"Center");
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(b1);
        p1.add(c1);
        
        b1.addActionListener(this);
        //c1.addItemListener(this);

        setVisible(true);
        setTitle("Krish Admin Login");
        setSize(300,300);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
        String cap=ae.getActionCommand();
        if(cap.equals("Login"))
        {
            String uname=t1.getText();
            String pwd=t2.getText();
            if(uname.equals(user) && pwd.equals(pass))
            {
                new AddNumberAwt();
                l3.setText("Login Successful");
            }
            else
            {
                l3.setText("Login Failed");
            }
        }
	}
	
	
	public static void main(String args[]){
	    new KrishLogin();
	}
}