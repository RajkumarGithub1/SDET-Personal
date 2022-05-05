package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel 
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
		Row r = sh.getRow(3);
		
		//Prepare the Particular cell
		Cell c = r.createCell(2);
		
		//Set the cell string value
		c.setCellValue("Raghavendra vinay");
		
		//open the file in write mode
		FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\SeleniumFramework.xlsx");
		
		//save the file
		wb.write(fos);
		
		//Print msg for confirmation
		System.out.println("Done Writing, Saved");
		
		
		
		
		
	}
}
