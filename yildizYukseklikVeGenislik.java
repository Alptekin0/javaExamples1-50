package projeler3;

import java.util.Scanner;

public class yildizYukseklikVeGenislik {

	public static void main(String[] args) {

		/*
		 * SORU 2 :
		 * 
		 * KLAVYEDEN YUKSEKLİĞİ VE GENİSLİĞİ ALIP YILDIZLARLA YÜKSEKLİK VE GENİSLİĞİ
		 * AYARLANMIS SEKLİ ÇİZME.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Genislik giriniz : ");
		int genislik = input.nextInt();
		System.out.print("Yuksekligi giriniz : ");
		int yukseklik = input.nextInt();

		System.out.println("\n\n");

		for (int counter = 1; counter <= genislik; counter++) {

			System.out.print("* ");
			if (counter == genislik) {
				System.out.println();
				for (int counnter2 = 0; counnter2 < yukseklik - 2; counnter2++) {
					System.out.print("*");
					for (int counter3 = 1; counter3 <= genislik * 2 - 3; counter3++) {
						System.out.print(" ");
					}
					System.out.println("*");
				}

			}

		}

		for (int counter = 0; counter < genislik; counter++) {
			System.out.print("* ");
		}

	}

}
