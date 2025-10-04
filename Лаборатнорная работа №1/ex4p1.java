import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        
        out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        out.print("Введите искомое число: ");
        int x = sc.nextInt();
        
        out.println("Массив: " + java.util.Arrays.toString(arr));
        out.println("Ищем: " + x);
        out.println("Результат:");
        out.println(obj.findFirst(arr, x));
        
        sc.close();
    }
}