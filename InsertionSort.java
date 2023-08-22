package projeler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> sayilar = new ArrayList<>();

		for (int counter = 0; counter < 5; counter++) {

			System.out.println("sayilari giriniz : ");

			int sayi = input.nextInt();

			sayilar.add(sayi);

		}
		
		System.out.println(sayilar);
		
		Collections.sort(sayilar);
		
		System.out.println("siralanis : " + sayilar);

	}

}
