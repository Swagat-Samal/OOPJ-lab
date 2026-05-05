import javax.swing.*;
import java.awt.event.*;

public class MyCalc implements ActionListener {

    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;

    MyCalc(){

        f = new JFrame("My Calc");
        f.setSize(450,300);
        f.setLayout(null);

        l1 = new JLabel("Enter the First Number:");
        l1.setBounds(50,50,160,30);

        l2 = new JLabel("Enter the Second Number:");
        l2.setBounds(50,90,170,30);

        l3 = new JLabel("Result:");
        l3.setBounds(50,130,100,30);

        t1 = new JTextField();
        t1.setBounds(220,50,80,30);

        t2 = new JTextField();
        t2.setBounds(220,90,80,30);

        t3 = new JTextField();
        t3.setBounds(220,130,80,30);

        b1 = new JButton("Add");
        b1.setBounds(150,180,70,30);

        b2 = new JButton("Subtract");
        b2.setBounds(230,180,90,30);

        b3 = new JButton("Multiply");
        b3.setBounds(330,180,90,30);

        b4 = new JButton("Reset");
        b4.setBounds(230,220,80,30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.add(l1); f.add(l2); f.add(l3);
        f.add(t1); f.add(t2); f.add(t3);
        f.add(b1); f.add(b2); f.add(b3); f.add(b4);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

        int a,b,c;

        if(e.getSource()==b1){
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=a+b;
            t3.setText(String.valueOf(c));
        }

        if(e.getSource()==b2){
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=a-b;
            t3.setText(String.valueOf(c));
        }

        if(e.getSource()==b3){
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=a*b;
            t3.setText(String.valueOf(c));
        }

        if(e.getSource()==b4){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String args[]){
        new MyCalc();
    }
}