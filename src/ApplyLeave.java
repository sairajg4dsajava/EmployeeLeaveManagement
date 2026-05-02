import java.sql.Connection;
import java.sql.PreparedStatement;

public class ApplyLeave {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO leave_requests(emp_id,leave_type,from_date,to_date,status) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 1);
            ps.setString(2, "Sick Leave");
            ps.setString(3, "2026-05-05");
            ps.setString(4, "2026-05-07");
            ps.setString(5, "Pending");

            int rows = ps.executeUpdate();

            System.out.println(rows + " Leave Applied Successfully");

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}