public class HesapOzeti {
    public static void main(String[] args) {
        // Ürün bilgileri
        String urun1 = "Elma";
        int miktar1 = 3;
        double fiyat1 = 12.5;

        String urun2 = "Ekmek";
        int miktar2 = 2;
        double fiyat2 = 7.0;

        String urun3 = "Süt";
        int miktar3 = 1;
        double fiyat3 = 18.0;

        // Toplam hesapla
        double toplam = (miktar1 * fiyat1) + (miktar2 * fiyat2) + (miktar3 * fiyat3);

        // Tablo başlığı
        System.out.println("===================================");
        System.out.println("           HESAP OZETI             ");
        System.out.println("===================================");
        System.out.printf("%-10s %-10s %-10s\n", "Ürün", "Miktar", "Fiyat");
        System.out.println("-----------------------------------");

        // Ürün satırlarını yazdır
        System.out.printf("%-10s %-10d %-10.2f\n", urun1, miktar1, (miktar1 * fiyat1));
        System.out.printf("%-10s %-10d %-10.2f\n", urun2, miktar2, (miktar2 * fiyat2));
        System.out.printf("%-10s %-10d %-10.2f\n", urun3, miktar3, (miktar3 * fiyat3));

        System.out.println("-----------------------------------");
        System.out.printf("%-10s %-10s %-10.2f\n", "TOPLAM", "", toplam);
        System.out.println("===================================");
    }
}
