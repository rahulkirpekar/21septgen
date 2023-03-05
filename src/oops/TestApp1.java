package oops;

// TestApp1 - Implementation Class
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e[] = new Employee[5];

//		Employee []e1 = new Employee[5];
//		Employee[] e2 = new Employee[5];
//		Employee [] e3 = new Employee[5];
		
		System.out.println("e Array Object : " + e);
		
		for(int i=0;i<e.length ;i++) 
		{
			e[i] = new Employee();
			e[i].scanData();
		}
		for(int i=0;i<e.length ;i++) 
		{
			System.out.println(e[i]);
			e[i].disp();
		}
		
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
		
//		e1.scanData();
//		e2.scanData();
//		e3.scanData();

//		e1.disp();
//		e2.disp();
//		e3.disp();
	} 
}
