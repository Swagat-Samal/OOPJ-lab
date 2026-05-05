import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SQL_GUI extends JFrame implements ActionListener {

    JTextField tf;
    JTextArea ta;
    JButton btn;

    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "DB_USER";
    String pass = "DB_PASS";

    SQL_GUI() {
        setTitle("SQL Query Interface");
        setLayout(null);

        JLabel l1 = new JLabel("Enter SQL Statement:");
        l1.setBounds(50, 50, 150, 30);
        add(l1);

        tf = new JTextField();
        tf.setBounds(200, 50, 300, 30);
        add(tf);

        btn = new JButton("EXECUTE Query");
        btn.setBounds(200, 100, 150, 30);
        btn.addActionListener(this);
        add(btn);

        ta = new JTextArea();
        ta.setBounds(50, 150, 450, 200);
        add(ta);

        setSize(550, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            String query = tf.getText().trim();
            ta.setText("");

            if (query.toLowerCase().startsWith("select")) {

                ResultSet rs = stmt.executeQuery(query);
                ResultSetMetaData md = rs.getMetaData();

                int cols = md.getColumnCount();

                for (int i = 1; i <= cols; i++) {
                    ta.append(md.getColumnName(i) + "\t");
                }
                ta.append("\n");

                while (rs.next()) {
                    for (int i = 1; i <= cols; i++) {
                        ta.append(rs.getString(i) + "\t");
                    }
                    ta.append("\n");
                }

            } else {
                int rows = stmt.executeUpdate(query);
                ta.setText(rows + " row(s) affected");
            }

            con.close();

        } catch (Exception ex) {
            ta.setText(ex.toString());
        }
    }

    public static void main(String[] args) {
        new SQL_GUI();
    }
}