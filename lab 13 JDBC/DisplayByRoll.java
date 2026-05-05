import java.sql.*;
import java.util.Scanner;

public class DisplayByRoll {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "DB_USER";
        String pass = "DB_PASS";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM student WHERE id = ?"
            );

            ps.setInt(1, roll);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getInt(3));
            } else {
                System.out.println("Record not found");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
