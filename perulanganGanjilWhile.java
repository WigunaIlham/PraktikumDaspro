import java.util.Scanner;

public class perulanganGanjilWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan perulangan: ");
        int count = input.nextInt();

        int i = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (i <= count) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }

        input.close();
    }
}
