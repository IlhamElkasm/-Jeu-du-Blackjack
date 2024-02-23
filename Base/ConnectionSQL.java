import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionSQL {

        public static Connection connexionDB() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/balckjack";
                String username="root";
                String password="Ilham@2020";

                Connection conx=DriverManager.getConnection(url,username,password);
                return conx ;
            }catch(Exception e) {
                System.out.println(e);
                return null;
            }

        }
}
