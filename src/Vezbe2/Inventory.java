package Vezbe2;

//ovde smo importovali lang
// sto znaci da postoji static metoda koju mozemo odmag da pozovemo
// i zato umesto cele sout metode mi pisemo out.println... kao kracu vreziju
//da nismo ovo importovali radili bi kao i uvek sout 
import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;
public class Inventory {

	public static void main(String[] args) {
		// skladiste sa kutijima,gde mi svakoj kutiji zelimo da dodelimo vrednost
		//broj kutije je int ako mi unesemo double poucice program
		final double boxPrice = 3.25;
		
		Scanner keyboard = new Scanner(System.in);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		out.print("How many boxes do we have? ");
		
		String numBoxesIn = keyboard.next();
		
		
			try {
				
				//definisano samo ono za sta postoji mogucnost da izbraci expetion
				int numBoxes = Integer.parseInt(numBoxesIn);
				
				out.print("The value is ");
				//ako unesemo ispravnu vrednost izvrsava se try normalno i onda se prelazi na kod ispod catch
				out.println(currency.format(numBoxes * boxPrice));
				//sa ovim parametrom u zagradi ne radimo nista
				//to je objeakt,gde je e objekat neke klase sa metodama
				//sa njima mozemo da baratamo
			} catch (NumberFormatException e) {
				//e.printStackTrace();
				//umesto ovoga mozemo da korisitimo
				out.println("This is not integer number");
			}
			// ovaj sout ce se izvrsiti zahvaljujuci catch delu koda
			// i ako je pre toga doslo do greske
			System.out.println("Text .....");
			
			keyboard.close();

	}

}
