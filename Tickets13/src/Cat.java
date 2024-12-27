import java.util.Random;

public class Cat {

    // Приватный метод: выводит "Sleep"
    private void sleep() {
        System.out.println("Sleep");
    }

    // Приватный метод: выводит "Meow"
    private void meow() {
        System.out.println("Meow");
    }

    // Приватный метод: выводит "Eat"
    private void eat() {
        System.out.println("Eat");
    }

    // Публичный метод: вызывает только один из приватных методов случайным образом
    public void status() {
        Random random = new Random();
        int choice = random.nextInt(3); // Генерирует случайное число от 0 до 2

        if (choice == 0) {
            sleep();
        } else if (choice == 1) {
            meow();
        } else {
            eat();
        }
    }

    // Точка входа в программу
    public static void main(String[] args) {
        Cat cat = new Cat();

        // Вызываем метод status для демонстрации работы
        for (int i = 0; i < 1; i++) {
            cat.status(); // Каждый вызов вызывает только один метод
        }
    }
}
