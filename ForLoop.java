import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kata yang ingin diulang: ");
        String kata = scanner.nextLine();
        
        System.out.print("Berapa kali Anda ingin mengulang kata tersebut? ");
        int jumlah_ulang = scanner.nextInt();
        
        for (int i = 0; i < jumlah_ulang; i++) {
            System.out.println(kata);
        }
        
        scanner.close();
    }
}
