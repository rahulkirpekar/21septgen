package oops.jdbctopic.dao.preparedstatementtopic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import oops.jdbctopic.bean.EmployeeBean;
import oops.jdbctopic.util.DbConnection;

public class EmployeeDao 
{
	public int insert(EmployeeBean ebean) 
	{
		Connection conn= DbConnection.getDbInstance();
		
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES(?,?,?,?)";

		PreparedStatement pstmt = null;
		
		int rowsAffected = 0;
		
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, ebean.getName());
				pstmt.setString(2, ebean.getSalary());
				pstmt.setString(3, ebean.getDsgn());
				pstmt.setString(4, ebean.getOrgName());

				rowsAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao----insert() not db connected");
		}
		return rowsAffected;
	}
	public int update(int updateId,EmployeeBean ebean) 
	{
		String updateQuery = "UPDATE Employee SET name=?, salary = ?, dsgn = ?, orgName = ? WHERE id =?";
		Connection conn = DbConnection.getDbInstance();
		PreparedStatement pstmt = null;
		
		int rowsAffected = 0 ;
		
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1, ebean.getName());
				pstmt.setString(2, ebean.getSalary());
				pstmt.setString(3, ebean.getDsgn());
				pstmt.setString(4, ebean.getOrgName());
				pstmt.setInt(5, updateId);
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao---update()---Db not Connected");
		}
		return rowsAffected;
	}
	public void delete(int id) 
	{

	}
	public ArrayList<EmployeeBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM employee";
		Connection conn = DbConnection.getDbInstance();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
				
				rs = pstmt.executeQuery();
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String salary = rs.getString(3);
					String dsgn = rs.getString(4);
					String orgName = rs.getString(5);
					
					ebean = new EmployeeBean(id, name, salary, dsgn, orgName);
					list.add(ebean);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not Connected : " + conn);
		}
		return list;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter Employee Id which you want to Update record : ");
//		int id = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name : ");
//		String name = sc.nextLine();
//		System.out.println("Enter Salary : ");
//		String salary = sc.nextLine();
//		System.out.println("Enter Dsgn : ");
//		String dsgn = sc.nextLine();
//		System.out.println("Enter OrgName : ");
//		String orgName = sc.nextLine();
		
//		EmployeeBean ebean= new EmployeeBean(0, name, salary, dsgn, orgName);
		
		EmployeeDao dao = new EmployeeDao();
	
		ArrayList<EmployeeBean> list = dao.getAllRecords();
	
		for (int i = 0; i < list.size(); i++) 
		{
			EmployeeBean e = list.get(i);
			
			System.out.println(e.getId() + " "+ e.getName() + " "+e.getSalary() + " "+e.getDsgn() + " " +e.getOrgName() + " "+ e.getOrgName());
			
		}
//		if (rowsAffected > 0) 
//		{
//			System.out.println("Employee records successfully updated : " + rowsAffected);
//		} else 
//		{
//			System.out.println("Employee records not updated : " + rowsAffected);
//		}
	}
}
