package dataDriven.java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;

import com.mysql.cj.result.Row;
import org.apache.poi.ss.usermodel.*;

public class readDatafromexcel {

	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Chinmayi Avinish\\Documents\\Book12.xlsx");
		//step 1:open workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		//step2:get the control of the sheet one
	        org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("sheet1");
	        
	        //step3:get the control of the first row
	      org.apache.poi.ss.usermodel.Row Row=sh.getRow(2);
	      
	      
	      //step4:get the control of second cell and copy the data
	        Cell cell = Row.getCell(2);
	   String  data=cell.getStringCellValue();
	   System.out.println(data);
	   
	        //step5: clos the workbook
	   wb.close();
		
		}
	
	
	
	
}
