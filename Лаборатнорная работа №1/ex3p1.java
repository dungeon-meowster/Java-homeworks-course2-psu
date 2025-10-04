import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите целое число x:");
        int x = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.listNums(x));
    }
}