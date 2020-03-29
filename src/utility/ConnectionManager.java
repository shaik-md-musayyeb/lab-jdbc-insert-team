package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager{
	public static Properties loadPropertiesFile() throws Exception { 
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in); 
		in.close();
		return prop; 
		} 
	
	 public static Connection getConnection() throws Exception {
		 	Properties p = loadPropertiesFile();
			Class.forName(p.getProperty("driver"));
//			String url = p.getProperty("url");
			Connection conn = null;
			conn = DriverManager.getConnection(p.getProperty("url"));
			return conn;
		 
	 }
}
