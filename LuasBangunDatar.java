import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("Perhitungan Luas Bangun Datar");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Pilih bangun datar (1/2/3): ");

        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                // persegi
                System.out.println("Masukkan panjang sisi persegi");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi: " + luasPersegi);
                break;

            case 2:
                // Segitiga
                System.out.println("Masukkan alas segitiga: ");
                double alas = input.nextDouble();
                System.out.println("Masukkan tinggi segitiga: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas segitiga: " + luasSegitiga);
                break;

            case 3:
                // Lingkaran
                System.out.println("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                double luasLingkaran = Math.PI * jariJari * jariJari;
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                break;

            default:
                System.out.println("Pilihan tidak valid");
                break;

        }
    }
}