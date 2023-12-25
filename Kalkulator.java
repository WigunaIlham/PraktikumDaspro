import java.util.Scanner;

public class Kalkulator {
    // Methods and properties for Kalkulator class

    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }

    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }

    public static double bagi(double angka1, double angka2) {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }

    public static double hitung(double angka1, double angka2, char operator) {
        switch (operator) {
            case '+':
                return tambah(angka1, angka2);
            case '-':
                return kurang(angka1, angka2);
            case '*':
                return kali(angka1, angka2);
            case '/':
                return bagi(angka1, angka2);
            default:
                System.out.println("Error: Unknown operator");
                return 0;
        }
    }

    public static double hitungLuas(double jariJari, boolean isLingkaran) {
        if (isLingkaran) {
            return Math.PI * jariJari * jariJari;
        } else {
            System.out.println("Error: Not a valid shape for area calculation");
            return 0;
        }
    }

    public static double hitungLuasPersegi(double sisi, boolean isPersegi) {
        if (isPersegi) {
            return sisi * sisi;
        } else {
            System.out.println("Error: Not a valid shape for area calculation");
            return 0;
        }
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
}

class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
                performArithmeticOperation(pilihan, input);
                break;
            case 5:
                calculateSquareArea(input);
                break;
            case 6:
                calculateRectangleArea(input);
                break;
            case 7:
                calculateCircleArea(input);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    private static void performArithmeticOperation(int operation, Scanner input) {
        double angka1 = getInput("Masukkan angka pertama: ", input);
        double angka2 = getInput("Masukkan angka kedua: ", input);

        char operator = getOperator(operation);
        if (operator == 0) {
            System.out.println("Pilihan operator tidak valid.");
            return;
        }

        System.out.println("Hasil: " + Kalkulator.hitung(angka1, angka2, operator));
    }

    private static char getOperator(int operation) {
        switch (operation) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                return 0;
        }
    }

    private static double getInput(String prompt, Scanner input) {
        System.out.print(prompt);
        return input.nextDouble();
    }

    private static void calculateSquareArea(Scanner input) {
        double sisiPersegi = getInput("Masukkan panjang sisi persegi: ", input);
        System.out.println("Luas persegi: " + Kalkulator.hitungLuasPersegi(sisiPersegi, true));
    }

    private static void calculateRectangleArea(Scanner input) {
        double panjangPersegi = getInput("Masukkan panjang persegi panjang: ", input);
        double lebarPersegi = getInput("Masukkan lebar persegi panjang: ", input);
        System.out.println("Luas persegi panjang: " + Kalkulator.hitungLuasPersegiPanjang(panjangPersegi, lebarPersegi));
    }

    private static void calculateCircleArea(Scanner input) {
        double jariJari = getInput("Masukkan jari-jari lingkaran: ", input);
        System.out.println("Luas lingkaran: " + Kalkulator.hitungLuas(jariJari, true));
    }
}
