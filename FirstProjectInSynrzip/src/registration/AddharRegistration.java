package registration;

import java.util.Scanner;


public class AddharRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		AddharRegistration ar=new AddharRegistration();
		System.out.println("------------Student Registration System------------");
		
		do {
			
			System.out.println("1: Add Record");
			System.out.println("2: Display Record");
			System.out.println("3: Exit");
			System.out.println("Enter Your Choice  :");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				ar.add();
				break;
			case 2:
				ar.display();
				break;
			case 3:
				ar.exit();
				break;
			default:
				System.out.println("You have Entered Invalid Number");
			}
			System.out.println("Do You Want To Contine Press 1");
		}while(scan.nextInt()==1);
	}
	Person p=new Person();
	   public void exit() {
			System.out.println("Thanks for visiting our System ");
		}
		

	   public void display() {
		
		System.out.println("-------------- Aadhar Details--------------");
		p.person_details();
	}
   
	
	
	Scanner sc=new Scanner(System.in);
	
	public void add() {
		
		System.out.println("Enter First Name :");
		String firstName=sc.next();
		p.setFirstName(firstName);
		System.out.println("Enter middle Name :");
		String middleName=sc.next();
		p.setMiddleName(middleName);
		System.out.println("Enter Last Name :");
		String lastName=sc.next();
		p.setLastName(lastName);
		System.out.println("Enter Mobile No :");
		long mobileNo=sc.nextLong();
		p.setMobileNo(mobileNo);
		
		Address addr=new Address();
		System.out.println("Enter Flat No :");
		int flatNo=sc.nextInt();
        addr.setFlatNo(flatNo);
        System.out.println("Enter Road Name :");
        String roadName=sc.nextLine();
        addr.setRoadName(roadName);
        System.out.println("Enter City Name :");
        String city=sc.nextLine();
        addr.setCity(city);
       
        
        p.setAddr(addr); // dependent object 
	}

}

/*
 * 
 * 
 * output:------------Student Registration System------------
1: Add Record
2: Display Record
3: Exit
Enter Your Choice  :
1
Enter First Name :
Priyanka
Enter middle Name :
Prashant
Enter Last Name :
Kulkarni
Enter Mobile No :
9766357093
Enter Flat No :
4
Enter Road Name :
Enter City Name
shahu college 
Do You Want To Contine Press 1
1
1: Add Record
2: Display Record
3: Exit
Enter Your Choice  :
2
-------------- Aadhar Details--------------
First Name :Priyanka
Middle Name :Prashant
Last Name :Kulkarni
Mobile No :9766357093
Address :Address [flatNo=4, roadName=, city=shahu college , ]
Do You Want To Contine Press 1
1
1: Add Record
2: Display Record
3: Exit
Enter Your Choice  :
3
Thanks for visiting our System 
Do You Want To Contine Press 1
 */



