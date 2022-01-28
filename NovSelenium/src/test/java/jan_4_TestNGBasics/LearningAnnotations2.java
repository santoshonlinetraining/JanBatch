package jan_4_TestNGBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LearningAnnotations2 {
  @Test
  public void f() {
	  System.out.println("I am from F1");
  }
  
  @Test
  public void f2() {
	  System.out.println("I am from F2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am from after class");
  }

}
