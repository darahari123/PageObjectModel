package Test_Basic;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Test_Basicss {
	
	
	@FindBy(linkText="REGISTER")
	public WebElement Link;
	
	@FindBy(name="firstName")
	public WebElement fname;
	
	@FindBy(name="lastName")
	public WebElement Lname;
	
	
	@FindBy(name="phone")
	public WebElement phnno;
	
	
	@FindBy(id="userName")
	public WebElement idname;
	
	@FindBy(name="address1")
	public WebElement address;
	
	@FindBy(name="city")
	public WebElement cityname;
	
	@FindBy(name="state")
	public WebElement statename;
	
	@FindBy(name="postalCode")
	public WebElement postalname;
	
	
	@FindBy(name="country")
	public WebElement countryname;
	
	@FindBy(id="email")
	public WebElement usernames;
	
	@FindBy(name="password")
	public WebElement passname;
	
	@FindBy(name="confirmPassword")
	public WebElement passconfirmname;
	
	@FindBy(name="submit")
	public WebElement subemitname;
	
	@FindBy(linkText ="sign-in")
	public WebElement signbutton;
	
	
	
	
	public  RegisterPage() {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Registerpage() {
		Link.click();
		
	}

	public void contactinformation() {
		
		fname.sendKeys("hari");
		Lname.sendKeys("Krishna dara");
		phnno.sendKeys("7363828822");
		idname.sendKeys("hahsjhs@jsjsjs");
	}
	public void mailinginformation() {
		address.sendKeys("Hno 80-99-3a");
		cityname.sendKeys("kurnools");
		statename.sendKeys("AP");
		postalname.sendKeys("kulluru");
		countryname.sendKeys("India");

	}
	
	
	public void UserInfo() {
		usernames.sendKeys("Hari");
		passname.sendKeys("12345");
		passconfirmname.sendKeys("12345");
		 subemitname.click();
		 signbutton.click();
		
	}
}
