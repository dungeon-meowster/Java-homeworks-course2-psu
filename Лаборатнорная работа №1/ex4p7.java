import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public int[] reverseBack(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        return newArr;
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
        
        out.print("Исходный: [");
        for (int num : arr) {
            out.print(num + ",");
        }
        out.println("]");
        
        int[] result = obj.reverseBack(arr);
        out.print("Результат: [");
        for (int num : result) {
            out.print(num + ",");
        }
        out.println("]");
        
        sc.close();
    }
}