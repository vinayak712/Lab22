package myproject240;
import java.util.ResourceBundle;

public class app {
	public int userlogin(String inuser, String inpwd) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String username = rb.getString("username");
		String password = rb.getString("password");
		
		if(inuser.equals(username) && inpwd.equals(password)) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
