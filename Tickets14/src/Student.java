import java.util.Arrays;

public class Student {

    // Приватные поля
    private String name; // Имя студента
    private String surname; // Фамилия студента
    private int[] grades = new int[0]; // Последние 10 оценок студента

    // Геттер и сеттер для имени
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Геттер и сеттер для фамилии
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Геттер и сеттер для оценок
    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        if (grades.length <= 10) {
            this.grades = Arrays.copyOf(grades, grades.length);
        } else {
            throw new IllegalArgumentException("Grades array cannot contain more than 10 grades.");
        }
    }

    // Метод для добавления новой оценки
    public void addGrade(int grade) {
        if (grades.length < 10) {
            // Если оценок меньше 10, добавляем новую
            grades = Arrays.copyOf(grades, grades.length + 1);
            grades[grades.length - 1] = grade;
        } else {
            // Сдвигаем массив влево и добавляем новую оценку в конец
            System.arraycopy(grades, 1, grades, 0, grades.length - 1);
            grades[grades.length - 1] = grade;
        }
    }

    // Метод для расчёта среднего балла
    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0; // Если оценок нет, средний балл 0
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Точка входа для тестирования
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setSurname("Doe");

        // Добавляем оценки
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(85);
        student.addGrade(70);
        student.addGrade(95);
        student.addGrade(88);
        student.addGrade(76);
        student.addGrade(84);
        student.addGrade(91);
        student.addGrade(77);
        student.addGrade(93); // Эта оценка должна сдвинуть массив

        // Выводим данные студента
        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Grades: " + Arrays.toString(student.getGrades()));
        System.out.println("Average Grade: " + student.getAverageGrade());
    }
}
