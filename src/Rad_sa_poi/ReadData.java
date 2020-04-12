package Rad_sa_poi;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("MOCK_DATA.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		 Iterator<Row> rowIt = sheet.iterator();

		    while(rowIt.hasNext()) {
		      Row row = rowIt.next();

		      // iterate on cells for the current row
		      Iterator<Cell> cellIterator = row.cellIterator();

		      while (cellIterator.hasNext()) {
		        Cell cell = cellIterator.next();
		        System.out.print(cell.toString() + ";");
		      }

		      System.out.println();
		    }
		    wb.close();
		    fis.close();
		}
		}
		
	

	
	

