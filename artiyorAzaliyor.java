package projeler2;

import java.util.Scanner;

public class artiyorAzaliyor {

	public static void main(String[] args) {
		
		/*
		   SORU 33 : 
		   
		     DAHA SONRA TEKRAR BAK KODLARA DOĞRU CALISTI AMA KAĞIT ÜZERİNDE BAK.
		   
		   
		     GİRİLEN SAYİ ONCEKİ SAYİ İLE KARSOLASTIRIP ARTIYOR AZALIYOR YAZDIRMAK VE ONCEKİ SAYİ İLE ESİT İSE
		     PROGRAMİ BİTİRMEK.
		   
		  
		  */
		
		
		Scanner input = new Scanner(System.in);
		
		int sayi1 = 0;
		
		System.out.print("baslangic sayisi giriniz : ");
		int sayi2 = input.nextInt();
		
		
		while (sayi1 != sayi2){
			
			System.out.print("sayi giriniz (bir onceki sayiyi girerseniz durur) : ");
			sayi1 = input.nextInt();
			
			if (sayi1 > sayi2) {
				System.out.println("ARTIYOR");
			}
			else {
				System.out.println("AZALIYOR");
			}
			
			int temp = sayi2;
			sayi2 = sayi1;
			sayi1 = temp;
		}
		
		System.err.println("BITTI");
		
		
	}
}
