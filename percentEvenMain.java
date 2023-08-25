package Odev;

import java.util.Scanner;

public class percentEvenMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] AnaDizi = {6,2,9,11,3};
		
		/*
		 // DİZİYİ KULLANICADAN ALMAK İSTERSEK ARALARINDA VİRGUL OLACAK SEKİLDE BU YORUM SATIRINDAKİ KODDAN ALABİLİRİZ.
		  
		System.out.print("diziyi giriniz : ");
		
		String girdi = input.nextLine();

		String[] dizi = girdi.split(",", 30);

		int[] AnaDizi = new int[dizi.length];

		for (int counter = 0; counter < dizi.length; counter++) {

			AnaDizi[counter] = Integer.parseInt(dizi[counter]);
		}
		*/
		percentEvenClass percentEven=new percentEvenClass();
		System.out.println(percentEven.percentEven(AnaDizi));
		
	}

}
