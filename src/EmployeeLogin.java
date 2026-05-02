import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeLogin {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM employees WHERE email=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "sairaj@gmail.com");
            ps.setString(2, "1234");

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                System.out.println("Login Successful");

            } else {

                System.out.println("Invalid Credentials");

            }

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}