package task2;

import java.math.BigInteger;
import java.util.Random;

/**
 * Клас, що містить методи для генерації випадкового числа типу BigInteger та обчислення цілої степені цього числа.
 */
public class Main {

    /**
     * Генерує випадкове число типу BigInteger заданої довжини.
     *
     * @param length довжина числа
     * @return випадкове BigInteger числo
     */
    public static BigInteger generateRandomBigInteger(int length) {
        Random rand = new Random();
        StringBuilder numStr = new StringBuilder();

        // Генеруємо випадкові цифри та додаємо до рядка
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                numStr.append(rand.nextInt(9) + 1);
            } else {
                numStr.append(rand.nextInt(10));
            }
        }

        return new BigInteger(numStr.toString());
    }

    /**
     * Обчислює цілу степінь числа base за допомогою методу pow().
     *
     * @param base     основа
     * @param exponent показник степеня
     * @return результат піднесення числа base до степеня exponent
     */
    public static BigInteger calculatePower(BigInteger base, int exponent) {
        return base.pow(exponent);
    }

    /**
     * Обчислює цілу степінь числа base за допомогою множення.
     *
     * @param base     основа
     * @param exponent показник степеня
     * @return результат піднесення числа base до степеня exponent
     */
    public static BigInteger calculatePowerUsingMultiplication(BigInteger base, int exponent) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < exponent; i++) {
            result = result.multiply(base); // множення
        }
        return result;
    }

    /**
     * Точка входу в програму.
     *
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        int length = 20; // довжина випадкового числа
        int exponent = 5; // показник степеня

        // Генеруємо випадкове число
        BigInteger base = generateRandomBigInteger(length);

        // Обчислюємо степінь числа з використанням pow()
        BigInteger resultWithPow = calculatePower(base, exponent);

        // Обчислюємо степінь числа з використанням множення
        BigInteger resultWithMultiplication = calculatePowerUsingMultiplication(base, exponent);

        // Виводимо результати
        System.out.println("Base number: " + base);
        System.out.println("Exponent: " + exponent);
        System.out.println("Result using pow(): " + resultWithPow);
        System.out.println("Result using multiplication: " + resultWithMultiplication);
    }
}