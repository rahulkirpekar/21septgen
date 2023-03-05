package oops.jdbctopic.util;

import java.sql.Connection;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Connection conn1 = DbConnection.getDbInstance();
		Connection conn2 = DbConnection.getDbInstance();
		Connection conn3 = DbConnection.getDbInstance();
		Connection conn4 = DbConnection.getDbInstance();
		Connection conn5 = DbConnection.getDbInstance();
		
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println(conn3);
		System.out.println(conn4);
		System.out.println(conn5);
	}
}
