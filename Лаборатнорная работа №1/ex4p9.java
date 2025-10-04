import static java.lang.System.out;

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
        Main obj = new Main();
        int[] arr = {1, 2, 3, 8, 2, 2, 9};
        int x = 2;
        out.println("Массив: [1,2,3,8,2,2,9]");
        out.println("Ищем: " + x);
        int[] result = obj.findAll(arr, x);
        out.print("Результат: [");
        for (int i : result) {
            out.print(i + ",");
        }
        out.println("]");
    }
}