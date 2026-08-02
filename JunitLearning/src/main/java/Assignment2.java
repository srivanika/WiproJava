import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment2 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";   // Replace with your HR password if different

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT FIRST_NAME, JOB_ID, SALARY, COMMISSION_PCT " +
                    "FROM EMPLOYEES_ASSIGNMENT " +
                    "WHERE SALARY > 1000 AND SALARY < 2000");

            System.out.println("FIRST_NAME\tJOB_ID\tSALARY\tCOMMISSION");
            System.out.println("------------------------------------------------");

            while (rs.next()) {

                System.out.println(
                        rs.getString("FIRST_NAME") + "\t\t" +
                        rs.getString("JOB_ID") + "\t" +
                        rs.getDouble("SALARY") + "\t" +
                        rs.getDouble("COMMISSION_PCT"));

            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}