package memdesk;

import org.testng.annotations.Test;

public class Groups {

	
	@Test(groups="test")
	public void tc_1(){
		System.out.println("output from test group");
	}
	@Test(groups="test")
	public void tc_2(){
		System.out.println("output from test group");
	}
	@Test(groups="test")
	public void tc_3(){
		System.out.println("output from test group");
	}
	@Test(groups="test")
	public void tc_4(){
		System.out.println("output from test group");
	}
	@Test(groups="test1")
	public void tc_5(){
		System.out.println("output from test group");
	}
	@Test(groups="test1")
	public void tc_6(){
		System.out.println("output from test group");
	}
	@Test(groups="test1")
	public void tc_7(){
		System.out.println("output from test group");
	}
	
}
