package AD231.antonovskaya;

// Клас для чергування символів двох рядків
public class StringMerger {

    // Метод, який чергує символи двох рядків і повертає результат
    public static String mergeStrings(String a, String b) {
        StringBuilder result = new StringBuilder();

        // Знаходимо максимальну довжину рядків
        int maxLength = Math.max(a.length(), b.length());

        // Проходимо по обох рядках і чергуємо символи
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i)); // Додаємо символ з першого рядка
            }
            if (i < b.length()) {
                result.append(b.charAt(i)); // Додаємо символ з другого рядка
            }
        }

        return result.toString();
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        String a = "abcd"; // Перший рядок
        String b = "1234"; // Другий рядок

        System.out.println(mergeStrings(a, b));
    }
}

