package StepHooks;

import initialization.Initialization;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Initialization {
	
	@Before()
    public void init() {
		
       setWebDriver(driver,"chrome");    
  }
	
	@After
	public void tearDown() {
		getDriver().quit();
	}

}
