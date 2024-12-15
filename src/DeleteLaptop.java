import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteLaptop {
    ConnectionDatabase connectionDatabase = new ConnectionDatabase();
    Connection connection = connectionDatabase.connection();

    String SQL = "update Laptop set stock = ? where id = ?";

    PreparedStatement preparedStatement =null;

    public void deleteLaptop(){
        try {
            preparedStatement = connection.prepareStatement(SQL);
preparedStatement.setBoolean(1,false);
preparedStatement.setInt(2,4);

            int row = preparedStatement.executeUpdate();
            if (row > 0){
                System.out.println("Xóa thành công");
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
