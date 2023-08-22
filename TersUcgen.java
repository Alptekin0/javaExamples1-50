package projeler3;

import java.util.Scanner;

public class TersUcgen {
	
	
	public static void main(String args[]) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("ucgenin tabanini giriniz (tek sayi olmalidir) : ");
		int ucgenTaban = input.nextInt();
		
		
		System.out.println("\n\n");
		
		for (int counter = ucgenTaban; counter > 0; counter = counter-2) {
			
			
			for (int bosluk = ucgenTaban; bosluk > counter / 2 + 1; bosluk--) {
				System.out.print(" ");
			}
			
			for (int counter2 = 0; counter2 < counter; counter2++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		
	
		
		
		
	
		
		
	}
}
