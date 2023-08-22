package projeler2;

import java.util.Scanner;

public class harfNotlari {

	public static void main(String[] args) {
		
		
		/*  
		   SORU 28 :
		   
		    A B C VE F DİYE HARF NOTLARI GİRİLECEK A = 4 B = 3 C = 2 F = 0 OLMAK UZERE ORTALAMA VE HANGİ NOTTAN KAC TANE GİRİLDİGİNİ
		    YAZAN KOD.
		    H VEYA h TUSUNA BASILINCA CIKIS YAPILACAK
		    FARKLI BİR HARF GİRME DURUMUNDA GECERSİZ NOT DİYE UYARI VERECEK.
		    
		  */
		
		Scanner input = new Scanner(System.in);
		
		String harfNotu = "";
		double ortalama = 0;
		double aSayac=0 , bSayac=0, cSayac = 0, fSayac=0;
		
		while (!harfNotu.equalsIgnoreCase("h")){
			
			System.out.print("harf notu giriniz (Cikis icin h veya H giriniz) :");
			harfNotu = input.nextLine().toLowerCase();
			
			switch (harfNotu) {
			case "a":
				ortalama += 4;
				aSayac++;
				break;
			case "b":
				ortalama += 3;
				bSayac++;
				break;
			case "c":
				ortalama += 2;
				cSayac++;
				break;
			case "f":
				ortalama += 0;
				fSayac++;
				break;
			case "h":
				break;

			default:
				System.out.println("Gecersiz Not!!");
				break;
			}
			
			
		}
		double girilenNotSayisi = aSayac+bSayac+cSayac+fSayac;
		
		System.err.printf("\n\nGirilen a sayisi : %.0f \nGirilen b sayisi : %.0f \nGirilen c sayisi : %.0f \nGirilen f sayisi : %.0f",aSayac,bSayac,cSayac,fSayac);
		System.err.println("\n\nORTALAMA : "+ ortalama / girilenNotSayisi);
		
	}

}
