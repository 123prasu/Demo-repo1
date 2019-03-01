//import java.util.Scanner;

/*class Address1{
	  
	  public static String hno = "testing";
	  
	  public static int k ;*/
	  
	  interface Test112{
		  
		  int k = 10;
		  public static void test(){
			  System.out.println("static method");
		  }
	  //}
	/*Address1(String str){
		System.out.println(str);
	}*/
	
	/*public void address(String hno){
		
		 class Test131{
		 int a = 5;
		 public void test123(){
			 k = 100;
			 System.out.println(k);
			 
		 }
		}
		 
	}*/
		
	/*public String toString(){
			return hno;
		}*/ 
		
}
 class Mant{
	public static void main(String[] args){
		
		String ob1 = String.valueOf("united onine");
		Integer ob2 =  Integer.valueOf(63);
	//	Address1 ob3 = new Address1();
	//	Test131 t1 = new Test131();
		
		System.out.println("testing "+ob1);
		System.out.println("testing "+ob2);
	//	System.out.println("testing "+Test112.k);
		
		Test112.test();
		
	}
	
		
	}

