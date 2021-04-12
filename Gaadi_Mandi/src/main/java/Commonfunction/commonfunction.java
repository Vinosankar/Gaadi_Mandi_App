package Commonfunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class commonfunction {
	public static WebDriver driver=null;
	 public static Properties properties=null;
	 
	 public static ExtentReports extentReport;
	 public static ExtentHtmlReporter htmlReporter;
	 public static ExtentTest testcase;
	 
	
	public Properties Gaadi_mandi() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("Configure.properties");
		 properties = new Properties();
		properties.load(fileInputStream);
		return properties;
		
	}
	@BeforeSuite
	public void LunchBrowser() throws IOException
	{
		Gaadi_mandi();
		
		htmlReporter= new ExtentHtmlReporter("Report.html");
		extentReport = new ExtentReports();
		htmlReporter.config().setReportName("Automation Test Result");
		extentReport.attachReporter(htmlReporter);
		String Browser =properties.getProperty("browser");
		
		String URL =properties.getProperty("Url");
		String Driverlocation =properties.getProperty("driverlocation");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Driverlocation);
			driver=new ChromeDriver();
		}
		else
			if(Browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.drivre", Driverlocation);
			    driver = new ChromeDriver();
				
			}
		driver.get(URL);
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		testcase=extentReport.createTest("successfully passed");
		testcase.log(Status.PASS,"Testcases is Success");
	}
	
	@AfterSuite
public void Endbrowser()
{
		extentReport.flush();
}
}
