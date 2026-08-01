import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {
           // Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            e.printStackTrace();
        }
    }
}