package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	
	@BeforeTest(alwaysRun=true)//while using groups in xml file if we want to run the base class we need to mention alwaysrun = true for the annotations
	public void method3() {
		
		System.out.println("Inside Before test");
		
	}
	

	@BeforeMethod(alwaysRun=true)
	public void method1() {
		
		System.out.println("Inside Before method");
	}
	
	@AfterMethod(alwaysRun=true)
	public void method2() {
		
		System.out.println("Inside After method");
	}
	
	@AfterTest(alwaysRun=true)
	public void method4() {
		
		System.out.println("Inside After test");
		
	}
}
