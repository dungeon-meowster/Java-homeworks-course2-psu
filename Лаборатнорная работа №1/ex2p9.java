import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public String day(int x) {
        switch (x) {
            case 1:
                return "пнедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        out.println("Введите число дня недели от 1 до 7:");
        int x = scanner.nextInt();
        out.println("Результат:");
        out.println(obj.day(x));
    }
}