import java.util.Scanner;

public class inputarray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] umurMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Umur Mahasiswa ke-" + (i + 1) + " : ");
            umurMahasiswa[i] = input.nextInt();
        }

        System.out.println("\nData Umur Mahasiswa");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Umur Mahasiswa ke-" + (i + 1) + " : " + umurMahasiswa[i]);
        }

        input.close();
    }
}
