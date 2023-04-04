package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFileData {

	public static String fetchDataFromExcelSheet(int row, int cell) throws EncryptedDocumentException, IOException
	{
		String data="";
		
	String path="src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestExcel"+File.separator+"RAHUL.xlsx";
	
	FileInputStream file= new FileInputStream(path);
	
	Cell c= WorkbookFactory.create(file).getSheet("login").getRow(row).getCell(cell);
	      
    CellType type=c.getCellType();
	
    
	
	if(type==CellType.STRING)
	{
	 data=c.getStringCellValue();
	}
	else if(type==CellType.NUMERIC)
	{
		double number=c.getNumericCellValue();
		int num=(int)number;
		//data =String.valueOf(num);
	//data=Double.toString(number);// Double is a wrapper  class of keyword double
		//System.out.println(num);
		data=Integer.toString(num);
		
	}
	else if(type==CellType.BLANK)
	{
	 data=""; // it will not give you null pointer exception
	}
	
	return data;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
