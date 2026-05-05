import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChange implements ActionListener {

    JFrame f;
    JList<String> list;
    JButton b;
    JPanel p;

    String colors[] = {"white", "orange", "red", "blue"};

    ColorChange() {

        f = new JFrame("My frame");
        f.setSize(400,250);
        f.setLayout(null);

        p = new JPanel();
        p.setBounds(0,0,400,250);
        p.setLayout(null);

        list = new JList<>(colors);
        list.setBounds(150,60,80,80);

        b = new JButton("Click");
        b.setBounds(250,80,80,30);

        b.addActionListener(this);

        p.add(list);
        p.add(b);

        f.add(p);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String c = list.getSelectedValue();

        if(c.equals("white"))
            p.setBackground(Color.white);

        if(c.equals("orange"))
            p.setBackground(Color.orange);

        if(c.equals("red"))
            p.setBackground(Color.red);

        if(c.equals("blue"))
            p.setBackground(Color.blue);
    }

    public static void main(String args[]) {
        new ColorChange();
    }
}