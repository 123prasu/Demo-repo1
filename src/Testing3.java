 import java.util.InputMismatchException;
import java.util.Scanner;


/*Employee Address class */
 class Address extends Exception{
	 public String hno;
	 
	 Address(){
		 
	 }
Address(String s1){
	super(s1);
}
	
	 public void address(String hno) throws Address{
		try{
			if(hno.length() >= 3){
				Address a1 = new Address("invaild address");
				System.out.println(a1.hashCode());
				throw a1;
			}
		}//end of try
			 
		catch(Address a1){
			throw a1;
			
		}
		 
	 }//end of address method
	 }//end of Address class

 /*Employee Salary class*/
 class Salary extends Exception {
	 Salary(){
		 
	 }
	 Salary(String s2){
		 super(s2);
	 }
	public void salary(int sal) throws Salary{
		try{
			if(sal > 5000){
				Salary s1 = new Salary("invaild salary");
				throw s1;
			}
		}//end of try
		catch (Salary s1){
			throw s1;
		}//end of catch
		
	}
 }//end of salary class
 
 /*Employee and Designation class*/
 
 class Employee extends Salary{
	 public String name;
	 class Designation extends Exception{
		public String desg;
		 Designation(){
			 
		 }
		 Designation(String s3){
			 super(s3);
		 }
		 public void desg(String dsg) throws Designation{
			try{
				switch(dsg){
				case "QA":
					break;
				case "Systems":
					break;
				case "dev":
					break;
				default:
					Designation d1 = new Designation("invaild desgination");
					throw d1;
				}}
			catch(Designation d1){
				throw d1;
			}
			 
		 }
		 
	 }//end of designation class
	 
	 Address a1 = new Address(); //referred class 
	 
 }//end of employee class
 
 /*Main class */

public class Testing3 {
	public static void main(String[] args){
		
	try(Scanner s = new Scanner(System.in);){
		Employee e1 = new Employee();
		System.out.println("enter the empolyee name");
		 e1.name = s.nextLine();
		
		System.out.println("enter the empolyee desg");
		String desg = s.nextLine();
		Employee.Designation d11 = e1.new Designation();
             d11.desg(desg);
             
        System.out.println("enter the empolyee Address");
        String add = s.nextLine();
       //Address ad = new Address();
        e1.a1.address(add);
	System.out.println("enter the employee salary");
	int sal = s.nextInt();
	Salary sa2 = new Salary();
  e1.salary(sal);
	
	System.out.println("-----Dis of empolyee deatils-----");
	System.out.println("enter the employee name :"+e1.name);
	System.out.println("enter the employee desg :"+desg);
	System.out.println("enter the employee address :"+add);
	System.out.println("enter the employee salary :"+sal);
	
	
	}
	catch(Employee.Designation | Address | Salary ob){
		System.out.println(ob.getMessage());
		
	}
	
	catch(InputMismatchException ob2){
		System.out.println("only integers are allowed");
	}
		
	}}
