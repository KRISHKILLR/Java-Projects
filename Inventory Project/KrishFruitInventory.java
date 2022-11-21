import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KrishFruitInventory extends Frame implements ActionListener{
    
    double sum=0.0;
    //below are the prices per kg
    double apple = 5.00;
    double banana = 2.75;
    double clem = ;
    double durain = ;
    double emuberry = ;
    double figs = ; 
    double tax = (sum*1.10);
    Label title, s1, s2, l1, l2, l3, l4, l5, l6;
    TextField t1, t2, t3, t4, t5, t6;
    Button b1, b2, b3, b4, b5, b6;
    Button calculate, cancel, cash, help;
    Panel p1;

    public KrishFruitInventory(){
        title = new Lable("Krish's Fruit Inventory");
        s1 = new Label("Here you can check out customer that come in the fruit department of this store.");
        s2 = new Label("The tax in this province is 10%");
        l1 = new Label("Apples are $5.00 per Kg");
        l2 = new Label("Bananas are $5.00 per Kg");
        l3 = new Label("Clementines are $5.00 per Kg");
        l4 = new Label("Durains are $5.00 per Kg");
        l5 = new Label("Emu Berries are $5.00 per Kg");
        l6 = new Label("Figs are $5.00 per Kg");

        p1.setlayout(null);

        


    }
	
	
	public static void main(String args[]){
        new KrishFruitInventory();
	}
}
