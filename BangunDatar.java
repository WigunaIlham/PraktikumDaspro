import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int pilihan;

            System.out.println("Perhitungan Luas Bangun Datar");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.print("Pilih bangun datar (1/2/3): ");

            pilihan = input.nextInt();

            if (pilihan == 1) {
                int pilihan1;

                System.out.println("pilih program menghitung persegi");
                System.out.println("1. Luas Persegi");
                System.out.println("2. Keliling Perseegi");
                System.out.print("Pilih program hitung2 (1/2): ");

                pilihan1 = input.nextInt();

                switch (pilihan1) {
                    case 1:
                        System.out.println("Menghitung Luas Persegi");
                        break;

                    case 2:
                        System.out.println("Menghitung Keliling Persegi");
                        break;
                }
            } else if (pilihan == 2) {
                int pilihan2;

                System.out.println("pilih program menghitung Segitiga");
                System.out.println("1. Luas Segitiga");
                System.out.println("2. Keliling Seegitiga");
                System.out.print("Pilih program hitung (1/2): ");

                pilihan2 = input.nextInt();

                switch (pilihan2) {
                    case 1:
                        System.out.println("Menghitung Luas Segitiga");
                        break;

                    case 2:
                        System.out.println("Menghitung Keliling Segitiga");
                        break;
                }
            } else if (pilihan == 3) {
                int pilihan3;

                System.out.println("pilih program menghitung Lingkaran");
                System.out.println("1. Jari-jari Lingkaran");
                System.out.println("2. Diameter Lingkaran");
                System.out.print("Pilih program hitung (1/2): ");

                pilihan3 = input.nextInt();

                switch (pilihan3) {
                    case 1:
                        System.out.println("Menghitung Jari-jari Lingkaran");
                        break;

                    case 2:
                        System.out.println("Menghitung Diameter Lingkaran");
                        break;
                }
            } else {
                System.out.println("Anda salah memasukan angka!!");
            }
        }
    }
}