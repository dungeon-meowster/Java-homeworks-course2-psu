import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public int charToNum(char x) {
        return (int) x - 48;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите символ цифры (0-9):");
        String input = scanner.next();
        char c = input.charAt(0);
        out.println("Результат:");
        out.println(obj.charToNum(c));
    }
}