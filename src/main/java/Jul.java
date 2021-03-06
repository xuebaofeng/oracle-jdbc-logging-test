import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Baofeng(Shawn) Xue 7/27/16.
 *
jvm options:
-Doracle.jdbc.Trace=true
-Djava.util.logging.config.file=jdbc-logging.properties
 */
public class Jul {
  
  public static void main(String[] args) throws SQLException {
    
    
    Connection con = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:XE",
        "system",
        "welcome");
    
    Statement stmt = con.createStatement();
    stmt.executeQuery("SELECT TOPIC FROM HELP");
    
  }
}
