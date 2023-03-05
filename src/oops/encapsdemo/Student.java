package oops.encapsdemo;

// "Pure Encapsulation" - Java POJO--[Plain Old Java Object] class---DataTransport---JDBC
public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	// setters methods 
	public void setRno(int rno) 
	{
		this.rno=rno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setStd(int std) 
	{
		this.std=std;
	}
	//getters methods
	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
}
