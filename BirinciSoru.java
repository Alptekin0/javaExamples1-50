package projeler;

import java.util.Scanner;

public class BirinciSoru {

	public static void main(String[] args) {
		
		
		/*KLAVYEDEN GİRİLEN SAYI İLE SEKİL CİZME (TEK SAYI GİRİLECEK)
		  
		 N=5 İSE;
		 
		           *
		           *
		       * * * * *
		           *
		           *                               */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("sayiyi giriniz : ");
		
		int n = input.nextInt();
		
		for (int counter = 0; counter < n; counter++) {
			for (int counter2 = 0; counter2 < n*2; counter2++) {
				if (counter !=n/2) {
					System.out.print(" ");
				}
			}
			if (counter==n/2) {
				System.out.print("      ");
				for (int counter3 = 0; counter3 < n; counter3++) {
					System.out.printf("* ");
				}
				System.out.println();
			}
			else {
				System.out.println("*");

			}
		}
		
		
		
	}

}
