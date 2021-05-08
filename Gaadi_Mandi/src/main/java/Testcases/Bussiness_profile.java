package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Commonfunction.commonfunction;
import Pageobject.Vehiclepage;

public class Bussiness_profile extends commonfunction {
	
@Test
public void Vehicle_Function() throws InterruptedException
{
	PageFactory.initElements(driver,Vehiclepage.class);
	
	Vehiclepage.Tyres.sendKeys("10");
	Thread.sleep(4000);
	Vehiclepage.Savebutton.click();
}

}
