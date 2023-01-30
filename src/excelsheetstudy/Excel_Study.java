package excelsheetstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel_Study {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
	String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println("Value is  "+value);

	}

}
