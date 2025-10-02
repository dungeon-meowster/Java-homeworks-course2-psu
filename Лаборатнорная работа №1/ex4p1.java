import static java.lang.System.out;

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
        Main obj = new Main();
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int x = 2;
        out.println("Массив: [1,2,3,4,2,2,5]");
        out.println("Ищем: " + x);
        out.println("Результат:");
        out.println(obj.findFirst(arr, x));
    }
}