package oops.collectiontopic.listtopic;
import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;
public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Vector<Student> list = new Vector<Student>();
		int choice = 0;
		while(choice != 5) 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) For Add Student");
			System.out.println("2) For Update Student");
			System.out.println("3) For Delete Student");
			System.out.println("4) For Display All records Student");
			System.out.println("5) For Student Application exit");
			choice = sc.nextInt();
			Student s = null;
			boolean  flag = false;
			switch(choice) 
			{
					case 1: s = new Student();
							s.scan();
							list.add(s);
							System.out.println("Student record add sucessfully");
							break;
							
					case 2: System.out.println("Enter rno which you want to update Student record : ");
					        int updateRno = sc.nextInt();
					        int i=0;
					        for(;i<list.size();i++) 
					        {
					        	s = list.get(i);
					        	if(s.getRno()==updateRno) 
					        	{
					        		flag = true;
					        		break;
					        	}
					        }
					        if(flag) 
					        {
					        	s.update();
					        	list.set(i, s);
					        	System.out.println("Student records succesfully Updated");	
					        }else 
					        {
					        	System.out.println("Given rno not found in student records.");
					        }
							break;
					case 3: System.out.println("Enter rno which you want to delete Student record : ");
					        int deleteRno = sc.nextInt();
					        i=0;
					        for(;i<list.size();i++) 
					        {
					        	s = list.get(i);
					        	if(s.getRno()==deleteRno) 
					        	{
					        		flag = true;
					        		break;
					        	}
					        }
					        if(flag) 
					        {
					        	list.remove(i);
					        	System.out.println("Student records succesfully Deleted");	
					        }else 
					        {
					        	System.out.println("Given rno not found in student records.");
					        }
							break;
					case 4: Iterator<Student> itr = list.iterator();
							while(itr.hasNext()) 
							{
								s = itr.next();
								s.disp();
							}
							break;
					case 5:
							break;
					default:
								System.out.println("Invalid choice,\n\tPLease enter between 1 to 5 choice");
			}
		}
	}
}
