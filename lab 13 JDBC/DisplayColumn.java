import java.sql.*;

public class DisplayColumn {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "DB_USER";
        String pass = "DB_PASS";


        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("Roll No\tName\t\tMarks");
            System.out.println("--------------------------------");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" +
                        rs.getString(2) + "\t" +
                        rs.getInt(3));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}