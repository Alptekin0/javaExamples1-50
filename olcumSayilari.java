package projeler2;

import java.util.Scanner;

public class olcumSayilari {

	public static void main(String[] args) {
		
		/*
		      SORU 31 : 
		      
		      OLÇÜM SAYISI VE OLÇÜM GİRİLEN BİR UYGULAMA ÖLÇÜM 0 GİRİLİNCE BİTİYOR.
		      OLCUM SAYISI BİTTİKTEN SONRA ARA TOPLAM TÜM OLCUMLER BİTTİKTEN SONRA GENEL TOPLAM VERİLİR.
		      
		 */

		Scanner input = new Scanner(System.in);

		double araToplam = 0;
		double genelToplam = 0;
		double olcumSayisi = 1;

		while (olcumSayisi != 0) {
			
			System.out.printf("\n\nOLCUM SAYISI : ");
			olcumSayisi = input.nextInt();

			for (int counter = 0; counter < olcumSayisi; counter++) {

				System.out.printf("olcum giriniz : ");
				Double olcum = input.nextDouble();
				araToplam += olcum;
			}
			System.out.printf("\nAra toplam = %.2f", araToplam);
			genelToplam += araToplam;
			araToplam = 0;
		}

		System.out.println("\n\nGENEL TOPLAM = " + genelToplam);

	}

}
