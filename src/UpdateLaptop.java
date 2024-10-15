import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateLaptop {
    ConnectionDatabase connectionDatabase = new ConnectionDatabase();
    Connection connection = connectionDatabase.connection();

    String SQL = "update Laptop set Name = ?, RAM = ?, price = ? where id = ?";

    PreparedStatement preparedStatement =null;

    public void updateLaptop(){
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,"Gam_Minh");
            preparedStatement.setString(2,"16GB");
            preparedStatement.setDouble(3,2000.00);
            preparedStatement.setInt(4,4);

            int row = preparedStatement.executeUpdate();
            if (row > 0){
                System.out.println("Cập nhật thành công");
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
