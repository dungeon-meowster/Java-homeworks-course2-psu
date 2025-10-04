import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int absI = Math.abs(arr[i]);
            int absMax = Math.abs(max);
            if (absI > absMax) {
                max = arr[i];
            }
        }
        return max;
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
        out.println("Массив: " + java.util.Arrays.toString(arr));
        out.println("Результат:");
        out.println(obj.maxAbs(arr));
    }
}
