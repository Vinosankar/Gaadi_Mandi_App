package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
	@FindBy(id="Rform:j_idt13")
	public static WebElement Loginicon;
	@FindBy(xpath="//div[@class='auc_port_logintabinner']/button[2]")
	public static WebElement Loginid;
	@FindBy(id="Rform:email")
	public static WebElement Emailid;
	@FindBy(id="Rform:password")
	public static WebElement Password;
	@FindBy(id="Rform:btnSearch")
	public static WebElement Loginbutton;
	/*@FindBy(id="Rform:j_idt20")
	/*public static WebElement Admin;
	@FindBy(xpath="//*[@id=\'Rform:subdetails\']/button")
	public static WebElement Subplan;
	
	@FindBy(id="Rform:j_idt18")
	public static WebElement Register;
	@FindBy(id="Rform:mobile")
	public static WebElement moblie;
	@FindBy(xpath="//*[@id=\'Rform:state\']/div[3]")
	public static WebElement state;
	@FindBy(id="Rform:loc_input']")
	public static WebElement location;
	@FindBy(id="Rform:pc']")
	public static WebElement pincode;
	@FindBy(id="Rform:email']")
	public static WebElement email;
	@FindBy(id="Rform:password']")
	public static WebElement password;
	@FindBy(id="Rform:passwordnew']")
	public static WebElement repass;
	@FindBy(xpath="//*[@id=\'Rform:bt\']/div[3]/span")
	public static WebElement buyertype;
	@FindBy(xpath="//*[@id=\'Rform:interestIn\']/div[3]")
	public static WebElement indiducal;
	@FindBy(xpath="//*[@id=\'Rform:j_idt170\']/span[2]")
	public static WebElement next;*/
	@FindBy(id="Rform:j_idt47")
	public static WebElement Sell;
	/*@FindBy(xpath="//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active']/span")
	public static WebElement professtional;
	@FindBy(id="Rform:j_idt78")
	public static WebElement proceed;*/
	@FindBy(xpath="//*[@id='Rform:loc_input']")
	public static WebElement Location;
	
	@FindBy(xpath="//*[@id=\'Rform:categoryFK\']/div[3]/span")
	public static WebElement category;
	@FindBy(xpath="//*[@id=\'Rform:brandFk\']/div[3]")
	public static WebElement brand;
	@FindBy(xpath="//*[@id=\'Rform:modelFK\']/div[3]")
	public static WebElement Model;
	
	@FindBy(id="Rform:Trim")
	public static WebElement Varient;
	@FindBy(id="Rform:regNo")
	public static WebElement Registration;
	/*@FindBy(id="Rform:business")
	public static WebElement Bussiness;
	@FindBy(id="Rform:ShowroomName")
	public static WebElement Showroom;
	@FindBy(id="Rform:ShowroomAdd")
	public static WebElement showAdd;*/
	
	@FindBy(id="Rform:j_idt114")
	public static WebElement next;
/*	@FindBy(id="Rform:vCnditionGo1")
	public static WebElement VEHICLE;*/
	@FindBy(xpath="//*[@id=\'Rform:j_idt93\']/div[3]")
	public static WebElement BodyType;
	@FindBy(xpath="//*[@id=\'Rform:j_idt98\']/div[3]")
	public static WebElement FuleType;
	@FindBy(xpath="//*[@id=\'Rform:taxval\']/button/span[1]")
	public static WebElement Calender;
	
	@FindBy(xpath="//tbody//tr[3]//td[5]")
	public static WebElement date;
	@FindBy(id="Rform:chesisNo")
	public static WebElement ChassisNo;
	@FindBy(id="Rform:engineNo")
	public static WebElement Engineno;
	@FindBy(id="Rform:numberOfOwn")
	public static WebElement NumOwn;
	@FindBy(id="Rform:dis")
	public static WebElement Dis;
	@FindBy(id="Rform:j_idt177")
	public static WebElement Savebutton;
	@FindBy(id="Rform:j_idt266")
	public static WebElement Tyres;
	@FindBy(id="Rform:j_idt290")
	public static WebElement Savebutton2;

	@FindBy(xpath="//*[@id=\'Rform:docName\']/div[3]")
	public static WebElement Document;

	@FindBy(xpath="//*[@id=\'Rform:fileUpload\']/div[1]/span") 
	public static WebElement pic;
	@FindBy(id="Rform:j_idt305")
	public static WebElement saveimage;
	@FindBy(id="Rform:j_idt317")
	public static WebElement continuebutton;
	@FindBy(xpath="//*[@id=\'Rform:fileuploadde2\']/div[1]/span")
	public static WebElement imageupload;
	
	@FindBy(id="Rform:theButton")
	public static WebElement ADD;
	@FindBy(id="Rform:j_idt340")
	public static WebElement Savecondition;
	@FindBy(xpath="//*[@id=\'Rform:seell\']/div/div[2]/div/div[2]/span")
	public static WebElement Auction;
	@FindBy(id="Rform:AucPrice")
	public static WebElement Auctionprice;
	@FindBy(id="Rform:minInc")
	public static WebElement Increment;
	@FindBy(xpath="//*[@id=\'Rform:auctionStartsfrom\']/button/span[1]")
	public static WebElement calender2;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a") 
	public static WebElement date2;
	@FindBy(id="Rform:bidDur")
	public static WebElement duration;
	@FindBy(id="Rform:j_idt340")
	public static WebElement saveiconbutton;
	@FindBy(xpath="//*[@id=\'Rform:condition\']/div[2]/span")
	public static WebElement Termcondition;
	@FindBy(xpath="//*[@id=\'Rform:j_idt426\']/span[2]")
	public static WebElement Verify;

}
