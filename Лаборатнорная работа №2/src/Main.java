package lab2;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Лабораторная работа №2. Выберите задание (1-5):");
        int zadanie = readInt(sc);

        switch (zadanie) {
            case 1:
                out.println("Задание 1, задача 1: Точка координат");
                pointCoordinates();
                break;
            case 2:
                out.println("Задание 2, задача 1: Прямая");
                line();
                break;
            case 3:
                out.println("Задание 3, задача 1: Студент");
                student();
                break;
            case 4:
                out.println("Задание 4: задачи 1 и 2: Создаем Точку и Линию");
                createPointAndLine();
                break;
            case 5:
                out.println("Задание 5, задача 3: Длина Линии");
                lineLength();
                break;
            default:
                out.println("Нет такого задания");
        }

        sc.close();
    }

    // №1
    private static void pointCoordinates() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        out.println(p1);
        out.println(p2);
        out.println(p3);
    }

    // №2
    private static void line() {
        Point start1 = new Point(1, 3);
        Point end1 = new Point(23, 8);
        Line line1 = new Line(start1, end1);

        Point start2 = new Point(5, 10);
        Point end2 = new Point(25, 10);
        Line line2 = new Line(start2, end2);

        Line line3 = new Line(start1, end2);

        out.println("Исходные линии:");
        out.println("1: " + line1);
        out.println("2: " + line2);
        out.println("3: " + line3);

        start1.setX(4);
        start1.setY(5);
        end2.setX(30);

        out.println("\nПосле изменения координат первой и второй линий:");
        out.println("1: " + line1);
        out.println("2: " + line2);
        out.println("3: " + line3);

        line1.setStart(new Point(10, 20));
        end1.setX(15);
        end1.setY(12);

        out.println("\nПосле изменения координат первой линии:");
        out.println("1: " + line1);
        out.println("2: " + line2);
        out.println("3: " + line3);
    }

    // №3
    private static void student() {
        int[] initialGrades = {3, 4, 5};
        Student vasya = new Student("Вася", initialGrades);
        out.println("1. Вася создан: " + vasya);

        Student petya = new Student("Петя", null);
        petya.setGradesShallow(vasya.getGrades());
        out.println("2. Петя со скопированными оценками: " + petya);

        petya.setGrade(0, 5);
        out.println("3. После изменения первой оценки Пети на 5:");
        out.println("Вася: " + vasya);
        out.println("Петя: " + petya);

        Student andrey = new Student("Андрей", vasya.getGrades());
        out.println("4. Андрей со скопированными без учёта изменений оценками: " + andrey);

        vasya.setGrade(0, 2);
        out.println("После изменения первой оценки Васи на 2:");
        out.println("Вася: " + vasya);
        out.println("Петя: " + petya);
        out.println("Андрей: " + andrey);
    }

    // №4
    private static void createPointAndLine() {
        Point pt1 = new Point(3, 5);
        Point pt2 = new Point(25, 6);
        Point pt3 = new Point(7, 8);
        out.println(pt1);
        out.println(pt2);
        out.println(pt3);

        Point s1 = new Point(1, 3);
        Point e1 = new Point(23, 8);
        Line l1 = new Line(s1, e1);

        Line l2 = new Line(5, 10, 25, 10);

        Line l3 = new Line(l1.getStart(), l2.getEnd());

        out.println("Линии:");
        out.println("1: " + l1);
        out.println("2: " + l2);
        out.println("3: " + l3);
    }

    // №5
    private static void lineLength() {
        Point start = new Point(1, 1);
        Point end = new Point(10, 15);
        Line line = new Line(start, end);
        out.println("Линия: " + line);
        out.println("Длина: " + line.getLength());
    }

    private static int readInt(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                out.println("Неверный ввод. Введите число:");
            }
        }
    }
}