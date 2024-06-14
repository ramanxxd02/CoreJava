package in.co.Execptionhandling;

public class TestCusterLoginEx {

	public static void main(String[] args) throws LoginException    {

		String loginId = null;

		if (loginId == null || loginId != "Raman") {

			throw new LoginException();

		}

		else {
			System.out.println("Login Sucessfully");
		}

	}

}


