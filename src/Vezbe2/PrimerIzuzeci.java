package Vezbe2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimerIzuzeci {

	public static int ucitajInt() throws InterruptedException,InputMismatchException {
		//samo thwors rec da nemamo deo u kod try-catch
	//	try {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			try {
			//ako unesemo samo pogresan tip podataka,ceo deo sa nizom se nece izvrsiti
			//odmah se prelazi u catch
			//preskace se catch 2,nakon toga
			//izvrsice se u main metodi sout 
			int niz[] = new int[3];
			niz[0] = 20;
			niz[1] = 5;
			niz[2] = 10;
			//niz[3] = 12;
			//vreme za koje zelimo da stopiramo izvrsavanje naseg programa
			Thread.sleep(1000);
			return x;
			// ovde u zagradi korisimo bas ovaj metod jer je to onaj koji je ispisan u konzoli
		}/* catch (InputMismatchException e) {
			System.out.println("Pogresan tip podataka je unet...");
		} */catch(ArrayIndexOutOfBoundsException e){
			System.out.println("prevazilazi granice niza");	
		} catch(Exception e) {
			//definise sve moguce exceptione koji mogu da se dese
			//pa ove gore ne b morali da pisemo
			//mora bas na ovom mestu da bude napisan
			System.out.println(".....");
		}
			
			finally {
				// na kraju neke metode,svakako se izvrsava
				//bez obzira na to da li je postojala greska
				// dobro je iz try catch kodova da utvrdimo da je kod dalje nastavio da se izvrsva
				//spada takodje u blokove
				//svakako radi nezavisno od sintakse try i catch
				System.out.println("dfsfs");
			}
		return -1;	
	}
	
	public static void main(String[] args) throws InputMismatchException, InterruptedException {
		// samo smo pozvali metodu
		//kada pozivamo metodu moramo da pozovemo i expectione
		ucitajInt();
		System.out.println("Nakon catch metode...");
		
		
	}

}
