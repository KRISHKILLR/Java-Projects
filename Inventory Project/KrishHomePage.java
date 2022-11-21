import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


//make it so that when the person logs in, they have a grace period of 1 hour with the entire system until they have to login again.
//when the person has a valid login, this will result in a boolean in the db to turn on.


public class KrishHomePage extends Frame implements ActionListener{

    Label title, l1, l2, l3, l4;
    Button login, signup, inventory, contact, calculator;
    Panel p1;
    
    public KrishHomePage(){

        Font t = new Font("TimesRoman", Font.BOLD, 50);
        Font b = new Font("TimesRoman", Font.BOLD, 20);

        title = new Label("Krish Admin");
        l1 = new Label("Made by Krish Patel");
        l2 = new Label("Located in Ontario, Canada");
        login = new Button("Login");
        signup = new Button("Signup");
        inventory = new Button("Check Inventory");
        contact = new Button("Contact Page");
        calculator = new Button("Calculator App");
        p1 = new Panel();

        p1.setLayout(null);


        title.setBounds(600,75,300,50);
        l1.setBounds(675,125,150,20);
        l2.setBounds(650,145,200,20);
        login.setBounds(1000,25,75,20);
        signup.setBounds(1000,45,75,20);
        inventory.setBounds(1100,25,175,40);
        contact.setBounds(1300,25,175,40);
        //calculator.setBounds();

        add(p1, "Center");
        p1.add(title);
            title.setFont(t);
        p1.add(l1);
        p1.add(l2);
        p1.add(login);
        p1.add(signup);
        p1.add(inventory);
            inventory.setFont(b);
        p1.add(contact);
            contact.setFont(b);
        //p1.add(calculator);

        login.addActionListener(this);
        signup.addActionListener(this);
        inventory.addActionListener(this);
        contact.addActionListener(this);
        calculator.addActionListener(this);

        setVisible(true);
        setTitle("Krish Home");
        setSize(1500, 1080);



    }

    public void actionPerformed(ActionEvent ae){

        String cap=ae.getActionCommand();
        
        if(cap.equals("Login"))
            new KrishLogin();

        //else if(cap.equals("Signup"))
            //new KrishSignup();

        //else if(cap.equals("Check Inventory"))
            //new KrishFruitInventory();

        else if(cap.equals("Contact Page"))
            new KrishContact();

        else
            System.out.println("Input Not Valid");

        
	}

    public static void main(String[] args) {
        new KrishHomePage();
    }
}
