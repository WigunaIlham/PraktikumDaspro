public class AssignVariabel {
    public static void main(String[] args) {
        // Menetapkan nilai-nilai yang diberikan
        int A = 3;
        int B = 6;
        int C = 2;
        int K = 5;
        int L = 4;
        int M = 3;

        // Melakukan pengecekan ekspresi relasi dan logika

        // a. 4 + 2 > A && B - 2 > 3 + 2 || B + 2 <= 6 + 2
        boolean aResult = (4 + 2 > A) && (B - 2 > 3 + 2) || (B + 2 <= 6 + 2);

        // b. K + 5 < M || (C * M < L && 2 * M - L > 0)
        boolean bResult = (K + 5 < M) || ((C * M < L) && (2 * M - L > 0));

        // c. L + 5 < M || C * K < L && 2 * K - L > 0
        boolean cResult = (L + 5 < M) || ((C * K < L) && (2 * K - L > 0));

        // d. A * 4 <= 3 * M + B
        boolean dResult = (A * 4 <= 3 * M + B);

        // e. K + 10 > A && L - 2 > 4 * C
        boolean eResult = (K + 10 > A) && (L - 2 > 4 * C);

        // Menampilkan hasil dari masing-masing ekspresi
        System.out.println("Hasil a: " + aResult);
        System.out.println("Hasil b: " + bResult);
        System.out.println("Hasil c: " + cResult);
        System.out.println("Hasil d: " + dResult);
        System.out.println("Hasil e: " + eResult);
    }
}
