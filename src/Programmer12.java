/*import java.util.InputMismatchException;

interface Compare{
	public int compareTo(int x,int y) throws Exception;
	
}

public class Programmer12{
	
	public static void main(String[] args){
		try{
			
		Compare  c1 = (int x, int y) ->
		{
		try{
			if(x==0 | y==0){
				Exception gv1 = new Exception("only non-zero's are allowed");
			
				throw gv1;
			}}
			catch(Exception gv1){
				throw gv1;}
			if (x>y){
				return x;
			}else
			{
				return y;
			
			}
			
		};	
	int k = c1.compareTo(12,13);
	System.out.println("grater value "+k);
		}
	
	
	
		
		//end of try 
		
		catch(InputMismatchException ime){
			System.out.println("only intergers are allowed");
		}
		catch(Exception gv1){
			System.out.println(gv1.getMessage());
		}
	}
}
	
*/


class Programmer12{
	public static void main(String[] args){
		int count =0;
		int  num  = 222;
		for(; num!=0; num/=10, ++count){
			
		}System.out.println(count);
		}
	}







































	