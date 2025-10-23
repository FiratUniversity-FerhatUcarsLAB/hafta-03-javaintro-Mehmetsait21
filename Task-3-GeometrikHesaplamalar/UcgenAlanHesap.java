public class UcgenAlan {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        // Yarı çevre hesapla
        double s = (a + b + c) / 2;

        // Alanı Heron formülüyle hesapla
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonuçları yazdır
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yarı çevre (s): " + s);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
