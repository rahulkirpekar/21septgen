package oops.jdbctopic.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection 
{
	private static Connection conn =null;
	
	public static Connection getDbInstance() 
	{
		if (conn == null) 
		{
			conn = getDbConnection();
		}
		return conn;
	}
	// 2) Create getConnection Method
	private static Connection getDbConnection() 
	{
		FileInputStream fin = null;
		Properties prop = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21g_sept_gen\\dbconfig.properties");
			prop = new Properties();
			prop.load(fin);
		} catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		String URLNAME = prop.getProperty("URLNAME").trim();
		String DRIVERCLASS = prop.getProperty("DRIVERCLASS").trim();
		String USERNAME = prop.getProperty("USERNAME").trim();
		String PASSWORD = prop.getProperty("PASSWORD").trim();
		
		System.out.println("URLNAME - " + URLNAME);
		System.out.println("DRIVERCLASS - "+DRIVERCLASS);
		System.out.println("USERNAME - "+USERNAME);
		System.out.println("PASSWORD - "+PASSWORD);
		
		Connection conn = null;
		try 
		{
			// 3) Load Driver Class
			Class.forName(DRIVERCLASS);
			// 4) pass credential into DriverManager's getConnection Method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			// 5) validate conn object
			if(conn!=null) 
			{
				System.out.println("Db connected : " + conn);
			}else 
			{
				System.out.println("Db not connected : " + conn);
			}
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}