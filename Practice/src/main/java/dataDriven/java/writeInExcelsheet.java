package dataDriven.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeInExcelsheet {
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Chinmayi Avinish\\Documents\\Book12.xlsx");
		
		//open the workbook
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh1 = wb.getSheet("sheet1");
		 Row row1 = sh1.getRow(5);
		 
		Cell cell = row1.createCell(2);
		 cell.setCellValue("rcv academy");
		 System.out.println(cell.getStringCellValue());
		 
		//open the same workbook in read mode and save the file
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Chinmayi Avinish\\Documents\\Book12.xlsx");
		wb.write(fout);
		wb.close();
		fout.close();
		System.out.println("file created");
		
	}

}
