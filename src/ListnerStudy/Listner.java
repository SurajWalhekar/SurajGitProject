package ListnerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Passed Successful",true);
	}
       @Override
    public void onTestFailure(ITestResult result) {
    	   Reporter.log("Take Screenshot",true);
    }
       @Override
    public void onTestSkipped(ITestResult result) {
    	   Reporter.log("The Test is Skipped",true);
    }
}
