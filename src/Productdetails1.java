//sub class
 class Product{
	
//variables and methods for sub class
	String bCode,bName,bAuthor;
	float bPrice;
	void disBookDetails(){
		System.out.println("----book details----");
		System.out.println("bCode :"+bCode);
		System.out.println("bAuthor :"+bAuthor);
		System.out.println("bPrice :"+bPrice);
	}

	}

//main class

 class ProductDetails1{
	
	public static void main(String[] args){
		Product pt = new Product();
		pt.bCode = "A122";
		pt.bName = "test";
		pt.bAuthor = " tester";
		pt.bPrice = 253;
		pt.disBookDetails();
		
	}
	
}