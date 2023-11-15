public class PenjumlahanMatriks {
    public static void main(String[] args) {
        // Matriks 1
        int[][] matriks1 = {
            {2, 5, 3},
            {4, 1, 6}
        };

        // Matriks 2
        int[][] matriks2 = {
            {1, 4, 3},
            {3, 2, 1}
        };

        // Penjumlahan matriks
        int[][] hasilPenjumlahan = tambahMatriks(matriks1, matriks2);

        // Menampilkan hasil
        tampilkanMatriks(matriks1, "MATRIK 1");
        tampilkanMatriks(matriks2, "MATRIK 2");
        System.out.println("\nHasil Penjumlahan Matrik 1 dan Matrik 2 adalah:");
        tampilkanMatriks(hasilPenjumlahan, "");
    }

    // Fungsi untuk menjumlahkan dua matriks
    public static int[][] tambahMatriks(int[][] matriks1, int[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        return hasil;
    }

    // Fungsi untuk menampilkan matriks dengan judul
    public static void tampilkanMatriks(int[][] matriks, String judul) {
        System.out.println(judul);
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
