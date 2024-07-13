import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args)
    {
        String url="jdbc:postgresql://localhost/Telusko.table";
        String Username="postgres";
        String password="8010811908";
        String SQL="select\"password\"from\"username = Ram ";

        Connection con=DriverManager.getConnection(url,Username,password);

        Statement



    }
}