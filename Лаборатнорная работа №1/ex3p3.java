import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public int numLen(long x) {
        x = Math.abs(x);
        int len = 0;
        while (x > 0) {
            x = x / 10;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число x:");
        long x = scanner.nextLong();
        out.println("Результат:");
        out.println(obj.numLen(x));
    }
}