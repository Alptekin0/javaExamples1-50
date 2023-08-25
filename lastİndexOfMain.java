package Odev;

import java.util.Scanner;

public class lastİndexOfMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] AnaDizi = {74,85,102,99,101,85,56};
		
		int ArananDeger = 85;
		
		/*
		  
		  // DİZİYİ KULLANICADAN ALMAK İSTERSEK ARALARINDA VİRGUL OLACAK SEKİLDE BU YORUM SATIRINDAKİ KODDAN ALABİLİRİZ.

		  
		System.out.print("Diziyi giriniz : ");
		
		String girdi = input.nextLine();

		String[] dizi = girdi.split(",", 30);

		int[] AnaDizi = new int[dizi.length];

		for (int counter = 0; counter < dizi.length; counter++) {

			AnaDizi[counter] = Integer.parseInt(dizi[counter]);
		}
		
		
		System.out.print("Aranan degeri giriniz : ");
		int ArananDeger = input.nextInt();
		*/
		
		lastIndexOfClass lastIndexOf=new lastIndexOfClass();
		System.err.println(lastIndexOf.lastIndexOf(AnaDizi, ArananDeger));		
		
		
	}

}
