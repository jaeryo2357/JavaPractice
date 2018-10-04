package Practice2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SMTP {

	static String email;
	static String pwd;
	
	static {
		Properties properties = new Properties();
		try {
		InputStream in=SMTP.class.getClassLoader().getResourceAsStream("res/Email.properties");
		properties.load(in);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		email= properties.getProperty("Email");
		pwd=properties.getProperty("pwd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(email);
		System.out.println(pwd);
	}

}
