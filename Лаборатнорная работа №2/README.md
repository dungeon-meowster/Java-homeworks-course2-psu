# Руденко Павел Михайлович Группа ИТ-4 Лабораторная №2

# Задание 1
## Задача 1 (Point.java, Main.java)
### Текст задачи
Точка координат. Необходимо создать класс `Point` для представления точки на плоскости с координатами (x, y) и вывести три точки с координатами (1,2), (3,4), (5,6).

### Алгоритм решения
1. Создать класс `Point` с полями `x` и `y` и методом `toString()` для вывода координат в формате `{x;y}`.
2. В методе `pointCoordinates()` создать три объекта `Point` и вывести их.

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(3, 4);
Point p3 = new Point(5, 6);
out.println(p1);
out.println(p2);
out.println(p3);
```

# Задание 2
## Задача 1 (Line.java, Main.java)
### Текст задачи
Прямая. Необходимо создать класс `Line`, представляющий линию, заданную двумя точками (`Point`). Продемонстрировать создание линий, изменение координат точек и эффект от использования общих объектов `Point`.

### Алгоритм решения
1. Создать класс `Line` с полями `start` и `end` (объекты `Point`) и конструктором, принимающим координаты.
2. В методе `line()` создать три линии, используя общие точки.
3. Изменить координаты точек через методы `setX()`, `setY()`, и `setStart()`, затем вывести линии для демонстрации эффекта.

```java
Point start1 = new Point(1, 3);
Point end1 = new Point(23, 8);
Line line1 = new Line(start1, end1);
Point start2 = new Point(5, 10);
Point end2 = new Point(25, 10);
Line line2 = new Line(start2, end2);
Line line3 = new Line(start1, end2);
```

# Задание 3
## Задача 1 (Student.java, Main.java)
### Текст задачи
Студент. Необходимо создать класс `Student` с именем и массивом оценок. Продемонстрировать глубокое и мелкое копирование массива оценок, а также изменение оценок и их эффект на разные объекты.

### Алгоритм решения
1. Создать класс `Student` с полями `name` и `grades`, где конструктор клонирует массив `grades`.
2. Реализовать метод `setGradesShallow()` для мелкого копирования и `setGrade()` для изменения оценки.
3. В методе `student()` создать студентов, скопировать оценки и продемонстрировать эффект изменений.

```java
int[] initialGrades = {3, 4, 5};
Student vasya = new Student("Вася", initialGrades);
Student petya = new Student("Петя", null);
petya.setGradesShallow(vasya.getGrades());
petya.setGrade(0, 5);
Student andrey = new Student("Андрей", vasya.getGrades());
vasya.setGrade(0, 2);
```

# Задание 4
## Задача 1 (Point.java, Line.java, Main.java)
### Текст задачи
Создание точки и линии. Необходимо создать точки и линии, включая конструктор для `Line`, принимающий координаты напрямую, и вывести их.

### Алгоритм решения
1. Использовать классы `Point` и `Line` из предыдущих задач.
2. В методе `createPointAndLine()` создать три точки и три линии, одна из которых использует конструктор с координатами.
3. Вывести точки и линии.

```java
Point pt1 = new Point(3, 5);
Point pt2 = new Point(25, 6);
Point pt3 = new Point(7, 8);
Line l1 = new Line(new Point(1, 3), new Point(23, 8));
Line l2 = new Line(5, 10, 25, 10);
Line l3 = new Line(l1.getStart(), l2.getEnd());
```

# Задание 5
## Задача 3 (Line.java, Main.java)
### Текст задачи
Длина линии. Необходимо реализовать метод `getLength()` в классе `Line`, который возвращает длину линии, вычисленную по формуле расстояния между двумя точками.

### Алгоритм решения
1. В классе `Line` реализовать метод `getLength()`, использующий формулу расстояния: `sqrt((x2-x1)^2 + (y2-y1)^2)`.
2. В методе `lineLength()` создать линию и вывести её длину.

```java
Point start = new Point(1, 1);
Point end = new Point(10, 15);
Line line = new Line(start, end);
out.println("Длина: " + line.getLength());
```