package Rad_sa_poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Upis {

	
	public static void main(String[] args) {
	//XSSF - .xlsx(ovo je moja verzija)	
	//starije verzije excela ima ekstenziju
		//HSSF - .xls
		//wb je skracenica od work book
		XSSFWorkbook wb = new XSSFWorkbook();
	
		//unutar sheeta dajemo naziv shita,tj ime shita(excel program)
		XSSFSheet sheet = wb.createSheet("Sheet1");
		//ime nase kolone je row
		//row ne pocinje od 1 u excelu,a pisemo 0 u createRow metodi
		//jer kao i kod niza i kod liste poicije pocinju od 0
		Row row = sheet.createRow(0);
		//kolone se ne pozivaju prema A,B,C nego prema indeksima 0,1,2
		// ovde vrednost 0 je ustv red A iz eksela
		//da bi dosli do celije sve prethodne linije koda moramo da pisemo
		//moraju biti ispisane bas ovim redosledom
		Cell cell = row.createCell(0);
		//za unosenje teksta u celiju
		//selenium se koristi za cuvanje id,username,pass.
		cell.setCellValue("id");
		// na ovaj nacin smo napravili jos jednu celiju
		// red je vec ranije definisan
		cell = row.createCell(1);
		cell.setCellValue("Username");
		//fos je skracenica od nase klase
		//ova klasa ocekuje exception 
		try {
			//ovaj deo od try ide automatski
			//ovako definisan file ce biti kreiran u projektu(proba1.xlsx)
			//to je relativna putanja
			FileOutputStream fos = new FileOutputStream("proba1.xlsx");
			//treba da se napise objekat ove klase u write metodi
			wb.write(fos);
			wb.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
