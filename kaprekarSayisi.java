package projeler2;

import java.util.Scanner;

public class kaprekarSayisi {

	public static void main(String[] args) {
		
		/*
		   SORU 21:    (GUZEL VE ZOR SORU)
		   
		   KAPREKAR SAYISI
		   
		    BİR SAYINI KARESİ ALINIR KARESİ İKİYE AYRILIR VE SAĞ TARAF İLE SOL TARAFIN TOPLAMI SAYIYA EŞİT İSE BU SAYI KAPREKAR SAYISIDIR.
		    
		    ORNEK : 
		      
		     45 SAYISI 
		       
		     45² = 2025
		        
		     20 + 25 = 45   
		     
		     NOT:  3 BASAMAKLI VE 4 BASAMKLI SAYILARIN KARELERİ ORNEGIN 2223 UN KARESİ 4,941,729 CIKIYOR BURDA SAYININ UZUNLUGU KADAR SOLDAN GERİSİNİ SAGDAN ALACAĞIZ
		     YANİ SOL TARAF 1729 İKEN SAĞ TARAF 494 OLACAK VE İKİSİNİN TOPLAMI  1729 + 494 = 2223 OLUP KAPREKAR SAYISI OLACAKTIR 
		         
	      */
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("sayi giriniz : ");
		
		int sayi = input.nextInt();
		
		int sayikaresi = sayi * sayi;
		
		String stringKare = Integer.toString(sayikaresi);
				
		double uzunluk = stringKare.length();
		
		double solUzunluk = Math.ceil(uzunluk/2);
				
		/*System.out.println("sol uzunluk "+solUzunluk);
		
		System.out.println("sag uzunluk "+ sagUzunluk);
		
		System.out.println("sol uzunluk 10 : "+Math.pow(10, solUzunluk-1));*/
		
		double solTaraf = sayikaresi % Math.pow(10, solUzunluk);
		
		double sagTaraf = sayikaresi / Math.pow(10, solUzunluk);
		
		System.out.println();
				
		if (sayi ==Math.round( sagTaraf+solTaraf)) {
			System.out.println(sayi+" SAYISI KAPREKAR SAYISIDIR.");
		}
		else {
			System.out.println(sayi+" SAYISI KAPREKAR SAYISI DEGILDIR.");
		}
		
		System.out.printf("\n\nSAG TARAF :%.0f \nSOL TARAF :%.0f ",sagTaraf,solTaraf);
		
		
	}

}
