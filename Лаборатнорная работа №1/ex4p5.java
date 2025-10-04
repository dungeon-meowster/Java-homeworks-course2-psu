import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public int[] add(int[] arr, int[] ins, int pos) {
        int newLen = arr.length + ins.length;
        int[] newArr = new int[newLen];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            newArr[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            newArr[pos + ins.length + i - pos] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        out.print("Введите размер исходного массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        out.print("Введите элементы исходного массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        out.print("Введите размер вставляемого массива: ");
        int m = sc.nextInt();
        int[] ins = new int[m];
        out.print("Введите элементы вставляемого массива: ");
        for (int i = 0; i < m; i++) {
            ins[i] = sc.nextInt();
        }
        out.print("Введите позицию вставки: ");
        int pos = sc.nextInt();
        int[] result = obj.add(arr, ins, pos);

        out.print("Результат:");
        for (int num : result) {
            out.print(num + " ");
        }
    }
}
