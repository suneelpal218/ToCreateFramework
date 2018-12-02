package carLoan;
import org.testng.annotations.Test;

public class enable {
	@Test(enabled=false)
	public void enablessss() {
		System.out.println("enablesss");
	}

	@Test(timeOut=5000)
	public void enablessss2() {
		System.out.println("enable text");
	}
	@Test
	public void enablessss3() {
		System.out.println("test");
	}


}
