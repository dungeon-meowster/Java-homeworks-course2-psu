import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public boolean is35 (int x) {
        if (x % 3 == 0) {
            if (x % 5 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (x % 5 == 0) {
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
        int a = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.is35(a));
    }
}