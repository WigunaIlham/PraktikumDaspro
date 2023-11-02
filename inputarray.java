import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input.nextInt();

        int[] arr = new int[jumlahElemen];

        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("");
        System.out.println("Elemen-elemen array yang dimasukkan:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + arr[i]);
        }

        input.close();
    }
}
