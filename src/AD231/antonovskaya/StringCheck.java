package AD231.antonovskaya;

// Клас для перевірки, чи закінчується рядок на "ed"
public class StringCheck {

    // Метод повертає true, якщо рядок закінчується на "ed"
    public static boolean endEd(String input) {
        if (input == null || input.length() < 2) {
            return false; // Якщо рядок менше ніж 2 символи або null, повертаємо false
        }
        return input.endsWith("ed");
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        String firstTest = "asked"; // Приклад рядка, який закінчується на "ed"
        String secondTest = "cat"; // Приклад рядка, який не закінчується на "ed"

        System.out.println(endEd(firstTest));
        System.out.println(endEd(secondTest));
    }
}
