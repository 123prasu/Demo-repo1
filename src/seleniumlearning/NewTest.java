package seleniumlearning;

import java.util.Date;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  Date dd = new Date();
	  
	  long date = dd.getTime();
	  
	  System.out.println(date);
	  
  }
}
