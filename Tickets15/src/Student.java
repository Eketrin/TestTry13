import java.util.Arrays;

public class Student {
    // Приватные поля
    private String name; // Имя студента
    private String surname; // Фамилия студента
    private int[] grades = new int[0]; // Последние 10 оценок студента

    // Конструктор класса Student
    public Student(String name, String surname, int[] grades) {
        this.name = name;
        this.surname = surname;
        setGrades(grades); // Устанавливаем оценки через сеттер для проверки
    }

    // Геттеры и сеттеры для имени, фамилии и оценок
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

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
}
