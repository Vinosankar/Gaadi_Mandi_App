package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Commonfunction.commonfunction;
import Pageobject.Vehiclepage;
import Pageobject.loginpage;

public class LoginTestcases extends commonfunction {

	public void LoginScreen() throws InterruptedException
	{
		PageFactory.initElements(driver,loginpage.class);
		loginpage.Loginicon.click();
		loginpage.Loginid.click();
		loginpage.Emailid.sendKeys(properties.getProperty("Email/MoblieNO"));
		loginpage.Password.sendKeys(properties.getProperty("Password"));
		loginpage.Loginbutton.click();
		Thread.sleep(4000);
		/*loginpage.Admin.click();
		loginpage.Subplan.click();*/
		
		loginpage.Sell.click();
		Thread.sleep(6000);
		/*loginpage.professtional.click();
		loginpage.proceed.click();*/
		 loginpage.Location.sendKeys("chennai");
		
	/*	loginpage.Register.click();
		loginpage.moblie.sendKeys("9789330364");
		loginpage.email.sendKeys("vinosankar1999@gmail.com");
		loginpage.password.sendKeys("Vino@123");
		loginpage.repass.sendKeys("Vino@123");
		loginpage.pincode.sendKeys("621316");*/
		
		
		
		

	}
	
	/*public void State() throws InterruptedException {
		PageFactory.initElements(driver,loginpage.class);
		loginpage.state.click();
		Thread.sleep(2000);
		List<WebElement>dropdown =driver.findElements(By.xpath("//ul[@id='Rform:state_items']//following::li"));
		for (WebElement webElement :dropdown)
  		{
  			String dropDown1 =webElement.getText();
  			if(dropDown1.contains("CAR"))
  			
  			{
  				webElement.click();
  				break;
  			}
  			
  		}
  		Thread.sleep(5000);
  		}*/

		
	
	public void vehicledetails() throws InterruptedException
	{
		PageFactory.initElements(driver,loginpage.class);
		testcase=extentReport.createTest("Verify Category TestCAses");
		testcase.log(Status.PASS,"Successfully clicked Category");
		testcase.log(Status.INFO,"Actual Result:Car Option Clicked");
    
          loginpage.category.click();
          Thread.sleep(2000);
  		List<WebElement> dropdown=driver.findElements(By.xpath("//ul[@id='Rform:categoryFK_items']//following::li"));
  		for (WebElement webElement :dropdown)
  		{
  			String dropDown1 =webElement.getText();
  			if(dropDown1.contains("CAR"))
  			
  			{
  				webElement.click();
  				break;
  			}
  			
  		}
  		Thread.sleep(5000);
  		}
	public void Brand() throws InterruptedException
	{
		testcase=extentReport.createTest("Testing Brand TestCases");
		testcase.log(Status.PASS,"Successfully clicked Brand");
		loginpage.brand.click();
		Thread.sleep(3000);
		List<WebElement>model =driver.findElements(By.xpath("//ul[@id='Rform:brandFk_items']//following::li"));
		int position=0;
		for (WebElement webelemnet :model)
		{
			position++;
			if(position==5)
			{
				webelemnet.click();
			}
		}
		Thread.sleep(3000);

	}
	public void model() throws InterruptedException
	{
		testcase=extentReport.createTest("Testing Model Testcases");
		testcase.log(Status.PASS,"Successfully clicked Model");
		loginpage.Model.click();
		Thread.sleep(5000);
		List<WebElement>model =driver.findElements(By.xpath("//ul[@id='Rform:modelFK_items']//following::li"));
		int position=0;
		for (WebElement webelemnet :model)
		{
			position++;
			if(position==5)
			{
				webelemnet.click();
			}
		}
		
		loginpage.Registration.sendKeys("TN000890");
		testcase=extentReport.createTest(" Testing Registration number");
		testcase.log(Status.PASS, "successfully enter the Registration number");
		loginpage.Varient.sendKeys("varient590");
		testcase=extentReport.createTest("Testing Varient Fileld");
		testcase.log(Status.PASS,"Successfully Varient Filed enter");
	/*	loginpage.Bussiness.sendKeys("Own Bussiness");
		loginpage.Showroom.sendKeys("Complecx");
		loginpage.showAdd.sendKeys("Trichy_viralimalai");*/
		loginpage.next.click();
		Thread.sleep(2000);
		testcase=extentReport.createTest("Testing Vehicle detail screen");
		testcase.log(Status.PASS,"Vehicle details saved successfully");
		/*loginpage.VEHICLE.click();
		Thread.sleep(2000);*/
		
		
	}
	public void SelectBody() throws InterruptedException
	{
		loginpage.BodyType.click();
		Thread.sleep(3000);
		List<WebElement> Select =driver.findElements(By.xpath("//ul[@id='Rform:j_idt93_items']//following::li"));
		int position=0;
		for(WebElement webElement :Select)
		{
			position++;
			if(position==5)
			{
				webElement.click();
				break;
			}
		}
	}
	public void FuleType() throws InterruptedException
	{
		loginpage.FuleType.click();
		Thread.sleep(3000);
		List<WebElement>Fuletype=driver.findElements(By.xpath("//ul[@id='Rform:j_idt98_items']//following::li"));
		int position=0;
		for (WebElement webElement:Fuletype)
		{
			position++;
			if(position==2)
			{
				webElement.click();
				break;
			}
		}
	
	}
	
