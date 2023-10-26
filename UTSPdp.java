import java.util.Scanner;

public class UTSPdp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "Muhammad Wiguna Ilham";
        System.out.println("Soal 1");
        System.out.println("Bismillahirrahmaanirrahiim, Saya " + name + " berjanji dan bersungguh-sungguh semaksimal mungkin mengerjakan UTS ini dengan usaha sendiri, tanpa sekalipun melihat pekerjaan teman Saya, serta mematuhi tata tertib selama ujian. Jika Saya melanggar janji ini, Saya berani menanggung resikonya.");

        System.out.println("");

        char ulangi;
        do {
            System.out.println("Soal 2");
            System.out.println("Program Hitung Honor Karyawan Kontrak");
            System.out.println("PT. DAMAI SEJAHTERA");


            // input nama karyawan
            System.out.print("Nama Karyawan: ");
            String nama = input.nextLine();

            // input tunjangan jabatan
            System.out.println("Golongan 1: 5%");
            System.out.println("Golongan 2: 10%");
            System.out.println("Golongan 3: 15%");
            System.out.print("Golongan Karyawan (1/2/3): ");
            int golongan = input.nextInt();

            // input tunjangan pendidikan
            System.out.println("SMU : 2,5%");
            System.out.println("D3 : 5%");
            System.out.println("S1 : 7,5%");
            System.out.print("Pendidikan (SMU/D3/S1): ");
            String pendidikan = input.next();

            // input jam kerja
            System.out.print("Jumlah Jam Kerja: ");
            int jamKerja = input.nextInt();


            final double HONOR_TETAP = 3000000; 
            double honorTetap = HONOR_TETAP;

            // hitung tunjangan jabatan
            double tunjanganJabatan = 0;

            if (golongan == 1) {
                tunjanganJabatan = 0.05; 
            } else if (golongan == 2) {
                tunjanganJabatan = 0.1; 
            } else if (golongan == 3) {
                tunjanganJabatan = 0.15; 
            }
            tunjanganJabatan *= HONOR_TETAP;


            // hitung tunjangan pendidikan
            double tunjanganPendidikan = 0;
            if (pendidikan.equalsIgnoreCase("SMU")) {
                tunjanganPendidikan = 75000; 
            } else if (pendidikan.equalsIgnoreCase("D3")) {
                tunjanganPendidikan = 150000; 
            } else if (pendidikan.equalsIgnoreCase("S1")) {
                tunjanganPendidikan = 225000; 
            }


            // hitung jam lembur
            final double HONOR_LEMBUR_PER_JAM = 2500; 
            int jamLembur = Math.max(0, jamKerja - 8); 
            double honorLembur = jamLembur * HONOR_LEMBUR_PER_JAM;

            // hitung total honor
            double totalHonor = honorTetap + tunjanganJabatan + tunjanganPendidikan + honorLembur;


            // menampilkan output
            System.out.println("");
            System.out.println("Layar Keluaran");
            System.out.println("Karyawan yang bernama : " + nama);
            System.out.println("Honor yang diterima");
            System.out.println("Honor Tetap : Rp. " + honorTetap);
            System.out.println("Tunjangan Jabatan : Rp. " + tunjanganJabatan);
            System.out.println("Tunjangan Pendidikan : Rp. " + tunjanganPendidikan);
            System.out.println("Honor Lembur : Rp. " + honorLembur);
            System.out.println("--------------------------------- +");
            System.out.println("Honor Yang Diterima : Rp. " + totalHonor);

            System.out.println("");
            System.out.print("Program hitung honor diulang (Y/N)? ");
            ulangi = input.next().charAt(0);

            input.nextLine();
        } while (ulangi == 'Y' || ulangi == 'y');
        System.out.println("");
            System.out.println("Terima Kasih!");

        input.close();
        
    }
}