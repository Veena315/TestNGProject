package testCases;


import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass{
	

	@Test(dependsOnMethods = "test2",groups = "sanity")
	public void test1() {
		
		System.out.println("Inside home loan Test1");
	}
	
	@Test(groups= {"sanity","regression"})
	public void test2() {
		
		System.out.println("Inside home loan Test2");
	}
	
	

}
