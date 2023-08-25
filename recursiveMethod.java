package CodingGame;

import java.util.Scanner;

public class recursiveMethod {

	public static void main(String args[]) {
				
		/*
		 16 11 6 1 -4 1 6 11 16 recursive method ile yapılacak.
		 */

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int tempA = a;
		boolean durum = true;

		dondur(a, tempA, durum);

	}

	public static void dondur(int a, int tempA, boolean durum) {

		if (a >= -5 && durum == true) {
			System.out.println(a);
			dondur(a - 5, tempA, durum);
			return;
		}
		if (a < 0) {
			a = a + 10;
		}

		if (a <= tempA) {
			durum = false;
			System.out.println(a);
			dondur(a + 5, tempA, durum);
			return;
		}

		if (a > tempA) {
			return;

		}

	}

}