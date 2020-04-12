package Domaci1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Suma {

	public static void main(String[] args) {
		
		HSSFWorkbook wb;
		FileInputStream fi;
		
		try {
			fi = new FileInputStream("Data (DOM).xls");
			wb = new HSSFWorkbook(fi);
			
			Double s = 0d;
		
			for (int i = 0; i < 13; i++) {
			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			
			String cells = cell.toString();
			Double d = Double.valueOf(cells);
			s =+ d;
			
		}
		
		System.out.println(s);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("...");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("////");
		}
	}
}
		
	
		
		
		
		
		
		
		

	
