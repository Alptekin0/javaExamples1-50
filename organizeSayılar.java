package projeler2;

import java.util.Scanner;

public class organizeSayılar {

	public static void main(String[] args) {
		
		/*
		     SORU 18:
		     
		     BASAMAKLARININ FAKTORIYELİNİN TOPLAMINA EŞİT OLAN SAYILARA ORGANİZE SAYILAR DENİR.
		     
		     ORNEK : 
		      145 = 1! + 4! + 5!
		      40585 = 4! + 0! + 5! + 8! + 5!
		     
		     */
		
		
		Scanner input = new Scanner(System.in);

		System.out.print("sayi giriniz : ");

		int sayi = input.nextInt();

		int basamaklar, basamakFaktoriyeli = 1, basamakFaktoriyeliToplamı = 0;
		int temp = sayi;
		
		while (temp != 0) {
			basamaklar = temp % 10;
			temp = temp / 10;

			if (basamaklar == 0) {
				basamakFaktoriyeli = 1;
			} 
			else {
				while (basamaklar != 1) {
					basamakFaktoriyeli *= basamaklar;
					basamaklar--;
				}

			}

			basamakFaktoriyeliToplamı += basamakFaktoriyeli;
			basamakFaktoriyeli = 1;
		}
		
		if (basamakFaktoriyeliToplamı == sayi) {
			System.out.println("\n"+sayi +" ORGANIZE BIR SAYIDIR.\nBasamaklar faktoriyeli toplami : "+basamakFaktoriyeliToplamı);
		}
		else {
			System.out.println("\n"+sayi +" ORGANIZE BIR SAYI DEGILDIR.\nBasamaklar faktoriyeli toplami : "+basamakFaktoriyeliToplamı);
		}

	}

}
