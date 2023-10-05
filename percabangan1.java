import java.util.Scanner;

public class percabangan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Masukkan Data Nilai Mahasiswa =====");

        System.out.print("NAMA :");
        String nama = input.nextLine();

        System.out.print("NIM :");
        int nim = input.nextInt();

        System.out.print("NILAI TUGAS :");
        double nilaiTugas = input.nextDouble();

        System.out.print("NILAI UTS :");
        double nilaiUts = input.nextDouble();

        System.out.print("NILAI UAS :");
        double nilaiUas = input.nextDouble();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        input.close();

        double nilaiAkhir = nilaiTugas * 30 / 100 + nilaiUts * 30 / 100 + nilaiUas * 40 / 100;

        System.out.println("===== Data Nilai Mahasiswa =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS : " + nilaiUts);
        System.out.println("Nilai UAS : " + nilaiUas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("================================");

        if (nilaiAkhir >= 60) {
            System.out.println(nama + " Lulus");
        } else {
            System.out.println(nama + " Gagal");
        }
    }
}