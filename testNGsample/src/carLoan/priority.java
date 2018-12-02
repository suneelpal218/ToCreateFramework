package carLoan;
import org.testng.annotations.Test;

public class priority {
	@Test(priority=3)
	public void enables1() {
		System.out.println("1");
	}

	@Test(priority=1)
	public void enables2() {
		System.out.println("2");
	}
	@Test(priority=2)
	public void enables3() {
		System.out.println("3");
	}


}
