// Program ini terdiri dari satu kelas, yaitu Mobil.
// 1. Kelas Mobil memiliki atribut warna dan merk.
// 2. Kelas Mobil memiliki dua metode, yaitu maju() untuk menampilkan pesan gerakan maju mobil dan mundur() untuk menampilkan pesan gerakan mundur mobil.
// 3. Dalam metode main(), objek mobilSaya dibuat.
// 4. Program memanggil beberapa metodenya untuk menunjukkan beberapa gerakan mobil, seperti bergerak maju dan mundur.

public class Mobil {
    String warna = "Merah";
    String merk = "BMW";

    void maju() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak maju");
    }

    void mundur() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak mundur");
    }

    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil();
        mobilSaya.maju();
        mobilSaya.mundur();
    }
}
