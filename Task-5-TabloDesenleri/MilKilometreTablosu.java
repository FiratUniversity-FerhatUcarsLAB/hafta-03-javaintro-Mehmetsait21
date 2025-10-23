public class MilToKm {
    public static void main(String[] args) {
        double katsayi = 1.609;

        System.out.println("Mil     Kilometre");
        System.out.println("------------------");

        double[] miller = {1, 5, 10, 20, 50};

        for (double mil : miller) {
            double km = mil * katsayi;
            System.out.printf("%-8.1f %-10.3f\n", mil, km);
        }
    }
}
