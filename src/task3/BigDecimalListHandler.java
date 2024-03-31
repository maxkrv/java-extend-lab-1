package task3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * Клас для роботи зі списком BigDecimal.
 */
public class BigDecimalListHandler {

    /**
     * Заповнює список випадковими значеннями BigDecimal.
     *
     * @param size розмір списку
     * @return список випадкових значень BigDecimal
     */
    public List<BigDecimal> generateRandomBigDecimalList(int size) {
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            double randomValue = Math.random() * 1000 - 500; // Генеруємо випадкове число в діапазоні [-500, 500)
            list.add(BigDecimal.valueOf(randomValue));
        }
        return list;
    }

    /**
     * Сортує список за зменшенням абсолютної величини.
     *
     * @param list список BigDecimal
     */
    public void sortListByAbsoluteValueDescending(List<BigDecimal> list) {
        list.sort((a, b) -> b.abs().compareTo(a.abs()));
    }

    /**
     * Знаходить добуток додатних чисел у списку за допомогою циклів і умовних тверджень.
     *
     * @param list список BigDecimal
     * @return добуток додатних чисел
     */
    public BigDecimal multiplyPositiveNumbersUsingLoops(List<BigDecimal> list) {
        BigDecimal result = BigDecimal.ONE;
        for (BigDecimal num : list) {
            if (num.compareTo(BigDecimal.ZERO) > 0) {
                result = result.multiply(num);
            }
        }
        return result;
    }

    /**
     * Знаходить добуток додатних чисел у списку без явних циклів і розгалужень.
     *
     * @param list список BigDecimal
     * @return добуток додатних чисел
     */
    public BigDecimal multiplyPositiveNumbersUsingCollection(List<BigDecimal> list) {
       BigDecimal result = new BigDecimal("1");

       for (var iterator = list.iterator(); iterator.hasNext();) {
           BigDecimal number = iterator.next();
           if (number.compareTo(BigDecimal.ZERO) > 0) {
                result = result.multiply(number);
           }
       }

       return result;
    }

    /**
     * Знаходить добуток додатних чисел у списку за допомогою Stream API.
     *
     * @param list список BigDecimal
     * @return добуток додатних чисел
     */
    public BigDecimal multiplyPositiveNumbersUsingStreamAPI(List<BigDecimal> list) {
        return list.stream()
                .filter(num -> num.compareTo(BigDecimal.ZERO) > 0)
                .reduce(BigDecimal.ONE, BigDecimal::multiply);
    }

    public static void main(String[] args) {
        BigDecimalListHandler handler = new BigDecimalListHandler();
        List<BigDecimal> list = handler.generateRandomBigDecimalList(10);

        for (BigDecimal element : list) {
            System.out.println("new BigDecimal(\"" + element + "\"),");
        }

        System.out.println("Result with loops: " + handler.multiplyPositiveNumbersUsingLoops(list));
        System.out.println("Result with collection: " + handler.multiplyPositiveNumbersUsingCollection(list));
        System.out.println("Result with Stream API: " + handler.multiplyPositiveNumbersUsingStreamAPI(list));

        System.out.println("Sorted list:");
        handler.sortListByAbsoluteValueDescending(list);

        for (BigDecimal element : list) {
            System.out.println("new BigDecimal(\"" + element + "\"),");
        }
    }
}
