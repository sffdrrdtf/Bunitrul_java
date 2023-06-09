import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int d = scanner.nextInt();
        if (d > 7) {
            System.out.println("Привет");
        }else if(d < 5){
            System.out.println("Пока");
        }
    }
}
