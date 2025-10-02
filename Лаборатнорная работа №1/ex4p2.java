import static java.lang.System.out;

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
        Main obj = new Main();
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        out.println("Массив: [1,-2,-7,4,2,2,5]");
        out.println("Результат:");
        out.println(obj.maxAbs(arr));
    }
}