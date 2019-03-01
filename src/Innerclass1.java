 class Subclass1{ //outer class

	 Subclass1(){
		 System.out.println("constructor from outer class");
	 }
	 static int a = 10;
	 int b =20;
	 public void m1(){
		 System.out.println("this from m1() method");
		 System.out.println("the value of a :"+a);
		 System.out.println("the value of b"+b);
		 }
class Subclass2 { //inner 
	Subclass2(){
		System.out.println("constructor from inner class");
	}
	Subclass2(int x){
		System.out.println("paramet constructor from inner class"+x);
	}
	public void m2(){
		System.out.println("this is from m2 method");
		m1();
	}
//m1();
}}

public class Innerclass1 {

	public static void main(String[] args) {
		Subclass1 obj1 = new Subclass1();
		Subclass1.Subclass2 obj2 = obj1.new Subclass2(20);
		Subclass1.Subclass2 obj3 = obj1.new Subclass2();
		obj1.m1();
		obj2.m2();
		
		
	}

}
