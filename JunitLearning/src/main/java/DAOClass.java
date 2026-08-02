import java.sql.*;
import java.text.SimpleDateFormat;

public class DAOClass {

    String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    String username = "hr";
    String password = "hr";   // Replace with your Oracle password if different

    Connection con;

    // Method to establish database connection
    public DAOClass() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Insert Student Record
    public void insert(int rollno, String name, String standard,
                       String dob, double fees) {

        try {

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, standard);

            java.util.Date d =
                    new SimpleDateFormat("dd-MMM-yyyy").parse(dob);

            java.sql.Date sqlDate =
                    new java.sql.Date(d.getTime());

            ps.setDate(4, sqlDate);

            ps.setDouble(5, fees);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Inserted Successfully");

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Student Record
    public void delete(int rollno) {

        try {

            PreparedStatement ps1 =
                    con.prepareStatement(
                    "SELECT * FROM STUDENT WHERE ROLLNO=?");

            ps1.setInt(1, rollno);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {

                PreparedStatement log =
                        con.prepareStatement(
                        "INSERT INTO STUDENTLOG VALUES(?,?,?,SYSDATE)");

                log.setInt(1, rs.getInt("ROLLNO"));
                log.setString(2, rs.getString("STUDENTNAME"));
                log.setString(3, rs.getString("STANDARD"));

                log.executeUpdate();

                PreparedStatement del =
                        con.prepareStatement(
                        "DELETE FROM STUDENT WHERE ROLLNO=?");

                del.setInt(1, rollno);

                del.executeUpdate();

                System.out.println("Record Deleted Successfully");

                log.close();
                del.close();

            }
            else {

                System.out.println("Student Not Found");

            }

            rs.close();
            ps1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Modify Fee
    public void modify(int rollno, double fees) {

        try {

            PreparedStatement ps =
                    con.prepareStatement(
                    "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?");

            ps.setDouble(1, fees);
            ps.setInt(2, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Student Not Found");

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Display Student(s)
    public void display(Integer rollno) {

        try {

            PreparedStatement ps;

            if (rollno == null) {

                ps = con.prepareStatement(
                        "SELECT * FROM STUDENT");

            } else {

                ps = con.prepareStatement(
                        "SELECT * FROM STUDENT WHERE ROLLNO=?");

                ps.setInt(1, rollno);

            }

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + "\t" +
                        rs.getString("STUDENTNAME") + "\t" +
                        rs.getString("STANDARD") + "\t" +
                        rs.getDate("DATE_OF_BIRTH") + "\t" +
                        rs.getDouble("FEES"));

            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}