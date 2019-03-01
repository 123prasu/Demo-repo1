import java.lang.*;
import java.util.*;
 class Code_Check  { //sub class1 for emp verify
boolean k;
	boolean verify(String empcode){
switch(empcode){

case "A121" : k = true;
default : k =false;
}//end of switch

 return(k);

}//end of the method 

}//end of sub class1

class Prddet { //sub class2 for product
	
	float product(float pPrice, int pQty){
	float totalPrice = pPrice*pQty;
	
	return(totalPrice);
}
		
}//end of sub class2
	
 class Disscount { //subclass3 for discount
	float fbil(float totalPrice){
		float fBill = (totalPrice - 0.12F*totalPrice);
		return(fBill);
	}
} //end of sub class3

class Display{ //sub class4 for display the content
	void display (String pCode, String pName, int pQty, float pPrice, float totalPrice, float fBill){
		System.out.println("pCode :"+pCode);
		System.out.println("pName :"+pName);
		System.out.println("pQty :"+pQty);
		System.out.println("pPrice :"+pPrice);
		System.out.println("totalPrice :"+totalPrice);
		
		if (fBill > 0){
			System.out.println("fBill :"+fBill);
		}//end of if 
		
		}
}// end of sub class4

public class EmpolyeeConfig{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the empoly code");
		String empcode = s.nextLine();
		
		//object creation for employee id check
		Code_Check ecc = new Code_Check();
		boolean k = ecc.verify(empcode);
		if(k = true){
			System.out.println("enter the product code");
			String pCode = s.nextLine();
			System.out.println("enter the product Name");
			String pName = s.nextLine();
			System.out.println("enter the product price");
			float pPrice = s.nextFloat();
			System.out.println("enter the product quantity");
			int pQty = s.nextInt();
		//object for product price 
			
			Prddet  pdt = new Prddet();
			
	            float totalPrice = pdt.product(pPrice, pQty); // non-return type method --issue
	            
	            float fBill = totalPrice;
	          if (totalPrice >= 5000){
				
	            Disscount fbil = new Disscount();
	           
			     fBill = fbil.fbil(totalPrice);
			
	          }//end of if discount
	          
			Display ds = new Display();
			  ds.display(pCode, pName, pQty, pPrice, totalPrice, fBill);
		}//end of if
		else
		{
			System.out.println("Invaild empcode");
		}
		
		
		
		}
}

