import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kata yang ingin diulang: ");
        String kata = scanner.nextLine();
        
        System.out.print("Berapa kali Anda ingin mengulang kata tersebut? ");
        int jumlah_ulang = scanner.nextInt();
        
        int counter = 0;
        while (counter < jumlah_ulang) {
            System.out.println(kata);
            counter++;
        }
        
        scanner.close();
    }
}
