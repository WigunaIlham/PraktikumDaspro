import java.util.Scanner;

public class HukumPythagoras {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi A: ");
        double sisiA = input.nextDouble();

        System.out.print("Masukkan panjang sisi B: ");
        double sisiB = input.nextDouble();

        // Menghitung panjang sisi C menggunakan Hukum Pythagoras
        double sisiC = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));

        System.out.println("Panjang sisi C adalah: " + sisiC);

        input.close();
    }
}
