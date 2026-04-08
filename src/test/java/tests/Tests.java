package selenium_project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
		public class Tests extends BaseTest  {

		    @Test
		    public void validLogin() throws Exception {
		        LoginPage lp = new LoginPage(driver);
		        lp.login("standard_user","secret_sauce");
		        String expected = "Swag Labs";
		        Thread.sleep(3000);
		        Screenshot_Utility.takeScreenshot(driver,"Login Success");
		        String actual = driver.getTitle();
		        System.out.println(actual);
		        
		        boolean isDashboardPresent = driver.findElements(By.id("inventory_container")).size() > 0;

		        if(isDashboardPresent){
		            System.out.println("Test Case Pass (Login Success)");
		        } else {
		            System.out.println("Test Case Fail (Error displayed)");
		        }
		    }
		        }
		    
		

