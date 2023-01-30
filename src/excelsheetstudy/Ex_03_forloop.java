package excelsheetstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_03_forloop 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		//How to read whole row when -----> Cell is varying and row is constant
		System.out.println("----------------------------------------");
		//By using for loop
		for(int cell=0;cell<=3;cell++)
		{
			String myValue = mySheet.getRow(0).getCell(cell).getStringCellValue();
			System.out.print(myValue+"  ");
			
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		//How to read whole row when -----> Row is varying and cell is constant
		
		for(int row=0;row<=6;row++)
		{
			String myvalue = mySheet.getRow(row).getCell(0).getStringCellValue();
			System.out.println(myvalue+"  ");
		}
		
		System.out.println("----------------------------------------");
	}
}
