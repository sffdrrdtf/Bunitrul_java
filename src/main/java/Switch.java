import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String b = scanner.nextLine();
        switch (b) {
            case "Вячеслав":
                System.out.println("Привет, Вячеслав");
                break;
            case "Артур":
                System.out.println("Привет, Артур");
                break;
            default:
                System.out.println("Нет такого имени");
        }
    }
}
