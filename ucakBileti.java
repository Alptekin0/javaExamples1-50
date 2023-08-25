package projeler3;

public class ucakBileti {

	public static void main(String[] args) {
               
		/*
		 * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
		 * yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
		 * bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
		 * uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
		 * aşağıdaki indirimleri uygulayın ;
		 * 
		 * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
		 * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi tsakdirde kullanıcıya
		 * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
		 * 
		 * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır. Kişi
		 * 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır. Kişi
		 * 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır. Kişi
		 * "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim
		 * uygulanır.
		 */

		Scanner in = new Scanner(System.in);
		System.out.print("kac km gideceksiniz ? : ");
		int km = in.nextInt();

		System.out.print("kac yasindasiniz? : ");
		int yas = in.nextInt();

		System.out.print("tek yon bileti icin 1'i, gidis-donus bileti icin 2'yi yaziniz: ");
		int tercih = in.nextInt();
		double ucret = 0;
		ucret += km * (0.10);
		System.out.print("normal ucretiniz.. " + ucret + " tl");
		System.out.println();
		if (yas > 0 && km > 0 && (tercih == 1 || tercih == 2)) {
			if (yas < 12) {
				ucret = ucret / 2;
				System.out.println("12'yasindan kucuksunuz " + ucret + " tl");
			}
			if (yas >= 12 && yas <= 24) {
				ucret = (ucret - (ucret * (0.1)));
				System.out.println("12-24 yas arasindasiniz.." + ucret + " tl");
			}
			if (tercih == 2) {
				ucret += ucret;
				ucret = (ucret - (ucret * (0.2)));
				System.out.println("gidis-donus sectiniz.." + ucret + " tl");

			}
			if (yas >= 65) {
				ucret = (ucret - (ucret * (0.3)));
				System.out.println("65 yas ustusunuz.." + ucret + " tl");

			}
			else {
			System.out.println("hatali veri girdiniz!");
		        }
    }
}
