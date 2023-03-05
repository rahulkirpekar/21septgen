package oops.stringtopic.objectequality;

public class Student 
{
	public int rno;
	public String name;
	public int std;
	
	public void setData(int rno,String name ,int std)
	{
		this.rno=rno;
		this.name=name;
		this.std=std;
	}
//	@Override
//	public String toString() 
//	{
//		return rno + " "+ name + " " + std;
//	}
	@Override
	public boolean equals(Object obj) 
	{
		Student s2 = (Student)obj;
		if (rno!=s2.rno) 
		{
			return false;
		} else if(!name.equals(s2.name))
		{
			return false;
		}else if(std!=s2.std) 
		{
			return false;
		}
		return true;
	}
}
