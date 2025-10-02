import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public int sum2(int x, int y) {
        int s = x + y;
        if (s >= 10 && s <= 19) {
            return 20;
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите первое целое число:");
        int x = scanner.nextInt();
        out.println("Введите второе целое число:");
        int y = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.sum2(x, y));
    }
}