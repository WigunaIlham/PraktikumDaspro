import java.util.Scanner;

public class perulanganGanjilDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Perulangan: ");
        int count = input.nextInt();

        int i = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        } while (i <= count);
        input.close();
    }
}
