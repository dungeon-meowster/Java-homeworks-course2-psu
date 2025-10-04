import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public boolean is2Digits (int x) {
        x = x / 10;
        if (x == 0) {
            return false;
        } else {
            x = x / 10;
            if (x == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число:");
        int number = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.is2Digits(number));
    }
}
