package carLoan;
import org.testng.annotations.Test;

public class groupExample {
	@Test(groups= {"carloan","smoke"})
	public void enablessss() {
		System.out.println("enablesss");
	}

	@Test(groups= {"carloan","regression"})
	public void enablessss2() {
		System.out.println("enable text");
	}
	@Test
	public void enablessss3() {
		System.out.println("test");
	}


}
