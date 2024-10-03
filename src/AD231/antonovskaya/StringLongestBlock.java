package AD231.antonovskaya;

// Клас для пошуку найдовшого "блоку" однакових символів у рядку
public class StringLongestBlock {

    // Метод, який знаходить найдовший блок однакових символів
    public static int longestBlock(String input) {
        if (input == null || input.isEmpty()) {
            return 0; // Якщо рядок порожній або null, повертаємо 0
        }

        int maxBlockLength = 1; // Довжину найдовшого блоку
        int currentBlockLength = 1; // Довжина поточного блоку

        // Проходимо по всіх символах рядка
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentBlockLength++; // Якщо символ такий самий, збільшуємо поточний блок
            } else {
                maxBlockLength = Math.max(maxBlockLength, currentBlockLength); // Оновлюємо максимальний блок
                currentBlockLength = 1; // Скидаємо поточний блок
            }
        }

        // Повертаємо найбільшу довжину блоку (враховуючи останній блок)
        return Math.max(maxBlockLength, currentBlockLength);
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        String test = "aabbbbccc";

        System.out.println(longestBlock(test));
    }
}

