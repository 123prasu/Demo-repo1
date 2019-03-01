//import java.lang.*;
//import java.util.InputMismatchException;
import java.util.*;
//wrapper classes with integer data type 

class Dstring1{
	 public static void main(String[] args){
try( Scanner s = new Scanner(System.in);){
 System.out.println("enter the val1");
 String val1 = s.nextLine();
 val1.replace("@gmail.com", "");
	 val1.trim();
	 System.out.println(val1);
 }
 
 Integer obj1 = Integer.valueOf(10); 
 
 //System.out.println("enter the val2");
 //float val2 = s.nextFloat();
 
 Float obj2 =  Float.valueOf(12.34F);
 
 System.out.println("val1 :"+obj1.doubleValue());
 System.out.println("val1 :"+obj1.toString());
 System.out.println("val2 :"+obj2.floatValue());
 System.out.println("val2 :"+obj2.toString());
 

String s1 = obj1.toString();
float k1 = obj2.intValue();
 
System.out.println(s1);
System.out.println(k1);

}	 

/*catch(InputMismatchException | NumberFormatException ob){
System.out.println("only integers are allowed, try with integers");	
}*/
	 }
