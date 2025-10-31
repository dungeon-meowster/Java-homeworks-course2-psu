# Руденко Павел Михайлович Группа ИТ-4 Лабораторная №2

# Задание 1
## Задача 1 (Точка координат)
### Текст задачи	
Создайте	сущность	Точка,	расположенную	на	двумерной	плоскости,	которая	описывается:	
• Координата	Х:	число	
• Координата	Y:	число	
• Может	возвращать	текстовое	представление	вида	“{X;Y}”	
Необходимо	создать	три	точки	с	разными	координатами	и	вывести	на	экран	их	текстовое	
представление. 

### Алгоритм решения
1. Создать класс Point с приватными полями x и y типа double.
2. Добавить конструктор для инициализации координат.
3. Переопределить метод toString() для вывода в формате "{X;Y}".
4. Добавить геттеры и сеттеры для x и y.
5. В методе main (в Main.java, pointCoordinates()) создать три экземпляра Point с разными координатами и вывести их.

```java
package lab2;
public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}
```

# Задание 2
## Задача 1 (Прямая)
### Текст задачи
Создайте сущность Линия, расположенную на двумерной плоскости, которая описывается: 
• Координата начала: Точка 
• Координата конца: Точка 
• Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}” 
Для указания координат нужно использовать сущность Точка, разработанную в задании 1.1. Создайте 
линии со следующими характеристиками: 
1. Линия 1 с началом в т. {1;3} и концом в т.{23;8}. 
2. Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25. 
3. Линия 3, которая начинается всегда там же, где начинается линия 1, и заканчивается всегда там 
же, где заканчивается линия 2. Таким образом, если положение первой или второй линии 
меняется, то меняется и третья линия. 
4. После создания всех трех объектов измените координаты первой и второй линий, причем 
сделайте это таким образом, чтобы положение третьей линии соответствовало требованиям 
пункта 3. 
5. Измените координаты первой линии так, чтобы при этом не изменились, координаты третьей
   линии.

### Алгоритм решения
1. Создать класс Line с приватными полями start и end типа Point.
2. Добавить конструкторы: один с двумя Point, другой с четырьмя double (создает Points внутри).
3. Переопределить toString() для вывода "Линия от start до end".
4. Добавить геттеры и сеттеры для start и end.
5. В методе main (в Main.java, line()) создать линии как указано, изменить координаты через сеттеры Points (чтобы показать ссылочную зависимость), затем заменить start линии 1 на новый Point, чтобы разорвать связь.

```java
package lab2;
public class Line {
    private Point start;
    private Point end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }
    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
    public Point getStart() {
        return start;
    }
    public Point getEnd() {
        return end;
    }
    public void setStart(Point start) {
        this.start = start;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }
}
```

# Задание 3
## Задача 1 (Студент)
### Текст задачи
Создайте	сущность	Студент,	которая	описывается:	
• Имя:	строка	
• Оценки:	массив	целых	чисел.	
• Может	возвращать	текстовое	представление	вида	“Имя:	[оценка1,	оценка2,…,оценкаN]”	
Необходимо	выполнить	следующие	задачи:	
1. Создать	студента	Васю	с	оценками:	3,4,5.		
2. Создать	студента	Петю	и	скопировать	оценки	Васи,	присвоив	содержимое	поля	с	
оценками	Васи	полю	с	оценками	Пети.		
3. Заменить	первую	оценку	Пети	на	число	5.	Вывести	на	экран	строковое	представление	
Васи	и	Пети.	Объяснить	результат	
4. Создать	студента	Андрея	и	скопировать	ему	оценки	Васи	так,	чтобы	изменение	оценок
   Васи	не	влияло	на	Андрея.

### Алгоритм решения
1. Создать класс Student с приватными полями name (String) и grades (int[]).
2. В конструкторе клонировать grades для deep copy.
3. Переопределить toString() для вывода имени и списка оценок.
4. Добавить геттер для grades, метод setGradesShallow для shallow copy, setGrade для изменения оценки.
5. В методе main (в Main.java, student()) создать студентов, назначить shallow и deep копии, изменить оценки и вывести, чтобы показать разницу.

```java
package lab2;
public class Student {
    private String name;
    private int[] grades;
    public Student(String name, int[] grades) {
        this.name = name;
        if (grades != null) {
            this.grades = grades.clone();
        } else {
            this.grades = null;
        }
    }
    @Override
    public String toString() {
        if (grades == null) {
            return name + ": []";
        }
        StringBuilder sb = new StringBuilder(name + ": [");
        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]);
            if (i < grades.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public int[] getGrades() {
        return grades;
    }
    public void setGradesShallow(int[] grades) {
        this.grades = grades;
    }
    public void setGrade(int index, int value) {
        if (grades != null && index >= 0 && index < grades.length) {
            grades[index] = value;
        }
    }
}
```

# Задание 4
## Задача 1,2 (Создаём Точку, Создаём Линию)
### Текст задачи
1 Создаем	Точку.	
Измените	сущность	Точка	из	задачи	1.1.	В	соответствии	с	новыми	требованиями	создать	объект	
Точки	можно	только	путем	указания	обеих	координат:X	и	Y.		
Необходимо	выполнить	следующие	задачи:	
• Создайте	и	выведите	на	экран	точку	с	координатами	3;5	
• Создайте	и	выведите	на	экран	точку	с	координатами	25;6	
• Создайте	и	выведите	на	экран	точку	с	координатами	7;8	

2	Создаем	Линию.	
Измените	сущность	Линия	из	задачи	2.1.	Новые	требования	включают:	
• Создание	Линии	возможно	с	указанием	Точки	начала	и	Точки	конца	(Точки	из	задачи	4.1)	
• Создание	Линии	возможно	с	указанием	координат	начала	и	конца	как	четырех	чисел	
(x1,y1,x2,y2)	
Создайте	линии	со	следующими	характеристиками:	
1. Линия	1	с	началом	в	т.	{1;3}	и	концом	в	{23;8}.	
2. Линия	2,	горизонтальная,	на	высоте	10,	от	точки	5	до	точки	25.	
3. Линия	3	которая	начинается	всегда	там	же	где	начинается	линия	1,	и	заканчивается	
всегда	там	же,	где	заканчивается	линия	2.	      

### Алгоритм решения
1. Использовать классы Point и Line из предыдущих заданий.
2. Создать три точки.
3. Создать три линии: line1 {1;3}-{23;8}, line2 {5;10}-{25;10}, line3 start line1 to end line2.
4. Вывести все точки и линии.

```java
// Фрагмент из Main.java
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
```

# Задание 5
## Задача 3 (Длина Линии)
### Текст задачи	
Измените	сущность	Линия	из	задачи	4.2.	Добавьте	ей	возможность	возвращать	по	запросу	
пользователя	расстояние	между	точками	начала	и	конца	(в	виде	целого	числа).	Создайте	линию	
из	точки	{1;1}	в	точку	{10;15}	и	выведите	на	экран	её	длину.	

### Алгоритм решения
1. В классе Line добавить метод getLength().
2. Вычислить разницу dx и dy по координатам.
3. Вернуть округленное sqrt(dxdx + dydy) как int.
4. В main (lineLength()) создать линию и вывести длину.

```java
// Фрагмент из Line.java
public int getLength() {
    double dx = end.getX() - start.getX();
    double dy = end.getY() - start.getY();
    return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
}

// Фрагмент из Main.java
private static void lineLength() {
    Point start = new Point(1, 1);
    Point end = new Point(10, 15);
    Line line = new Line(start, end);
    out.println("Линия: " + line);
    out.println("Длина: " + line.getLength());
}
```
