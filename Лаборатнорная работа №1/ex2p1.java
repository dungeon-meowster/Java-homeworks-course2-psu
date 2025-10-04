import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public int abs (int x) {
        if (x < 0) {
            return x * (-1);
        } else {
            return x;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число, положительное или отрицательное:");
        int a = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.abs(a));
    }
}