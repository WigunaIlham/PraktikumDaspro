import java.util.Scanner;

public class MenghitungBangunDatar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Silahkan pilih (1/2/3) : ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungPersegi();
                break;
            case 2:
                hitungSegitiga();
                break;
            case 3:
                hitungLingkaran();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        input.close();
    }

    // Prosedur untuk menghitung persegi
    public static void hitungPersegi() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menghitung Persegi ===");
        System.out.print("Masukkan panjang sisi: ");
        double sisi = input.nextDouble();

        double luas = luasPersegi(sisi);
        double keliling = kelilingPersegi(sisi);

        System.out.println("Luas perseginya adalah " + luas);
        System.out.println("Keliling persefinya adalah " + keliling);

        input.close();
    }

    // Fungsi untuk menghitung luas persegi
    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    // Fungsi untuk menghitung keliling persegi
    public static double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    // Prosedur untuk menghitung segitiga
    public static void hitungSegitiga() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menghitung Segitiga ===");
        System.out.print("Masukkan alas: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double luas = luasSegitiga(alas, tinggi);
        double keliling = kelilingSegitiga(alas, tinggi);

        System.out.println("Luas segitiganya adalah " + luas);
        System.out.println("Keliling segitiganya adalah " + keliling);

        input.close();
    }

    // Fungsi untuk menghitung luas segitiga
    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    // Fungsi untuk menghitung keliling segitiga
    public static double kelilingSegitiga(double alas, double tinggi) {
        // Untuk sederhana, anggap segitiga adalah segitiga sama sisi
        // Jadi, keliling = alas + tinggi + sisi miring
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    // Prosedur untuk menghitung lingkaran
    public static void hitungLingkaran() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menghitung Lingkaran ===");
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();

        double luas = luasLingkaran(jariJari);
        double keliling = kelilingLingkaran(jariJari);

        System.out.println("Luas lingkarannya adalah " + luas);
        System.out.println("Keliling lingkarannya adalah " + keliling);

        input.close();
    }

    // Fungsi untuk menghitung luas lingkaran
    public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    // Fungsi untuk menghitung keliling lingkaran
    public static double kelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
}
