package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test
  public void myTest()
  {
	  Reporter.log("SurajDada",true);
  }
  @BeforeMethod
  public void test() 
  {
	  Reporter.log("Hi",true);  
  }
}
