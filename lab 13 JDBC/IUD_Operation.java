import java.sql.*;
import java.util.Scanner;

public class IUD_Operation {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "DB_USER";
        String pass = "DB_PASS";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter RollNo: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    PreparedStatement ps1 = con.prepareStatement(
                            "INSERT INTO student VALUES (?, ?, ?)"
                    );
                    ps1.setInt(1, id);
                    ps1.setString(2, name);
                    ps1.setInt(3, marks);

                    int i = ps1.executeUpdate();
                    if (i > 0)
                        System.out.println("1 record inserted");
                    break;

                case 2:
                    System.out.print("Enter RollNo to update: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter new marks: ");
                    int newMarks = sc.nextInt();

                    PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE student SET marks=? WHERE id=?"
                    );
                    ps2.setInt(1, newMarks);
                    ps2.setInt(2, uid);

                    int u = ps2.executeUpdate();
                    if (u > 0)
                        System.out.println("Record updated");
                    else
                        System.out.println("Record not found");
                    break;

                case 3:
                    System.out.print("Enter RollNo to delete: ");
                    int did = sc.nextInt();

                    PreparedStatement ps3 = con.prepareStatement(
                            "DELETE FROM student WHERE id=?"
                    );
                    ps3.setInt(1, did);

                    int d = ps3.executeUpdate();
                    if (d > 0)
                        System.out.println("Record deleted");
                    else
                        System.out.println("Record not found");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}