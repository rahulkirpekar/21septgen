package oops.jdbctopic.dao.statementtopic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import oops.jdbctopic.bean.EmployeeBean;
import oops.jdbctopic.util.DbConnection;
public class EmployeeDao 
{
	// Employee records insert
	public int insert(EmployeeBean ebean) 
	{
		int rowAffected = 0; 
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES('"+ebean.getName()+"','"+ebean.getSalary()+"','"+ebean.getDsgn()+"','"+ebean.getOrgName()+"')";
		// 1) get DbConnection Object
		Connection conn = DbConnection.getDbInstance();

		Statement stmt = null;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao---insert()---Db not Connected.");
		} 
		return rowAffected;
	}
	// Employee records update
	public int update(int updateId,EmployeeBean ebean) 
	{
		String updateQuery = "UPDATE Employee SET name='"+ebean.getName()+"', salary = '"+ebean.getSalary()+"', dsgn = '"+ebean.getDsgn()+"', orgName = '"+ebean.getOrgName()+"' WHERE id ="+updateId;
		Connection conn = DbConnection.getDbInstance();
		Statement stmt = null;
		int rowsAffected = 0 ;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(updateQuery);
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
	// Employee records delete
	public int delete(int id) 
	{
		String deleteQuery = "DELETE FROM Employee WHERE id="+id;
		Connection conn = DbConnection.getDbInstance();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(deleteQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao----delete()---Db not connected");
		}
		return rowsAffected;
	}
	// Display ----All Employee records 
	public ArrayList<EmployeeBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM employee";
		Connection conn = DbConnection.getDbInstance();
		Statement stmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
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
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Name : ");
//		String name = sc.nextLine();
//		System.out.println("Enter Salary : ");
//		String salary = sc.nextLine();
//		System.out.println("Enter Dsgn : ");
//		String dsgn = sc.nextLine();
//		System.out.println("Enter OrgName : ");
//		String orgName = sc.nextLine();
		
//		EmployeeBean ebean= new EmployeeBean(0, name, salary, dsgn, orgName);
		
//		EmployeeDao dao = new EmployeeDao();

//		int rowsAffected = dao.insert(ebean);
//		if (rowsAffected > 0) 
//		{
//			System.out.println("Employee records successfully inserted : " + rowsAffected);
//		} else 
//		{
//			System.out.println("Employee records not inserted : " + rowsAffected);
//		}
		//-------------------------------------------------------------------------------
//		EmployeeDao dao = new EmployeeDao();
//		ArrayList<EmployeeBean> list = dao.getAllRecords();
//		System.out.println("id\tName\tSalary\tDsgn\tOrgName");
//		for (int i = 0; i < list.size(); i++) 
//		{
//			EmployeeBean  e = list.get(i);
//			
//			System.out.println(e.getId() + "\t" +e.getName()  + "\t" + e.getSalary() + "\t" +e.getDsgn() + "\t" + e.getOrgName());
//		}
//-------------------------------------------------------------------------------
//		EmployeeDao dao = new EmployeeDao();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Employee Id which you wan to delete : ");
//		int id = sc.nextInt();
//
//		int rowsAffected = dao.delete(id);
//		if (rowsAffected > 0) 
//		{
//			System.out.println("Employee records successfully Deleted : " + rowsAffected);
//		} else 
//		{
//			System.out.println("Employee records not Deleted : " + rowsAffected);
//		}
//-------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id where you want to Update : ");
		int updatedId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Salary : ");
		String salary = sc.nextLine();
		System.out.println("Enter Dsgn : ");
		String dsgn = sc.nextLine();
		System.out.println("Enter OrgName : ");
		String orgName = sc.nextLine();
		
		EmployeeBean ebean = new EmployeeBean(0, name, salary, dsgn, orgName);
		
		EmployeeDao dao = new EmployeeDao();
		
		
		int rowsAffected = dao.update(updatedId,ebean);
		if (rowsAffected > 0) 
		{
			System.out.println("Employee records successfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Employee records not Updated : " + rowsAffected);
		}		
	}
}






