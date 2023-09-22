public class Main {
    public static void main(String[] args) {
        String nama = "Muhammad Wiguna Ilham";
        int nim = 1237050012;
        double nilaiTugas = 90.5;
        double nilaiUts = 93.5;
        double nilaiUas = 95.2;
        double nilaiAkhir = nilaiTugas * 30/100 + nilaiUts * 30/100 + nilaiUas * 40/100;

        System.out.println("===== Data Nilai Mahasiswa =====")
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS : " + nilaiUts);
        System.out.println("Nilai UAS : " + nilaiUas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
