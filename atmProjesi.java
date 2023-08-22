package projeler3;

import java.util.Scanner;

public class atmProjesi {

	public static void main(String[] args) {

		int bakiye = 2000;
		int hak = 3;

		String vTkullanici = "MEHMET";
		String vTsifre = "MEHMET123";
		System.out.println();
		System.out.println("Bankamiza Hosgeldiniz!");

		while (hak > 0) {
			Scanner in = new Scanner(System.in);
			System.out.println();
			System.out.print("kullanici adi giriniz: ");
			String kullaniciAdi = in.next();
			System.out.print("sifre giriniz : ");
			String sifre = in.next();
			System.out.println();
			if (vTkullanici.equals(kullaniciAdi) && vTsifre.equals(sifre)) {
				System.out.print("lutfen yapmak istediginiz islemi seciniz: \n" + "1- Para Yatirma \n"
						+ "2- Para Cekme \n" + "3- Bakiye Sorgulama \n" + "4- Cikis Yapma \n ");
				int secim = in.nextInt();
				if (secim == 1) {
					System.out.print("kac lira para yatiracaksiniz? ");
					int deger = in.nextInt();
					System.out.println("yatirdiginiz para: " + deger);
					bakiye += deger;
				} else if (secim == 2) {
					System.out.print("kac lira cekeceksiniz? ");
					int deger = in.nextInt();
					System.out.println("cekmek istediginiz ucret: " + deger);
					if (bakiye >= deger) {
						bakiye -= deger;
					} else {
						System.out.println("bakiye yetersiz!");
					}
				} else if (secim == 3) {
					System.out.println("Bakiyeniz : " + bakiye);
				} else if (secim == 4) {
					System.out.print("Yine bekleriz.Hoscakalin");
					break;
				} else {
					System.out.println("hatali secim yaptiniz. lutfen tekrar girin.");
					hak--;
					System.out.println("kalan hakkiniz : " + hak);

				}
			} else {
				hak--;
				if (hak == 0) {
					System.out.println("3 kere yanlis girdiniz! Hesap BLOKE!");
					break;
				} else {
					System.out.println("kullanici adi ya da sifre yanlis. Tekrar deneyiniz!");
					System.out.println("kalan hakkiniz : " + hak);
				}
			}

		}

	}
}
