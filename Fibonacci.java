package projeler3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		/*
		   
		   SORU 50 : SON SORUU  !!!!!!!!!!!!!!!!!!!!!!!!!.....
		   
		   FİBONACCİ SERİSİNİ İSTENİLEN TERİMİNE KADAR DEVAM ETTİREN PROGRAM.
		   
		   FİBONACCİ SERİSİ : İLK TERİMİ 0 İKİNCİ TERİMİ 1 OLAN BU SERİNİN DEVAMİ HER ZAMAN ÖNCEKİ İKİ SAYININ
		   TOPLAMI ŞEKLİNDE İLERLİYOR.
		   
		   ÖRNEK : 0  1  1  2  3  5  8  13  21  34  55  89  144  .......
		   
		   
		   
		 */
		
		
		int seriSayisi, an, birinciTerim = 0, ikinciTerim = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonaccinin kacinci terimine kadar devam etsin : ");
		seriSayisi = input.nextInt();
		
		
		System.out.print(birinciTerim+" "+ikinciTerim);
		
		for (int counter = 2; counter < seriSayisi; counter++) {
			
			an = birinciTerim + ikinciTerim;
			birinciTerim = ikinciTerim;
			ikinciTerim = an;
			
			System.out.print(" "+an);
			
		}
		
		
		
	}

}
