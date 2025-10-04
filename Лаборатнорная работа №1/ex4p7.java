import static java.lang.System.out;

public class Main {
    public int[] reverseBack(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = {1, 2, 3, 4, 5};
        out.println("Исходный: [1,2,3,4,5]");
        int[] result = obj.reverseBack(arr);
        out.print("Результат: [");
        for (int num : result) {
            out.print(num + ",");
        }
        out.println("]");
    }
}