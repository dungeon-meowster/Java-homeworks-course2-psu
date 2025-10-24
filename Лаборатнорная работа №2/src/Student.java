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