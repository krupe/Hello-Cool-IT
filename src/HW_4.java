import java.util.Scanner;

public class HW_4 {

    public static void main(String[] args) {

//        byte cat = 123;
//        short dog = 32456;
//        int catCount = 2163657;
//        long dogCount = 562154453;
//        String s = "string";
//        char birdCount = 'r';
//        char parrotCount = 5;
//        double rabbitCount = 75;
//        int a1 = 10;
//
//        System.out.println(cat);
//        System.out.println(dog);
//        System.out.println(catCount);
//        System.out.println(dogCount);
//        System.out.println(birdCount);
//        System.out.println(rabbitCount);
//        System.out.println(parrotCount);
//        System.out.println(a1);

        System.out.println("\t\t\tДобро пожаловать в калькулятор!\n\n");
        System.out.println("Введите первое число:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println(a + "*" + b + "=" + a * b);
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "/" + b + "=" + a / b);
    }

}
