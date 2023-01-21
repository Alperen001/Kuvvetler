import java.util.Scanner;

public class Katlar {

	public static void main(String[] args) {
		int gsayi;
		Scanner inp = new Scanner(System.in);
		System.out.println("Sýnýr Sayýsýný Giriniz: ");
		gsayi = inp.nextInt();
		for (int i = 4; i <= gsayi; i*=4) {
			System.out.println("Dördün Kuvvetleri: "+ i);
		}
			
		for (int j = 5; j <= gsayi; j*=5) {
			System.out.println("Beþin Kuvvetleri: "+ j);
		}
			
		
	}
}
