import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddLaptop {
    ConnectionDatabase connectionDatabase = new ConnectionDatabase();
    Connection connection = connectionDatabase.connection();

    String SQL = "insert into Laptop (Name, RAM, SSD, Chipset, price, stock) " +
            "value (?,?,?,?,?,?)";

    PreparedStatement preparedStatement =null;

    public void addLaptop(){
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,"Game Minh");
            preparedStatement.setString(2,"8GB");
            preparedStatement.setString(3,"512GB");
            preparedStatement.setString(4,"Intel i5");
            preparedStatement.setDouble(5,1600.00);
            preparedStatement.setBoolean(6,true);

            int row = preparedStatement.executeUpdate();
            if (row > 0){
                System.out.println("Đã thêm thành công");
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
