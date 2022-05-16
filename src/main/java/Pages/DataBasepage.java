package Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBasepage {
	String columnvalue = null;
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	public String getData(String columnName)  {
//		try {
//			String sqlUrl="jdbc:mysql://localhost:3306/oct2021";
//			String username ="root";
//			String password ="root";
//			Class.forName("com.mysql.cj.jbdc.Driver");
//			String query ="select * from users";
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			 String sqlUrl = "jdb:mysql://localhost:3306/oct2021";
			String username = "root";
			String password = "root";
			try {
				Class.forName("com.mysql.cj.jbdc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String query ="select * from users";
			//create connection to local database
			 // connection = DriverManager.getConnection(sqlUrl, username, password);
			try {
				connection = DriverManager.getConnection(sqlUrl,username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  //empower connection reference variable to execute queries
			  try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  //Deliver the query
			  try {
				resultSet = statement.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  try {
				while(resultSet.next()) {
				try {
					columnvalue =  resultSet.getString(columnName);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return columnvalue;
				  
					  
				  }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			
			
		
			
		
		return null;
		
	}

}
