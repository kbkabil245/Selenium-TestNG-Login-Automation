package selenium_project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
		public class Tests extends BaseTest  {

		    @Test
		    public void validLogin() throws Exception {
		        LoginPage lp = new LoginPage(driver);
		        lp.login("standard_user","secret_sauce1");
		        String expected = "Swag Labs";
		        Thread.sleep(3000);
		        String actual = driver.getTitle();
		        
		        boolean isDashboardPresent = driver.findElements(By.id("inventory_container")).size() > 0;

		        if (isDashboardPresent) {
		        	Screenshot_Utility.takeScreenshot(driver, "Login_Success)");
		        	System.out.println("Test Case Pass(Login Success)");
		        }else {
		        	Screenshot_Utility.takeScreenshot(driver,"Login_Failed");
		        	System.out.println("Test Case Fail(Error displayed)");
		        }
		        Assert.assertEquals(actual, expected,"Title Mismatch!");
		            Assert.assertTrue(isDashboardPresent, "Dashboard not found!");
		        }
		    }
		
		        
		    
		


