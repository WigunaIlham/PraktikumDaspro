import java.util.Scanner;

public class dataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        String[] namaMahasiswa = new String[jumlahMahasiswa];
        String[] nimMahasiswa = new String[jumlahMahasiswa];
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        int nilaiTertinggi = -1;
        int indexMahasiswaTertinggi = -1;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            namaMahasiswa[i] = input.next();

            System.out.print("NIM: ");
            nimMahasiswa[i] = input.next();

            System.out.print("Nilai: ");
            nilaiMahasiswa[i] = input.nextInt();

            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
                indexMahasiswaTertinggi = i;
            }
        }

        input.close();

        System.out.println("Mahasiswa dengan nilai tertinggi adalah:");
        System.out.println("Nama: " + namaMahasiswa[indexMahasiswaTertinggi]);
        System.out.println("NIM: " + nimMahasiswa[indexMahasiswaTertinggi]);
        System.out.println("Nilai: " + nilaiMahasiswa[indexMahasiswaTertinggi]);
    }
}
