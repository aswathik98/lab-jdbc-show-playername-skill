package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager{
	
	public static Connection getConnection() throws Exception {
		
		Properties newProp = new Properties();
		newProp = loadPropertiesFile();
		
		String driver,url,username,password;
		
		driver = newProp.getProperty("driver");
		url = newProp.getProperty("url");
		username = newProp.getProperty("username");
		password = newProp.getProperty("password");
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		if(con!=null) {
			System.out.println("Established");
			return con;
		}else {
			System.out.println("Not Established");
		}
		return null;
	}
	
	
	
	
	
	
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
}
