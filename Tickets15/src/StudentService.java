import java.util.Arrays;

public class StudentService {

    // Метод для нахождения лучшего студента
    public Student bestStudent(Student[] students) {
        Student best = students[0]; // Начинаем с первого студента
        for (Student student : students) {
            if (student.getAverageGrade() > best.getAverageGrade()) {
                best = student; // Если у текущего студента средний балл больше, обновляем
            }
        }
        return best; // Возвращаем студента с наивысшим средним баллом
    }

    // Метод для сортировки студентов по фамилии
    public void sortBySurname(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getSurname().compareTo(s2.getSurname()));
    }
}
