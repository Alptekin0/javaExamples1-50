package projeler3;

import java.util.Scanner;

public class pozitifOrNegatif {

	public static void main(String[] args) {
		
		/*  
		  SORU 9: 
		  
		    KLAYVEDEN GİRİLEN İSTENİLEN KADAR SAYININ TEK VE ÇİFT SAYİ 
		    ADEDİNİ EKRANA YAZDIRAN PROGRAM.	  
		 */
		
		int sayi, tekSayiSayaci = 0, ciftSayiSayaci = 0;
		Scanner input = new Scanner(System.in);
		
		System.err.println("0 girince sayi girme islemi bitecektir.\n\n");
		
		do {
			
			System.out.print("sayi giriniz : ");
			sayi = input.nextInt();
			
		    if (sayi != 0) {
			
			    if (sayi % 2 == 0) 
				  ciftSayiSayaci++;
			  
			    else 
				  tekSayiSayaci++;	
		    }	
		} while (sayi != 0);
		
		
		
		System.out.print("\n\nGirilen sayilar arasinda tek sayilarin adedi : " + tekSayiSayaci+ 
				"\n\nGirilen sayilar arasinda cift sayilarin adedi :  " + ciftSayiSayaci);

	}

}
