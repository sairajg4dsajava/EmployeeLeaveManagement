import java.sql.Connection;
import java.sql.PreparedStatement;

public class ApproveLeave {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE leave_requests SET status=? WHERE leave_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Approved");
            ps.setInt(2, 1);

            int rows = ps.executeUpdate();

            System.out.println(rows + " Leave Approved Successfully");

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}