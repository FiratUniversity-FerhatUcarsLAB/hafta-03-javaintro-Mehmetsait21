public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5;
        double pi = 3.14159;

        // Alan hesapla
        double alan = pi * r * r;

        // Çevre hesapla
        double cevre = 2 * pi * r;

        // Sonuçları yazdır
        System.out.println("Yarıçap: " + r);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}
