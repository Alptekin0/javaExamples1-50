package projeler3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class enBuyukİkiSayi {

	public static void main(String[] args) {

		/*
		 * 
		 * SORU 6 :
		 * 
		 * KLAVYEDEN GİRİLEN 10 TANE SAYİ ARASINDA EN BÜYÜK İKİSİNİ YAZDIRAN PROGRAM.
		 * 
		 * 
		 */

		int sayi;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> enBuyukİkiIntegers = new ArrayList<>();

		for (int counter = 0; counter < 10; counter++) {
			System.out.print("10 Tane Sayi Giriniz : ");
			sayi = input.nextInt();

			enBuyukİkiIntegers.add(sayi);
		}

		Collections.sort(enBuyukİkiIntegers);
		Collections.reverse(enBuyukİkiIntegers);

		System.out.println("\n\nGIRILEN 10 SAYI1DAN EN BUYUK IKISI : " + enBuyukİkiIntegers.get(0) + " ve "+ enBuyukİkiIntegers.get(1));

	}

}
