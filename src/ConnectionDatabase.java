import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private String URL = "jdbc:mysql://127.0.0.1:3306/jdbc_QuanLyBanLapTop";
    private String name = "root";
    private String pass = "1962005";

    Connection connection = null;

    public Connection connection(){
        try {
            connection = DriverManager.getConnection(URL,name,pass);
            System.out.println("Kết nối thành công");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
