//import java.lang.*;
import java.util.Scanner;
public class ProductDetails {

	public static void main(String[] args){
		boolean k;
		int counter = 0;
		float bal = 2000;
		Scanner s = new Scanner(System.in);
		while(true){
		System.out.println("Enter the pin number");
		String pinNo = s.nextLine();
		if (pinNo.length() == 4){
	 System.out.println("Enter the amount");
	 int amt = s.nextInt();
	 if (amt >0 && amt%100 ==0 ){
		 if (amt <= bal){
			 System.out.println("amount with drawn :"+amt);
			 System.out.println("available balance :"+(bal-amt));
			 System.out.println("Transaction completed");
		 }
		 else {
			 
			 System.out.println("insufficent balance");
		 }
	 }
	 else {
		  
		 System.out.println("Invaild amt, Please try with multiples of 100's");
		 break;
	 }
		}
		else {
			counter++;
		System.out.println("Invaild pin no");
		}
		if (counter == 3){
			System.out.println("Transaction blocked for today, try after some time");
			break;
		}
		
		}
	   }
}
	


                    