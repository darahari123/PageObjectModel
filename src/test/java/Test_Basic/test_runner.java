package Test_Basic;

public class test_runner {

	public static void main(String[] args) {
		RegisterPage.login();
		
		RegisterPage x =new RegisterPage();
		x.Registerpage();
		x.contactinformation();
		x.mailinginformation();
		x.UserInfo();
		
		Sign_on y =new Sign_on();
		y.ussrnam();
		
		Flights_booking q = new Flights_booking();
		q.flightdetails();
		q.preferences();
		
		

	}

}
