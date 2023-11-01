package anudip.JPAHibernate.client;
import java.util.Scanner;

import anudip.JPAHibernate.entity.Mobiles;
import anudip.JPAHibernate.service.ServiceImplementation;
public class MobileSystemMain 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//obj of ServiceImplementation class
		ServiceImplementation service=new ServiceImplementation();
		int y;
		do 
		{
			//taking input from user
			System.out.println("1.insert customer details");
			System.out.println("2.insert mobile data");
			System.out.println("3.view details of all the mobiles");
			System.out.println("4.delete a mobile details based on id");
			System.out.println("5.search for any mobile using range of price");
			System.out.println("enter your choice:");
			int x=sc.nextInt();
			switch(x)
			{
			
			//insert Customer details
			case 1:System.out.println("enter mobile id to purchase"); 
					int id1=sc.nextInt(); 
					service.insertCustomerDetails();
					//update Customer details
					service.update(id1);
					break;
					
			//insert mobile data
			case 2:	service.insertmobile();
					break;
					
			//view details of all the mobiles
			case 3:	System.out.println(service.display());
					break;
					
			//delete a mobile details based on id
			case 4:	System.out.println("enter id to delete the record:"); 
					int id=sc.nextInt(); 
					service.delete(id);
					break;
					
			//search for any mobile 
			case 5: service.search();
					break;
			default:System.out.println("enter valid choice:");
			}
			
			System.out.println("enter 1 to continue 0 to exit:");
			y=sc.nextInt();
			
		}while(y==1);
		sc.close();
	}

}
