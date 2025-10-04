import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public boolean isEqual(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число, первое:");
        int a = scanner.nextInt();
        out.println("Введите целое число, второе:");
        int b = scanner.nextInt();
        out.println("Введите целое число, третье:");
        int c = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.isEqual(a, b, c));
    }
}