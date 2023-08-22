package projeler3;

import java.util.Scanner;

public class sikletler {

	public static void main(String[] args) {
		
		/*  
		   SORU 37 : 
		   
		   KLAVYEDEN SIFIR GİRLENE KADAR SPORCU AĞIRLIKLARINI ALAN BUNLARI SİKLETLERE AYIRIP SONUC DÖNDÜREN UYGULAMA
		  
		  
		  */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int kilo = 1;
		
		int agırSiklet =0 , ortaSiklet =0 , hafifSiklet =0; 
		double ortalama = 0;
		int sayac=0;
		
		
		while (kilo !=0) {
			
			System.out.print("kilo giriniz : ");
			
			kilo = scan.nextInt();
			
			if (kilo < 50 && kilo>0) {
				hafifSiklet++;
			}
			else if (kilo<70 && kilo>=50) {
				ortaSiklet++;
			}
			else if (kilo>=70) {
				agırSiklet++;
			}
			else if(kilo < 0) {
				System.out.println("yanlis deger girdiniz tekrar giriniz");
			}
			
			if (kilo>0) {
				ortalama+=kilo;
				sayac++;
			}
			
		}
		
		System.out.printf("\n\nToplamda %d adet sporcu girilmistir. \n%d Hafif siklet \n%d Orta siklet \n%d Agir siklet vardir.",sayac,hafifSiklet,ortaSiklet,agırSiklet);
		
		System.out.printf("\nGenel ortalama : %.2f'dir.",ortalama/sayac);
		
		
	}

}
