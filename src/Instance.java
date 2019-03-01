
 /*class Fixed {
 int a = 10; // instance variable
 static int b = 10; //static variable
  
 void m1(){
	 System.out.println("--Instance method call--");
	 System.out.println("value of a :"+a);
	 System.out.println("value of b:"+b);
 }
	
 static {
	 System.out.println("static block from sub class");
 }
 {
	 System.out.println("Instance block from sub class");
 }
 static  void m2(){
	 System.out.println("--static method call--");
	// System.out.println("value of a :"+a);
	 System.out.println("value of b:"+b);
 }
 }*/

// How to use references in java
//sub class for balance amount
/*import java.util.*;
class Balance{
	float bal = 2000;
	void disBal(){
		System.out.println("Balance amount"+bal);
	}
}
//sub class for withdraw

class Withdraw{
     Balance x;
	/*Withdraw(Balance x){ //parameterized constructor 
		this.x = x;
	}*/
		
	/*void wDraw(int amt){
		System.out.println(x.bal);
		if (amt < x.bal){
			
			System.out.println("amt withdrawn :"+amt);
			x.bal = x.bal -amt;
			x.disBal();
			System.out.println("Transcation completed");
			
		}else { System.out.println("Invaild amount transaction");}
	}
}
public class Instance{
	
	public static void main(String[] args)
	  //throws java.lang.NullPointerException
	{
		Scanner s = new Scanner(System.in);
		Balance b1 = new Balance();
		Withdraw w1 = new Withdraw();
		System.out.println("Enter the amount");
		int amt = s.nextInt();
		if (amt > 0 && amt % 100 == 0){
			
			w1.wDraw(amt);
		}
		else {
			System.out.println("Invaild amt");
		}
		
		
	}
	
}*/


class Test1{

	static int x = 120;
	static int t;
	float k = 23.3F;
	static void test1(){
		System.out.println("static method from parent ");
	}
	void test2(){
		int z = 200;
		System.out.println("non-static method from parnet");
	}
	
	}
class Instance extends Test1{
	
	
	//super.k = 100F;
	// k = 100;
	  void  m2(){
	/*super.test1();
	super.test2();
	super.x = 100;
	super.k = 200F;
	k = 500;
	x = 300;*/
	System.out.println(x);
	
	}
//super.rest(20,30);
	/*String eName;
	String eTeam;
	String position;
	Instance(String eName,String eTeam,String position){
		this.eName = eName;
		this.eTeam = eTeam;
		this.position = position;
		
		System.out.println("empolyee Name :"+eName);
		System.out.println("empolyee Team :"+eTeam);
		System.out.println("empolyee positn :"+position);
      
        }
	
	/*static int b;
	void test1(int x, int y){
		System.out.println("method from child class");
		System.out.println("variable from child class"+(x+y));
	}*/
	public static void main(String[] args){
		//Test1 t1= new Test1();
	Instance t2 = new Instance();
	t2.m2();
		//Instance.test1();
		//Instance.x = 100;
	
				
		}
	}









































