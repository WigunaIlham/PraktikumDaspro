import java.util.Scanner;

public class AverageLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahMataKuliah; i++) {
            System.out.print("Nilai mata kuliah ke-" + i + ": ");
            totalNilai += scanner.nextDouble();
        }

        double rataRata = totalNilai / jumlahMataKuliah;

        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataRata);

        scanner.close();
    }
}
