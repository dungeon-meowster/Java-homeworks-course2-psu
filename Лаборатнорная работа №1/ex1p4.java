import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public boolean isInRange(int a, int b, int num) {
        if (( a <= num && b >= num) || ( a >= num && b <= num)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число, одну из границ диапазона:");
        int a = scanner.nextInt();
        out.println("Введите целое число, вторую из границ диапазона:");
        int b = scanner.nextInt();
        out.println("Введите целое число, для проверки диапазона:");
        int number = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.isInRange(a, b, number));
    }
}