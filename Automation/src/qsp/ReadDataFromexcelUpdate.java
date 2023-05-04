package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromexcelUpdate {

	public static void main(String[] args) throws RuntimeException, IOException {
		FileInputStream fis = new FileInputStream("./Testdata/Testdata.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    wb.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("ICICI_001");
	    FileOutputStream fos= new FileOutputStream("./Testdata/Testdata.xlsx");
	    wb.write(fos);

	}

}
