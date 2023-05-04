package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("./Testdata/commondata.property");
		Properties p= new Properties();
		p.load(f);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		
	}

}
