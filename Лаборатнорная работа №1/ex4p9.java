import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        int[] indices = new int[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[idx] = i;
                idx++;
            }
        }
        return indices;
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

        int[] result = obj.findAll(arr, x);
        out.print("Результат: ");
        for (int i : result) {
            out.print(i + " ");
        }
    }
}
