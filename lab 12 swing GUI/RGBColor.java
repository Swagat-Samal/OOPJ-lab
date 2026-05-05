import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColor implements ActionListener {

    JFrame f;
    JLabel l1,l2,l3;
    JComboBox<Integer> c1,c2,c3;
    JButton b;
    JPanel p;

    RGBColor(){

        f = new JFrame("My Frame");
        f.setSize(450,250);
        f.setLayout(null);

        p = new JPanel();
        p.setBounds(0,0,450,250);
        p.setLayout(null);

        l1 = new JLabel("Red");
        l1.setBounds(50,30,40,30);

        l2 = new JLabel("Blue");
        l2.setBounds(150,30,40,30);

        l3 = new JLabel("Green");
        l3.setBounds(250,30,50,30);

        Integer values[] = new Integer[256];
        for(int i=0;i<=255;i++)
            values[i]=i;

        c1 = new JComboBox<>(values);
        c1.setBounds(80,30,60,30);

        c2 = new JComboBox<>(values);
        c2.setBounds(180,30,60,30);

        c3 = new JComboBox<>(values);
        c3.setBounds(310,30,60,30);

        b = new JButton("Show Output");
        b.setBounds(150,80,130,30);

        b.addActionListener(this);

        p.add(l1); p.add(l2); p.add(l3);
        p.add(c1); p.add(c2); p.add(c3);
        p.add(b);

        f.add(p);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

        int r = (int)c1.getSelectedItem();
        int b = (int)c2.getSelectedItem();
        int g = (int)c3.getSelectedItem();

        Color color = new Color(r,g,b);

        p.setBackground(color);
    }

    public static void main(String args[]){
        new RGBColor();
    }
}
