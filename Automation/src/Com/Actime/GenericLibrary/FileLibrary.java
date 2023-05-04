package Com.Actime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains all the generic methods of both property file 
 * @author Monu
 *
 */

public class FileLibrary {
	public String path = "./Testdata/commondata.property";
	public String path1 = "./Testdata/Testdata.xlsx";
	
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	
//	new
	public String readDataFromExcelFile (String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(path1);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(Sheetname);
		Row ro = sheet.getRow(row);
		Cell ce = ro.getCell(cell);
		String data = ce.getStringCellValue();
		//String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
		

}
