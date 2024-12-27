public class main {
    public static void main(String[] args) {
        // Создаём несколько студентов с оценками
        Student student1 = new Student("John", "Doe", new int[]{90, 85, 78, 92, 88, 76, 95, 89, 91, 80});
        Student student2 = new Student("Jane", "Smith", new int[]{85, 87, 89, 93, 80, 85, 86, 88, 90, 91});
        Student student3 = new Student("Alice", "Johnson", new int[]{70, 75, 78, 82, 80, 70, 85, 90, 91, 92});

        // Создаём массив студентов
        Student[] students = {student1, student2, student3};

        // Создаём объект StudentService
        StudentService studentService = new StudentService();

        // Находим лучшего студента
        Student best = studentService.bestStudent(students);
        System.out.println("Best student: " + best.getName() + " " + best.getSurname() +
                " with average grade: " + best.getAverageGrade());

        // Сортируем студентов по фамилии
        studentService.sortBySurname(students);
        System.out.println("Students sorted by surname:");
        for (Student student : students) {
            System.out.println(student.getSurname() + ", " + student.getName());
        }
    }
}
