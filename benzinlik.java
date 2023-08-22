package projeler3;

import java.util.Scanner;

public class benzinlik {

	public static void main(String[] args) {
		
		
		/* 
		    SORU 39 : 
		   
		   BENZİLİĞE GELEN ARACLARIN ALDIĞI BENZIN SONCUNDA 4 ARABA MARKASINDAN HANGİSİNIN EN FAZLA GELDİĞİ VE EN FAZLA BENZIN ALDIĞI
		   GİBİ DEĞERLERİ HESAPLAYAN PROGRAM.
		  
		  */

		Scanner input = new Scanner(System.in);

		int aracKodu;
		int tutar;
		int reno=0 , mazda=0 , honda=0 , ford=0 ,enBuyuk =0;
		int Treno=0 , Tmazda=0 , Thonda=0 , Tford=0, TenBuyuk=0;


		System.out.println("PROGRAMDAN CIKMAK ICIN MARKA OLARAK 111 GIRINIZ.");
		System.err.println("------------------------------------------------------------------------");

		do {
			System.out.print("Marka , Tutar giriniz : ");
			aracKodu = input.nextInt();
			tutar = input.nextInt();
			
			
			switch (aracKodu) {
			case 1:
				reno++;
				Treno +=tutar;
				break;
			case 2:
				mazda++;
				Tmazda += tutar;
				break;
			case 3:
				honda++;
				Thonda +=tutar;
				break;
			case 4:
				ford++;
				Tford +=tutar;
				break;
			case 111:
				break;

			default:
				System.out.println("YANLIS ARAC KODU GIRDINIZ TEKRAR GIRINIZ.!");
				break;
				
			}
			if (reno>enBuyuk) {
				enBuyuk = reno;
			}
			if (mazda>enBuyuk) {
				enBuyuk = mazda;
			}
			if (honda>enBuyuk) {
				enBuyuk = honda;
			}
			if (ford>enBuyuk) {
				enBuyuk = ford;
			}
			if (Treno>TenBuyuk) {
				TenBuyuk = Treno;
			}
			if (Tmazda>TenBuyuk) {
				TenBuyuk = Tmazda;
			}
			if (Thonda>TenBuyuk) {
				TenBuyuk = Thonda;
			}
			if (Tford>TenBuyuk) {
				TenBuyuk = Tford;
			}
			
		} while (aracKodu != 111);
		
		System.err.println("\n\nPROGRAM SONA ERDI.\n\n");
		
		
		System.err.println("OZET BILGILER");
		
		if (reno==enBuyuk) {
			System.out.println("En cok gelen arac markasi : Renault (" +enBuyuk+" kez)");
		}
		if (mazda==enBuyuk) {
			System.out.println("En cok gelen arac markasi : Mazda ("+enBuyuk+" kez)");
		}
		if (honda==enBuyuk) {
			System.out.println("En cok gelen arac markasi : Honda ("+enBuyuk+" kez)");
		}
		if (ford==enBuyuk) {
			System.out.println("En cok gelen arac markasi : Ford ("+enBuyuk+" kez)");
		}
		
		
		if (Treno==TenBuyuk) {
			System.out.println("En cok satis yapilan arac : Renault ("+TenBuyuk+" tl)");
		}
		if (Tford==TenBuyuk) {
			System.out.println("En cok satis yapilan arac : Ford ("+TenBuyuk+" tl)");
		}
		if (Tmazda==TenBuyuk) {
			System.out.println("En cok satis yapilan arac : Mazda ("+TenBuyuk+" tl)");
		}
		if (Thonda==TenBuyuk) {
			System.out.println("En cok satis yapilan arac : Honda ("+TenBuyuk+" tl)");
		}
		
		

	}

}
