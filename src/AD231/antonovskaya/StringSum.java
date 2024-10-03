package AD231.antonovskaya;

// Клас для підрахунку суми цифр у рядку
public class StringSum {

    // Метод, який повертає суму всіх цифр у рядку
    public static int sumOfDigits(String input) {
        int sum = 0; // Ініціалізуємо суму
        if (input == null || input.isEmpty()) {
            return sum; // Якщо рядок порожній або null, повертаємо 0
        }
        // Перебираємо кожен символ у рядку
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) { // Перевіряємо, чи символ є цифрою
                sum += Character.getNumericValue(c); // Додаємо числове значення цифри до суми
            }
        }
        return sum; // Повертаємо загальну суму
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        String firstTest = "1222nnn"; // Рядок з цифрами
        String secondTest = "hello"; // Рядок без цифр

        System.out.println(sumOfDigits(firstTest));
        System.out.println(sumOfDigits(secondTest));
    }
}

