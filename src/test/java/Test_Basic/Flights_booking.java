package Test_Basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flights_booking extends Test_Basicss {

	@FindBy(linkText ="Flights")
	public WebElement flight;
	
	@FindBy(name="tripType")
	public WebElement trip;
	
	
	@FindBy(name="passCount")
	public WebElement count;
	
	@FindBy(name="fromPort")
    public WebElement port;
	
	@FindBy(name="fromMonth")
	public WebElement month;
	
	@FindBy(name="fromDay")
	public WebElement day;
	
	@FindBy(name="toPort")
	public WebElement mont;
	
	@FindBy(name="toMonth")
	public WebElement mon;
	
	@FindBy(name="toDay")
	public WebElement mo;
	
	@FindBy(name="servClass")
	public WebElement firstclss;
	
	@FindBy(name="airline")
    public WebElement Airlinee;
	
	@FindBy(name="findFlights")
	public WebElement submitt;
	
	Flights_booking(){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void flightdetails() {
		
		flight.click();
		trip.click();
		Select d = new Select(count);
		d.deselectByIndex(1);
		
		Select a = new Select(port);
		a.deselectByValue("London");
		
		Select b = new Select(month);
		b.selectByVisibleText("May");
		
		
		Select x = new Select(day);
		x.selectByValue("9");
		
		Select l = new Select(mont);
		l.selectByVisibleText("New York");
		

		Select p = new Select(mon);
		p.selectByVisibleText("June");
		
		
		Select o = new Select(mo);
		o.selectByValue("9");
		
	}
	
	public void preferences() {
		
		firstclss.click();
		Select h = new Select(Airlinee) ;
		h.selectByVisibleText("unified Airlines");
		
		submitt.click();
		
	}
	
	
	
}
