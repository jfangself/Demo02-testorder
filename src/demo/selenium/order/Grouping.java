package demo.selenium.order;

import org.testng.annotations.Test;

public class Grouping {
  @Test (groups={"people"})
  public void student() {
	  
	  System.out.println("student");
	  
  }
  
  @Test (groups={"people"})
  public void teacher() {
	  
	  System.out.println("teacher");
	  
  }
  
  @Test (groups={"animal"})
  public void cat() {
	  
	  System.out.println("cat");
	  
  }
  
  @Test (groups={"animal"})
  public void dog() {
	  
	  System.out.println("dog");
	  
  }
  
  @Test (groups={"people","animal"})
  public void feeder() {
	  
	  System.out.println("feeder");
	  
  }
  
  
}
