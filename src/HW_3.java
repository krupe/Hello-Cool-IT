import java.util.Scanner;

public class HW_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t***Добро пожаловать в конвертер Цельсия в Фаренгейт***");
        System.out.println("-----------------------------------------------");

        System.out.print("Введите значение по Цельсию: ");
        int C = scanner.nextInt();

        double Faren = C * 1.8 + 32;
        System.out.println("Значение по Фаренгейту " + Faren);
    }
}
