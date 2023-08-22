package projeler3;

import java.util.Scanner;

public class UcgenYildiz {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("UCGENIN TABANINI GIRINIZ (TEK SAYI OLMALI) :  ");
		int UcgenTaban = input.nextInt();
		
		int bosluk = UcgenTaban;
		
		System.out.println("\n\n");
		
		for (int counter = 1; counter < UcgenTaban + 1; counter = counter + 2) {
			
			for (int counter3 = 0; counter3 < bosluk / 2; counter3++) {
				System.out.print(" ");
			}
			bosluk = bosluk - 2; 
			for (int counter2 = 0; counter2 < counter; counter2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
