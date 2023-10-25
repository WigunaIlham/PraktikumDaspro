import java.util.Scanner;

public class perulanganGanjilFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan ganjil yang diinginkan: ");
        int count = input.nextInt();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 1; count > 0; i += 2) {
            System.out.println(i + " ");
            count--;
        }
        input.close();
    }
}
