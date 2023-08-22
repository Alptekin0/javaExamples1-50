package projeler;

import java.util.Scanner;

public class otoparkUcretlendirme {

	public static void main(String[] args) {
		
		/*
		     SORU 14:
		      
		     OTOPARK UCRETLENDIRME ARAC KODU VE KADLIGI SAAT ALINIP İŞLEMLER YAPILIYOR.
		     4 TÜR ARAC VE KODLARI VAR.
		     KALINAN SURELER 0 SAATTEN BASLAYIP 11 SAAT VE USTUNE KADAR UCRETLENDIRMELER VAR.
		      
		     ---> ARAC KODUNA SIFIR (0) GİRİLİNCE UYGULAMA SONA ERİYOR.
		      
		     GUNDE KAC ARAC GİRİŞ YAPMIŞ VE GUNLUK KÂR ARAC KODUNA SIFIR (0) GİRİLİP KOD SONA ERİNCE EKRANA YAZDIRILIYOR.
		     
		     KODDA HATA DENETİMİ YAPILMIŞTIR. ARAC KODU VEYA KALINAN SAAT YANLIŞ GİRİLİNCE UYARI VERİP YENİDEN İSTENİYOR. 
		     
		 */
		
		Scanner input = new Scanner(System.in);
		
		int aracKodu , kalinanSure;
		
		double carpansızUcret = 1, ucret =0;
		
		int motorsiklet = 0, otomobil = 0, minibus = 0, otobus = 0; 
		
		do {
			
			System.out.print("arac kodunu giriniz : ");
			aracKodu = input.nextInt();
			
			while (aracKodu >= 5 || aracKodu < 0) {
				System.out.print("HATALI ARAC KODU GIRDINIZ TEKRAR GIRINIZ : ");
				aracKodu = input.nextInt();
			}
			
			if (aracKodu ==0) {
				break;
			}
			
			System.out.print("Kalinan sureyi giriniz : ");
			kalinanSure = input.nextInt();
			
			
			while (kalinanSure <= 0) {
				System.out.print("HATALI KALINAN SURE GIRDINIZ TEKRAR GIRINIZ: ");
				kalinanSure = input.nextInt();
			}
			
			if (kalinanSure > 0 && kalinanSure <= 2) {
				carpansızUcret = 15;
				}
			else if (kalinanSure >= 3 && kalinanSure <= 6) {
				carpansızUcret = 25.50;
			}
			else if (kalinanSure >= 7 && kalinanSure <= 10) {
				carpansızUcret = 30;
				
			}
			else if (kalinanSure >= 11) {
				carpansızUcret = 37.50;
			}
			
			
			
			switch (aracKodu) {
			case 1:
				ucret += carpansızUcret * 0.5;
				motorsiklet++;
				break;
			case 2:
				ucret += carpansızUcret * 1;
				otomobil++;
				break;
			case 3:
				ucret += carpansızUcret * 1.5;
				minibus++;
				break;
			case 4:
				ucret += carpansızUcret * 2;
				otobus++;
				break;
			default:
				break;
			}
			
		} while (aracKodu != 0);
		
		System.err.printf("\n\n \t\t\t BUGUN GELEN ARACLAR VE TOPLAM KAZANILAN UCRET : ");
		
		System.err.printf("\n\n MOTOSIKLET : %d  \n OTOMOBIL : %d \n MINIBUS : %d \n OTOBUS : %d \n ",motorsiklet,otomobil,minibus,otobus);
		
		System.err.printf("\n\n\n BUGUN KAZANLINAN TOPLAM PARA : %.2f TL",ucret);
		
	}

}
