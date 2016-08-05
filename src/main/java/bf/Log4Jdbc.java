package bf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Baofeng(Shawn) Xue 8/4/16.
 */
public class Log4Jdbc {
  
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    
    
    Class.forName("net.sf.log4jdbc.DriverSpy");
    Connection con = DriverManager.getConnection(
        "jdbc:log4jdbc:oracle:thin:@localhost:1521:XE",
        "system",
        "welcome");
    
    PreparedStatement stmt = con.prepareStatement("SELECT distinct TOPIC FROM HELP where topic = ?");
    stmt.setString(1, "APPEND");
    stmt.executeQuery();
  }
}
