package Test_Basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_on extends Test_Basicss {
    
	@FindBy(name="userName")
	public WebElement usrname;
	
	@FindBy(name="password")
	public WebElement psname;
	
	@FindBy(name="submit")
	public WebElement subbutton;
	
	public Sign_on() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ussrnam() {
		usrname.sendKeys("Hari");
		psname.sendKeys("12345");
		subbutton.click();
	}
}
