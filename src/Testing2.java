import java.util.Scanner;

class Test extends Exception{
	Test (){
		
	}
	
	Test(String str){
		super(str);
	}
	
	public void test(String bra) throws Test{
	
		try(Scanner s = new Scanner(System.in);){
		
	
	//System.out.println("Enter your branch");
	//String bra = s.nextLine();
	switch(bra){
	case "EEE" :
		break;
	case "MECH" :
		break;
	case "CIVIL" :
		break;
		default:
			Test t1 = new Test("Invaild branch");
	throw t1;	
	}
	}
	catch(Test t1){
		throw t1;
	}
}
}
 class Testing2 extends Exception{
	 Testing2(String str){
		 super(str);
	 }
	 
	 public static void main(String[] args) throws Exception{
		 
 try(Scanner s = new Scanner(System.in);){
	
	 System.out.println("enter your branch");
	 String br = s.nextLine();
	 Test t21 = new Test();
	t21.test(br);
	 System.out.println("enter your rollno ");
	 int rolno = s.nextInt();
	 
	 if(rolno != 10){
		 Testing2 t22 = new  Testing2("invaild rollno");
		 throw t22;
	 }
	 
	 System.out.println("branch :"+br);
	 System.out.println("rollno :"+rolno);
	 
 }
	catch (Testing2 | Test tgfjyf){
		System.out.println(tgfjyf.getMessage());
	}
 }
 }