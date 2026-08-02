import java.sql.*;

public class NetSalary {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT EMPNO, ENAME FROM EMP_ASSIGNMENT");

            while (rs.next()) {

                int empno = rs.getInt("EMPNO");
                String ename = rs.getString("ENAME");

                CallableStatement cs =
                        con.prepareCall("{call CALCULATE_NETSAL(?,?)}");

                cs.setInt(1, empno);

                cs.registerOutParameter(2, Types.NUMERIC);

                cs.execute();

                double netsal = cs.getDouble(2);

                System.out.println(
                        empno + "   " + ename + "   " + netsal);

                cs.close();
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}