	public void Calender() throws InterruptedException
	{
		loginpage.Calender.click();
		Thread.sleep(1000);
		WebElement year =driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]"));
		Select select = new Select(year);
		select.selectByIndex(10);
		WebElement Month =driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select select1 = new Select(Month);
		select1.selectByIndex(4);
		loginpage.date.click();
		Thread.sleep(1000);
		loginpage.ChassisNo.sendKeys("UH06708");
		loginpage.Engineno.sendKeys("TYU80099");
		loginpage.NumOwn.sendKeys("2");
		loginpage.Dis.sendKeys("100");
		loginpage.Savebutton.click();
		testcase=extentReport.createTest("Testing Vehicle Vehicle condition second Screen");
		testcase.log(Status.PASS,"Successfully enter the vehicle details");
	}
	public void Vehicle_Function() throws InterruptedException
	{
		
		PageFactory.initElements(driver,loginpage.class);
		loginpage.Tyres.sendKeys("10");
		Thread.sleep(4000);
		loginpage.Savebutton2.click();
	}
	
	public void Photo_Video() throws InterruptedException
	{
		
	loginpage.Document.click();
		Thread.sleep(3000);
		List<WebElement>document=driver.findElements(By.xpath("//ul[@id='Rform:docName_items']//following::li"));
		for(WebElement webElement :document)
		{
			String Text =webElement.getText();
			if(Text.contains("INVOICE"))
			{
				webElement.click();
				break;
			}
		}
		Thread.sleep(2000);
		testcase=extentReport.createTest("Testing Document Testcases");
		testcase.log(Status.PASS, "Document Upload succesfully");

	}
	
	public void ImageIcon() throws InterruptedException, AWTException
	{
		
		loginpage.pic.click();
		Thread.sleep(2000);
		StringSelection selection = new StringSelection("C:\\Users\\hp\\Downloads\\FireShot\\invoice5.png");
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		loginpage.saveimage.click();
		Thread.sleep(1000);
		loginpage.continuebutton.click();
		testcase=extentReport.createTest("Testing Invoice Document Upload" );
		testcase.log(Status.PASS, "Successfully Uploading Invoice Documnet");
		

	}
	public  void Imageuploading() throws InterruptedException, AWTException, IOException
	{
		loginpage.imageupload.click();
		StringSelection selection = new StringSelection("C:\\Users\\hp\\Downloads\\FireShot\\images (7).jpg");
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		loginpage.ADD.click();
		Thread.sleep(2000);
		loginpage.Savecondition.click();
		loginpage.Auction.click();
		Thread.sleep(2000);
		loginpage.Auctionprice.sendKeys("30000");
		loginpage.Increment.sendKeys("5000");
		testcase=extentReport.createTest("Testing Vehicle imgae testcases");
		testcase.log(Status.PASS, "Successfully uploading images");
		TakesScreenshot screenshot =(TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile =new File("sample.png");
		FileHandler.copy(sourceFile, destinationFile);
		
		
	}
	
	public void Auctionfun() throws InterruptedException
	{
		loginpage.calender2.click();
		Thread.sleep(1000);
		loginpage.date2.click();
		Thread.sleep(1000);
		loginpage.duration.sendKeys("15");
		loginpage.saveiconbutton.click();
		Thread.sleep(2000);
		loginpage.Termcondition.click();
		testcase=extentReport.createTest("push Data Successfully");
		testcase.log(Status.PASS,"push data Successfully " );
		loginpage.Verify.click();
		testcase=extentReport.createTest("Testing Auction Screen Verification");
		testcase.log(Status.PASS," Successfully Auction function Verifyied" );
		testcase=extentReport.createTest("Overview");
		testcase.log(Status.PASS,"Successfully Push data Gaadi mandi.com");
	}
	

	
	@Test
	public void Function() throws InterruptedException, AWTException, IOException
	{
		PageFactory.initElements(driver,loginpage.class);
		LoginScreen();
		
		vehicledetails();
		Brand();
		model();
		SelectBody();
		 FuleType();
		 Calender();
		 Vehicle_Function();
		 Photo_Video();
		 ImageIcon();
		 Imageuploading();
		 Auctionfun();
		

		
	}
	}
