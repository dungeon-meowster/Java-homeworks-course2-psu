import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                out.print("*");
            }
            out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число x для размера квадрата:");
        int x = scanner.nextInt();
        out.println("Результат:");
        obj.square(x);
    }
}