import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayList {
    ConnectionDatabase connectionDatabase = new ConnectionDatabase();
    Connection connection = connectionDatabase.connection();

    String SQL = "select * from Laptop";

    Statement statement = null;

    public void displayList(){
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()){
                System.out.print(resultSet.getInt(1) + "\t");
                System.out.print(resultSet.getString(2)+ "\t");
                System.out.print(resultSet.getString(3)+ "\t");
                System.out.print(resultSet.getString(4)+ "\t");
                System.out.print(resultSet.getString(5)+ "\t");
                System.out.print(resultSet.getDouble(6)+ "\t");
                System.out.print(resultSet.getBoolean(7)+ "\t");
                System.out.println();
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
