import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static double fraction(double x) {
        x = x - (int) x;
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите вещественное число:");
        String input = scanner.next();
        double number = Double.parseDouble(input);
        number = fraction(number);
        out.println("Результат:");
        out.println(number);
    }
}
