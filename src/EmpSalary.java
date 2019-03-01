import java.lang.*;
import java.util.*;

//sub class1 for empid check
class Empid_Check {
	boolean k =false;
	boolean empVerify(String empid){
		switch(empid){
		case "A100" : k = true;
		break;
		case "A101" : k = true;
		break;
		case "A102" : k = true;
		break;
		default : k = false;
		}
		return(k);
		}
	}

//sub class2 for emp salary cal
 class Emp_Salary{
	 float  salary(float bsal,float hra){
		 
	 float totalSal = bsal+hra;
	 
	 return(totalSal);
	 }
 }

// sub class for display for emp details
 
 class Emp_Display{
	 void empdis(String empId,String eName,String eTeam, float bsal,float hra){
		 System.out.println("empId :"+empId);
		 System.out.println("eName :"+eName);
		 System.out.println("eTeam :"+eTeam);
		 System.out.println("ebsal :"+bsal);
		 System.out.println("ehra :"+hra);
		// System.out.println("empId :"+totSal);
		 
	 }
 }
 
 // Main class for emp 
 
 
 public class EmpSalary{
	 
	 public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the emp id");
		 String empid = s.nextLine();
		 Empid_Check ecc = new Empid_Check();
		 boolean k = ecc.empVerify(empid);
		 if (k){
		 System.out.println("Enter the emp Name");
		 String eName = s.nextLine();
		 System.out.println("Enter the emp Team");
		 String eTeam = s.nextLine();
		 System.out.println("Enter the emp bsal");
		 float bsal = s.nextFloat();
		 System.out.println("Enter the emp hra");
		 float hra = s.nextFloat();
		 Emp_Salary esal = new Emp_Salary();
		 float esal1 = esal.salary(bsal, hra);
		 if (bsal >= 5000){
			 float deduct = bsal - 500+hra;
			 Emp_Display ds = new Emp_Display();
			 
				ds.empdis(empid, eName, eTeam, bsal, hra);
		// float deduct;
		System.out.println("after deductns sal amount "+deduct);
		 }

		 
		
		 }
		 else {System.out.println("Invaild empid");}	 
	 }}


