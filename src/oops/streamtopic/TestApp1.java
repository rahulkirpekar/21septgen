package oops.streamtopic;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Product p1 =  new Product(1, "KeyBoard", 10000);
		Product p2 =  new Product(2, "Mouse", 12000);
		Product p3 =  new Product(3, "TV", 180000);
		Product p4 =  new Product(4, "Freeze", 25000);
		Product p5 =  new Product(5, "SmartFan", 15000);
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		// stream api
		
		long count = list.stream().filter(p->p.getPrice()>50000).count();
		
		System.out.println("Product Greter than 50000 : " + count);
		
//		list.stream().max((product1,product2) -> (product1.getPrice() > product2.getPrice()) ? 1 : -1).get().disp();
//		list.stream().min((product1,product2) -> (product1.getPrice() > product2.getPrice()) ? 1 : -1).get().disp();
		
		
//		int gsum = list.stream().map(product->product.price).reduce(0,(sum,price)->sum+price);
//		System.out.println("Grand Sum of Products : " + gsum);
//		list.stream().filter(p->p.getPrice()>50000).forEach( p -> p.disp());
		
//		Stream<Product> stream = list.stream();

//		list.stream().filter(p -> p.getPrice() < 15000).forEach(p->p.disp());
		
//		List<Product>updatedList = list.stream().filter(p -> p.getPrice() < 15000).toList();
//		List<Product>updatedList = list.stream().filter(p -> p.getPrice() < 15000).collect(Collectors.toList());
		
//		System.out.println("updatedList.size() - " + updatedList.size());
		
//		for (int i = 0; i < list.size(); i++) 
//		{
//			Product p = list.get(i);
//			if (p.getPrice()<15000) 
//			{
//				p.disp();
//			} 
//		}
		
		// element---1,++
//		 Stream.iterate(1, element->element+1)  
//			 .filter(element->element%5==0)  
//			 .limit(5)  
//			 .forEach(System.out::println);  
	}
}
