import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int d = scanner.nextInt();
        int i;
        for (i = 0; i <= d; i++) {
            if (i % 3 == 0) {
                System.out.println("Число кратное 3-" + " " + i);

            }
        }
    }
}