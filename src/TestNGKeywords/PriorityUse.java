package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test (priority =-2)
  public void d() {
	  Reporter.log("d is Running",true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a is Running",true);
  }
  @Test (priority = -1)
  public void v() 
  {
	  Reporter.log("v is Running",true); 
  }
}
