package demo.selenium.order;

import org.testng.annotations.Test;

public class DependentTest {
  @Test (dependsOnMethods = {"openBrowser"})
  public void signin() {
	  
	  System.out.println("signin");
  }
  
  @Test ()
  public void openBrowser() {
	  
	  System.out.println("openBrowser");
  }
  
  
	  @Test (dependsOnMethods = {"signin"})
	  public void logout() {
		  
		  System.out.println("logout");
	  }
  
}
