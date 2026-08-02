import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment1 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";   // Replace with your HR password if different

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES_ASSIGNMENT");

            System.out.println("EMPLOYEE_ID\tFIRST_NAME");
            System.out.println("--------------------------");

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + "\t\t" +
                        rs.getString("FIRST_NAME"));

            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}