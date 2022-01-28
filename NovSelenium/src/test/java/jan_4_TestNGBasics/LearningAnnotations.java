package jan_4_TestNGBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LearningAnnotations {
  @Test
  public void f() {
	  System.out.println("I am from Test F1");
  }

  @Test
  public void f2() {
	  System.out.println("I am from Test F2");
  }

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from after method");
  }

}
