import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen n Degerini Giriniz : ");
        int n = inp.nextInt();
        double total = 0;

        for (double i = 1.0; i <= n; i++) {
            total += (1 / i);
        }

        System.out.print("Sonuc : " + total);
    }
}
