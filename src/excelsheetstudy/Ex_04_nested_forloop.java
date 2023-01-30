package excelsheetstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_04_nested_forloop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

File myfile=new File("G:\\velocity\\Automation notes\\MyDataSheet.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		//How to read row and cells simultaneously--having same data type
		//String Data Type
		System.out.println("---------------------------------------------------------------");
		System.out.println("String type data ");
		System.out.println("---------------------------------------------------------------");
		for(int row=0;row<=6;row++)
		{
			for(int cell=0;cell<=3;cell++)
			{
				String myvalue = mySheet.getRow(row).getCell(cell).getStringCellValue();
				System.out.print(myvalue+"   ");
				
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Numeric type data ");
		System.out.println("---------------------------------------------------------------");
		//Numeric Data Type
				for(int row=9;row<=17;row++)
				{
					for(int cell=4;cell<=8;cell++)
					{
						double myvalue = mySheet.getRow(row).getCell(cell).getNumericCellValue();
						System.out.print(myvalue+"   ");
						
					}
					System.out.println();
				}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Boolean type data ");
		System.out.println("---------------------------------------------------------------");
		//Boolean Data type
		for(int row=20;row<=26;row++)
		{
			for(int cell=0;cell<=3;cell++)
			{
				boolean myvalue = mySheet.getRow(row).getCell(cell).getBooleanCellValue();
				System.out.print(myvalue+"   ");
				
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Reading data having different DataType");
		System.out.println("---------------------------------------------------------------");
		
		for(int row=18;row<=26;row++)
		{
			for(int cell=10;cell<=13;cell++)
			{
				CellType celltype = mySheet.getRow(row).getCell(cell).getCellType();
				if(celltype==celltype.STRING)
				{
					String myvalue = mySheet.getRow(row).getCell(cell).getStringCellValue();
					System.out.print(myvalue+"   ");
				}
				else if(celltype==CellType.NUMERIC)
				{
					double myvalue = mySheet.getRow(row).getCell(cell).getNumericCellValue();
					System.out.print(myvalue+"   ");
				}
				else if(celltype==CellType.BOOLEAN)
				{
					boolean myvalue = mySheet.getRow(row).getCell(cell).getBooleanCellValue();
					System.out.print(myvalue+"   ");
				}
				
				
			}System.out.println();
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Reading data having different DataType");
		System.out.println("---------------------------------------------------------------");
		for(int row=18;row<=26;row++)
		{
			for(int cell=10;cell<=13;cell++)
			{
				 String myvalue = mySheet.getRow(row).getCell(cell).toString();
				System.out.print(myvalue+"   ");
				
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------");
	}

}
