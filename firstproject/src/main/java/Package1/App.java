package Package1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException
    {
//    	perform read/write operations from excel file
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter file name : ");
    	String filename=sc.nextLine();
    	
    	Workbook wb = new XSSFWorkbook();
    	FileOutputStream fis= new FileOutputStream(filename);
    	
    	Sheet sheet=wb.createSheet("Sheet1");
    	
    	Row headerrow= sheet.createRow(0);
    	headerrow.createCell(0).setCellValue("ID");
    	headerrow.createCell(1).setCellValue("Name");
    	headerrow.createCell(2).setCellValue("Age");
    	
    	Row row1 = sheet.createRow(1);
    	row1.createCell(0).setCellValue("101");
    	row1.createCell(1).setCellValue("Jai");
    	row1.createCell(2).setCellValue("23");
    	
    	Row row2 = sheet.createRow(2);
    	row2.createCell(0).setCellValue("102");
    	row2.createCell(1).setCellValue("Manish");
    	row2.createCell(2).setCellValue("24");
    	
    	wb.write(fis);
    	System.out.println("Excel File Created Successfully!!");
    	
    	fis.close();
    }
}