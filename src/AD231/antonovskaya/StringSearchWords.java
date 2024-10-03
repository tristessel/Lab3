package AD231.antonovskaya;

public class StringSearchWords {

    // Метод для виведення слів, розділених пробілами
    public static void printWords(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Рядок порожній");
            return; // Якщо рядок порожній або null, виводимо повідомлення
        }

        // Використовуємо split() для поділу рядка на слова
        String[] words = input.trim().split("\\s+");

        // Виводимо кожне слово на новий рядок
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        String test = " Hello! My name is Veronika "; // Приклад з пробілами

        printWords(test);
    }
}

