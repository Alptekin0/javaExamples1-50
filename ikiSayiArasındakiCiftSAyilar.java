package projeler3;

import java.util.Scanner;

public class ikiSayiArasındakiCiftSAyilar {

	public static void main(String[] args) {

		/*
		  
	    SORU 8:
		
		  
	      KLAVYEDEN GİRİLEN M İLE N SAYILARI ARASINDAKİ ÇİFT SAYILARI BULAN BU ÇİFT
     	  SAYILARIN KAC TANE OLDUĞUNU VE ORTALAMALARINI EKRANA YAZDIRAN PROGRAM.
		  
		  
		 */

		int n, m, sayac = 0, toplam = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("n sayisini giriniz : ");
		n = input.nextInt();
		System.out.print("m sayisini giriniz : ");
		m = input.nextInt();

		System.out.print("\n\nn ile m arasindaki cift sayilar : ");

		for (int counter = n + 1; counter < m; counter++) {

			if (counter % 2 == 0) {
				System.out.print(counter + "  ");
				sayac++;
				toplam += counter;
			}
		}

		System.out.println("\n");

		System.out.println("n ile m arasinda " + sayac + " kadar cift sayi vardir.");

		System.out.println("\nbu cift sayilarin ortalamasi : " + toplam / sayac);

	}

}
