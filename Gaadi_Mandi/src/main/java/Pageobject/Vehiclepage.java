package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vehiclepage {

	@FindBy(id="Rform:j_idt266")
	public static WebElement Tyres;
	@FindBy(id="Rform:j_idt290")
	public static WebElement Savebutton;

	@FindBy(xpath="//*[@id=\'Rform:docName']/div[3]")
	public static WebElement Document;

	@FindBy(id="Rform:fileUpload")
	public static WebElement pic;
	//*[@id=\'Rform:fileUpload\']/div[1]/span

}
