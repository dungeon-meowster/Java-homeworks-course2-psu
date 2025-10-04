import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                out.print("*");
            }
            out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число x для высоты треугольника:");
        int x = scanner.nextInt();
        out.println("Результат:");
        obj.rightTriangle(x);
    }
}