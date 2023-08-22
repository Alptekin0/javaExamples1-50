package projeler3;

import java.util.Scanner;

public class binVeyaDahaBuyuk {

	public static void main(String[] args) {

		/*
		 
	
	   SORU 10 : 
		 
		 KLAVYEDEN 1000 VE YUKARISI BİR SAYI GİRİLENE KADAR GİRİLEN SAYILARIN 
		 BİR BASAMAKLI, İKİ BASAMAKLI, ÜÇ BASAMAKLI OLDUĞUNU BULAN PROGRAM. 
		 
		 
		 */

		int sayi;
		int birBasamakliSAyac = 0, ikiBasamakliSAyac = 0, ucBasamakliSAyac = 0;

		Scanner input = new Scanner(System.in);

		do {

			System.out.print("sayi giriniz : ");
			sayi = input.nextInt();
			int tempSayi = sayi;
			
			int sayiBoluOn = sayi / 10;

			if (sayiBoluOn <= 0) {
				birBasamakliSAyac++;
			} 
			else if (sayiBoluOn > 0 && sayiBoluOn < 10) {
				ikiBasamakliSAyac++;
			} 
			else if (sayiBoluOn >= 10 && sayiBoluOn < 100) {
				ucBasamakliSAyac++;
			}

		} while (sayi < 1000);
		
		System.out.println("\n\n");

		System.err.println("BIR BASAMAKLI SAYILARIN ADEDI : " + birBasamakliSAyac);

		System.err.println("IKI BASAMAKLI SAYILAR ADEDI : " + ikiBasamakliSAyac);

		System.err.println("UC BASAMAKLI SAYILAR ADEDI : " + ucBasamakliSAyac);

	}

}
