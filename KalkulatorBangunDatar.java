import java.util.Scanner;

class Kalkulator {
    // Method overloading untuk operasi penjumlahan
    public static double hitung (double angka1, double angka2) {
        return angka1 + angka2;
    }

    // Method overloading untuk operasi penjumlahan tiga angka
    public static double hitung (double angka1, double angka2, double angka3) {
        return angka1 + angka2 + angka3;
    }

    // Method overloading untuk operasi pengurangan
    public static double hitung (double angka1, double angka2, boolean kurang) {
        if(kurang) {
            return angka1 - angka2;
        } else {
            return angka1 + angka2;
        }
    }

    // Method overloading untuk operasi perkalian
    public static double hitung (double angka1, double angka2, char operator) {
        if(operator == '*') {
            return angka1 * angka2;
        } else {
            return 0;
        }
    }

    // Method overloading untuk operasi pembagian 
     public static double hitung (double angka1, double angka2, String operator) {
        if(operator.equals("/") && angka2 != 0) {
            return angka1 / angka2;
        } else {
            return 0;
        }
    }

    // Method untuk menghitung luas persegi
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    // Method untuk menghitung luas persegi panjang
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Method untuk menghitung luas lingkaran
    public static double hitungLuas(double jariJari, boolean lingkaran) {
        if (lingkaran) {
            return Math.PI * jariJari * jariJari;
        } else {
            return 0; // Tambahan contoh, bisa diimplementasikan dengan bangun datar lainnya
        }
    }
}

public class KalkulatorBangunDatar {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Kalkulator Sederhana dan Penghitung Luas Bangun Datar");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Hitung Luas Persegi");
        System.out.println("6. Hitung Luas Persegi Panjang");
        System.out.println("7. Hitung Luas Lingkaran");
        System.out.print("Pilih operasi (1-7): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("Masukkan angka pertama: ");
                double angka1 = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                double angka2 = input.nextDouble();
                char operator;
                switch (pilihan) {
                    case 1:
                        operator = '+';
                        break;
                    case 2:
                        operator = '-';
                        break;
                    case 3:
                        operator = '*';
                        break;
                    case 4:
                        operator = '/';
                        break;
                    default:
                        System.out.println("Pilihan operator tidak valid.");
                        return;
                }
                System.out.println("Hasil: " + Kalkulator.hitung(angka1, angka2, operator));
                break;
            case 5: 
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisiPersegi = input.nextDouble();
                System.out.println("Luas persegi: " + Kalkulator.hitungLuas(sisiPersegi));
                break;
            case 6:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPersegi = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPersegi = input.nextDouble();
                System.out.println("Luas persegi panjang: " + Kalkulator.hitungLuas(panjangPersegi, lebarPersegi));
                break;
            case 7:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                System.out.println("Luas lingkaran: " + Kalkulator.hitungLuas(jariJari, true));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}