package Rad_sa_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Citanje {

	public static void main(String[] args) throws IOException {
		//pravimo kod da bi iscitali vrednosti iz excel fajla
		//Input znaci da se radi iscitavanje na nekoj putanji
		FileInputStream fis = new FileInputStream("proba1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//pozivamo sheet po indeksu a ne po nazivu
		//opet indeksi idu od 0
		XSSFSheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		//ovom linijom koda samo nasu celiju tj vrednost njenu uzimamo kao numericku
		//ispisana je u double
		//cell.getNumericCellValue();
		//ova metoda vraca neku vrednost
		double x = cell.getNumericCellValue();
		System.out.println(x);
		// da bi se cell ispisala sledeca linija koda mora da se napise
		System.out.println(cell.toString());
		

	}

}
