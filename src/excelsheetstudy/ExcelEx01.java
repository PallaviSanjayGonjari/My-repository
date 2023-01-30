package excelsheetstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx01 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
		Sheet sheetdata = WorkbookFactory.create(myfile).getSheet("Sheet1");
		System.out.println("----------------------------------------");
		//cell type--->String
		Cell mycell1 = sheetdata.getRow(0).getCell(0);
		System.out.println("cell data type is  "+mycell1.getCellType());
		System.out.println("Value is = "+mycell1.getStringCellValue());
		System.out.println("----------------------------------------");
		//cell type--->Boolean
		Cell mycell2 = sheetdata.getRow(18).getCell(10);
		System.out.println("Cell data type is  "+mycell2.getCellType());
		System.out.println("Value is = "+mycell2.getBooleanCellValue());
		System.out.println("----------------------------------------");
		//Cell type----> Numeric
		Cell mycell3= sheetdata.getRow(19).getCell(10);
		System.out.println("Cell data type is  "+mycell3.getCellType());
		System.out.println("Value is = "+mycell3.getNumericCellValue());
		System.out.println("----------------------------------------");

	}

}
