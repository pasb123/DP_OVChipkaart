import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String linkJB= "jdbc:postgresql://localhost:5432/ovchip";
        String username="postgres";
        String password= "sand66";

        try{
            Connection connection= DriverManager.getConnection(linkJB,username,password);
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM reiziger");
            while (resultSet.next()){
                System.out.println(resultSet.getString("reiziger_id")+" "
                        +resultSet.getString("voorletters")+" "
                        +resultSet.getString("tussenvoegsel")+" "
                        +resultSet.getString("achternaam")+" "
                        +resultSet.getString("geboortedatum"));

            }
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }}