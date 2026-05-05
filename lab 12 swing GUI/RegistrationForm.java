import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm implements ActionListener {

    JFrame f;
    JTextField t1, t2;
    JTextArea ta;
    JRadioButton r1, r2;
    JButton b;

    RegistrationForm() {

        f = new JFrame("Registration Form");
        f.setSize(400,400);
        f.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50,50,100,30);
        t1 = new JTextField();
        t1.setBounds(150,50,150,30);

        JLabel l2 = new JLabel("Address:");
        l2.setBounds(50,100,100,30);
        ta = new JTextArea();
        ta.setBounds(150,100,150,50);

        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(50,170,100,30);

        r1 = new JRadioButton("Male");
        r1.setBounds(150,170,70,30);

        r2 = new JRadioButton("Female");
        r2.setBounds(220,170,80,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l4 = new JLabel("DOB:");
        l4.setBounds(50,210,100,30);
        t2 = new JTextField();
        t2.setBounds(150,210,150,30);


        b = new JButton("Submit");
        b.setBounds(150,280,100,30);

        b.addActionListener(this);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(ta);
        f.add(l3); f.add(r1); f.add(r2);
        f.add(l4); f.add(t2);
        f.add(b);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String name = t1.getText();
        String address = ta.getText();
        String dob = t2.getText();
        String gender = "";

        if(r1.isSelected())
            gender = "Male";
        else if(r2.isSelected())
            gender = "Female";

        JOptionPane.showMessageDialog(f,
                "Name: " + name +
                        "\nAddress: " + address +
                        "\nGender: " + gender +
                        "\nDOB: " + dob);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}