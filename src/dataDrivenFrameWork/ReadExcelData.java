package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData // READING SINGLE DATA
{
	public static void main(String[] args) throws Throwable 
	{
		
		
		//OPen the file in Read mode
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\SeleniumFramework.xlsx");
		
		//Get Control of the file
		Workbook wb = WorkbookFactory.create(fis);
		
		//Go to the particular sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//Go to the particular Row
		Row r = sh.getRow(6);
		
		//Go to the particular cell
		Cell c = r.getCell(1);
		
		//get the Cell String Value
		String val = c.getStringCellValue();
		
		//Print it
		System.out.println(val);
		
//		`````````````````````````````````````````````````````````````````````````````````````````
	
		
		
		
//READING MULTIPLE DATA FROM EXCEL
		
		/*	
		
		for (int i=0; i<10; i++)
		{
			for(int j=0; j<2; j++)
			{
		
			//OPen the file in Read mode
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\SeleniumFramework.xlsx");
			
			//Get Control of the file
			Workbook wb = WorkbookFactory.create(fis);
			
			//Go to the particular sheet
			Sheet sh = wb.getSheet("Sheet1");
			
			//Go to the particular Row
			Row r = sh.getRow(i);
			
			//Go to the particular cell
			Cell c = r.getCell(j);
			
			//get the Cell String Value
			String val = c.getStringCellValue();
			
			//Print it
			System.out.println(val);
			}
			
		}
			
		
		
		
		
		*/
		
		
		
	}
}
