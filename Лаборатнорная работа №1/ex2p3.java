import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public int max3 (int x, int y, int z) {
        if (y > x) {
            x = y;
        }
        if (z > x) {
            x = z;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число, первое:");
        int x = scanner.nextInt();
        out.println("Введите целое число, второе:");
        int y = scanner.nextInt();
        out.println("Введите целое число, третье:");
        int z = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.max3(x, y, z));
    }
}