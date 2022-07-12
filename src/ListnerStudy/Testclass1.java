package ListnerStudy;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
@Listeners(ListnerStudy.Listner.class)
public class Testclass1 {
  @Test
  public void TC1() 
  {
 Reporter.log("TC1 Running",true);
  }
  @Test
  public void TC2() 
  {
 Reporter.log("TC2 Running",true);
  }
  @Test
  public void TC3() 
  {
	  org.testng.Assert.fail();
 Reporter.log("TC3 Running",true);
  }
  @Test(dependsOnMethods = "TC3")
  public void TC4() 
  {
 Reporter.log("TC4 Running",true);
  }
}
