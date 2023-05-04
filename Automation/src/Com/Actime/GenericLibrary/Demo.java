package Com.Actime.GenericLibrary;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		FileLibrary f = new FileLibrary();
		String data = f.readDataFromPropertyFile("password");
		String url = f.readDataFromPropertyFile("url");
		System.out.println(data);
		System.out.println(url);
		
		String bank = f.readDataFromExcelFile("Sheet1", 2, 1);
		String Domain = f.readDataFromExcelFile("Sheet1", 3, 2);
		System.out.println(bank);
		System.out.println(Domain);
		
	}

}
