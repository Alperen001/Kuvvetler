import java.util.Scanner;

public class Katlar {

	public static void main(String[] args) {
		int gsayi;
		Scanner inp = new Scanner(System.in);
		System.out.println("S�n�r Say�s�n� Giriniz: ");
		gsayi = inp.nextInt();
		for (int i = 4; i <= gsayi; i*=4) {
			System.out.println("D�rd�n Kuvvetleri: "+ i);
		}
			
		for (int j = 5; j <= gsayi; j*=5) {
			System.out.println("Be�in Kuvvetleri: "+ j);
		}
			
		
	}
}
