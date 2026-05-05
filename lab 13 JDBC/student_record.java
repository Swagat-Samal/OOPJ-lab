import java.sql.*;

public class student_record {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "DB_USER";
        String pass = "DB_PASS";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int marks = rs.getInt(3);

                System.out.println(id + "  " + name + "  " + marks);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
