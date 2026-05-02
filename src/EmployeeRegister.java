import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeRegister {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO employees(emp_name,email,password,department) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Sai Raj");
            ps.setString(2, "sairaj@gmail.com");
            ps.setString(3, "1234");
            ps.setString(4, "IT");

            int rows = ps.executeUpdate();

            System.out.println(rows + " Employee Registered Successfully");

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}