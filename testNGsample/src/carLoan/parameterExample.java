package carLoan;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterExample {

	@Parameters({ "url", "username", "pass" })
	@Test
	public void toTestUsershouldAbleSelectCarType(String url, String username, String pass) {
		System.out.println(url);
		System.out.println(username);
		System.out.println(pass);
	}

}
