import static java.lang.System.out;

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
        Main obj = new Main();
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;
        out.println("Исходный: [1,2,3,4,5]");
        out.println("Вставляем: [7,8,9] на позицию " + pos);
        int[] result = obj.add(arr, ins, pos);
        out.print("Результат: [");
        for (int num : result) {
            out.print(num + ",");
        }
        out.println("]");
    }
}