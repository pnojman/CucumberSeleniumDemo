package pageobjects;

import static org.junit.Assert.assertEquals;

import initialization.Initialization;



public class GoogleResultPage extends Initialization {
	
	public void checkTitle(String expectedResult) {

		assertEquals(expectedResult, getDriver().getTitle());
		
	}

}
