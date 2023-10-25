import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        // Segitiga 1
        System.out.println("Soal 1:");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Segitiga 2
        System.out.println("Soal 2:");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
