package carLoan;
import org.testng.annotations.Test;

public class dependingOnmethod {
	@Test(dependsOnMethods="enables2")
	public void enables1() {
		System.out.println("1");
	}

	@Test
	public void enables2() {
		System.out.println("2");
	}
	@Test
	public void enables3() {
		System.out.println("3");
	}


}
