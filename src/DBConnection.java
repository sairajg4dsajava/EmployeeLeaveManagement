import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost:3306/leave_management";
            String user = "root";
            String password = "Admin@10462";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully");

        } catch(Exception e) {

            e.printStackTrace();

        }

        return con;
    }

    public static void main(String[] args) {

        getConnection();

    }
}