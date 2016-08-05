import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.activation.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Baofeng(Shawn) Xue I854966  7/27/16.
 */
public class Log4Jdbc {
  
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
  
    Properties properties = new Properties();
    properties.put("user","system");
    properties.put("password","welcome");
    Class.forName("net.sf.log4jdbc.DriverSpy");
    Connection con = DriverManager.getConnection(
        "jdbc:log4jdbc:oracle:thin:@localhost:1521:XE",
        properties);
  
    Statement stmt = con.createStatement();
    stmt.executeQuery("SELECT TOPIC FROM HELP");
    
    Logger logger = LoggerFactory.getLogger(Log4Jdbc.class);
    logger.debug("test");
  }
}
