import java.util.Scanner;

public class HW_3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t***Currency Exchange***");
        System.out.println("Enter currency in hryvna:");
        double hryvna = scanner.nextDouble();

        double usd = hryvna / 40.8;
        double euro = hryvna / 44.35;

        System.out.println("Result in USD: " + usd);
        System.out.println("Result in EURO: " + euro);

    }
}
