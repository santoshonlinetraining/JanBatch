package jan_4_TestNGBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LearningAnnotations3 {
  @Test
  public void f() {
	  System.out.println("I am from F1");
  }
  
  @Test
  public void f2() {
	  System.out.println("I am from F2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am from Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am from After class");
  }

}
