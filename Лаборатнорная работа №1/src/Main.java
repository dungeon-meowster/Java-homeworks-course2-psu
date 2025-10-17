import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();

        out.println("Введите номер задания (1-4):");
        int zadanie = readInt(sc);

        out.println("Введите номер задачи (1,3,5,7,9):");
        int zadacha = readInt(sc);

        boolean valid = true;

        if (zadanie == 1) {
            if (zadacha == 1) {
                out.println("Задача: Дробная часть вещественного числа");
                out.println("Введите вещественное число:");
                double number = readDouble(sc);
                double result = obj.fraction(number);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 3) {
                out.println("Задача: Преобразование символа цифры в число");
                out.println("Введите символ цифры (0-9):");
                char c = readChar(sc);
                int result = obj.charToNum(c);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 5) {
                out.println("Задача: Проверка, является ли число двузначным");
                out.println("Введите целое число:");
                int number = readInt(sc);
                boolean result = obj.is2Digits(number);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 7) {
                out.println("Задача: Проверка вхождения числа в диапазон");
                out.println("Введите целое число, одну из границ диапазона:");
                int a = readInt(sc);
                out.println("Введите целое число, вторую из границ диапазона:");
                int b = readInt(sc);
                out.println("Введите целое число, для проверки диапазона:");
                int number = readInt(sc);
                boolean result = obj.isInRange(a, b, number);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 9) {
                out.println("Задача: Проверка равенства трех чисел");
                out.println("Введите целое число, первое:");
                int a = readInt(sc);
                out.println("Введите целое число, второе:");
                int b = readInt(sc);
                out.println("Введите целое число, третье:");
                int c = readInt(sc);
                boolean result = obj.isEqual(a, b, c);
                out.println("Результат:");
                out.println(result);
            } else {
                valid = false;
            }
        } else if (zadanie == 2) {
            if (zadacha == 1) {
                out.println("Задача: Вычисление модуля числа");
                out.println("Введите целое число, положительное или отрицательное:");
                int a = readInt(sc);
                int result = obj.abs(a);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 3) {
                out.println("Задача: Делимость на 3 или 5, но не на оба");
                out.println("Введите целое число:");
                int a = readInt(sc);
                boolean result = obj.is35(a);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 5) {
                out.println("Задача: Наибольшее из трех чисел");
                out.println("Введите целое число, первое:");
                int x = readInt(sc);
                out.println("Введите целое число, второе:");
                int y = readInt(sc);
                out.println("Введите целое число, третье:");
                int z = readInt(sc);
                int result = obj.max3(x, y, z);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 7) {
                out.println("Задача: Сумма двух чисел с проверкой на 10-19");
                out.println("Введите первое целое число:");
                int x = readInt(sc);
                out.println("Введите второе целое число:");
                int y = readInt(sc);
                int result = obj.sum2(x, y);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 9) {
                out.println("Задача: Название дня недели по номеру");
                out.println("Введите число дня недели от 1 до 7:");
                int x = readInt(sc);
                String result = obj.day(x);
                out.println("Результат:");
                out.println(result);
            } else {
                valid = false;
            }
        } else if (zadanie == 3) {
            if (zadacha == 1) {
                out.println("Задача: Строка с числами от 0 до x");
                out.println("Введите целое число x:");
                int x = readInt(sc);
                String result = obj.listNums(x);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 3) {
                out.println("Задача: Строка четных чисел от 0 до x");
                out.println("Введите целое число x:");
                int x = readInt(sc);
                String result = obj.chet(x);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 5) {
                out.println("Задача: Количество цифр в числе");
                out.println("Введите целое число x:");
                long x = readLong(sc);
                int result = obj.numLen(x);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 7) {
                out.println("Задача: Печать квадрата из звездочек");
                out.println("Введите целое число x для размера квадрата:");
                int x = readInt(sc);
                out.println("Результат:");
                obj.square(x);
            } else if (zadacha == 9) {
                out.println("Задача: Печать правого треугольника из звездочек");
                out.println("Введите целое число x для высоты треугольника:");
                int x = readInt(sc);
                out.println("Результат:");
                obj.rightTriangle(x);
            } else {
                valid = false;
            }
        } else if (zadanie == 4) {
            if (zadacha == 1) {
                out.println("Задача: Индекс первого вхождения в массив");
                out.println("Введите размер массива:");
                int n = readInt(sc);
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }
                out.println("Введите искомое число:");
                int x = readInt(sc);
                int result = obj.findFirst(arr, x);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 3) {
                out.println("Задача: Элемент массива с максимальным модулем");
                out.println("Введите размер массива:");
                int n = readInt(sc);
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }
                out.println("Массив: " + Arrays.toString(arr));
                int result = obj.maxAbs(arr);
                out.println("Результат:");
                out.println(result);
            } else if (zadacha == 5) {
                out.println("Задача: Вставка одного массива в другой");
                out.println("Введите размер исходного массива:");
                int n = readInt(sc);
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }
                out.println("Введите размер вставляемого массива:");
                int m = readInt(sc);
                int[] ins = new int[m];
                for (int i = 0; i < m; i++) {
                    out.println("Элемент вставляемого " + i + ":");
                    ins[i] = readInt(sc);
                }
                out.println("Введите позицию вставки:");
                int pos = readInt(sc);
                int[] result = obj.add(arr, ins, pos);
                out.println("Результат:");
                for (int num : result) {
                    out.print(num + " ");
                }
                out.println();
            } else if (zadacha == 7) {
                out.println("Задача: Реверс массива с возвратом нового");
                out.println("Введите размер массива:");
                int n = readInt(sc);
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }
                int[] result = obj.reverseBack(arr);
                out.println("Результат:");
                for (int num : result) {
                    out.print(num + " ");
                }
                out.println();
            } else if (zadacha == 9) {
                out.println("Задача: Индексы всех вхождений в массив");
                out.println("Введите размер массива:");
                int n = readInt(sc);
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }
                out.println("Введите искомое число:");
                int x = readInt(sc);
                int[] result = obj.findAll(arr, x);
                out.println("Результат:");
                for (int i : result) {
                    out.print(i + " ");
                }
                out.println();
            } else {
                valid = false;
            }
        } else {
            valid = false;
        }

        if (!valid) {
            out.println("Нет такой задачи");
        }

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                out.println("Неверный ввод. Пожалуйста, введите число");
            }
        }
    }

    private static long readLong(Scanner sc) {
        while (true) {
            try {
                return sc.nextLong();
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                out.println("Неверный ввод. Пожалуйста, введите число");
            }
        }
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            try {
                return sc.nextDouble();
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                out.println("Неверный ввод. Пожалуйста, введите число");
            }
        }
    }

    private static char readChar(Scanner sc) {
        while (true) {
            String input = sc.next();
            if (input.length() == 1) {
                return input.charAt(0);
            } else {
                out.println("Неверный ввод. Пожалуйста, введите один символ");
            }
        }
    }

    // Задание 1
    // №1
    public double fraction(double x) {
        x = x - (int) x;
        return x;
    }

    // №3
    public int charToNum(char x) {
        return (int) x - 48;
    }

    // №5
    public boolean is2Digits(int x) {
        x = x / 10;
        if (x == 0) {
            return false;
        } else {
            x = x / 10;
            if (x == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    // №7
    public boolean isInRange(int a, int b, int num) {
        if ((a <= num && b >= num) || (a >= num && b <= num)) {
            return true;
        } else {
            return false;
        }
    }

    // №9
    public boolean isEqual(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 2
    // №1
    public int abs(int x) {
        if (x < 0) {
            return x * (-1);
        } else {
            return x;
        }
    }

    // №3
    public boolean is35(int x) {
        if (x % 3 == 0) {
            if (x % 5 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (x % 5 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    // №5
    public int max3(int x, int y, int z) {
        if (y > x) {
            x = y;
        }
        if (z > x) {
            x = z;
        }
        return x;
    }

    // №7
    public int sum2(int x, int y) {
        int s = x + y;
        if (s >= 10 && s <= 19) {
            return 20;
        } else {
            return s;
        }
    }

    // №9
    public String day(int x) {
        switch (x) {
            case 1:
                return "пнедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    // Задание 3
    // №1
    public String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    // №3
    public String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();
    }

    // №5
    public int numLen(long x) {
        if (x == 0) {
            return 1;
        }
        x = Math.abs(x);
        int len = 0;
        while (x > 0) {
            x = x / 10;
            len++;
        }
        return len;
    }

    // №7
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                out.print("*");
            }
            out.println();
        }
    }

    // №9
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                out.print("*");
            }
            out.println();
        }
    }

    // Задание 4
    // №1
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // №3
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

    // №5
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

    // №7
    public int[] reverseBack(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        return newArr;
    }

    // №9
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
}