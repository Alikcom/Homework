package Lessons;

public class Homework1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\n" +
                "Banana\n" +
                "Apple");
    }
    public static void checkSumSign() {
        int a = 5;
        int b = -9;
        if (a + b >= 0) {
            System.out.println("Сумма чисел положительная");
        } else {
            System.out.println("Сумма чисел отрицательная");
        }

    }
    public static void printColor() {
        int value = 20;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Синий");
        }
        if (value > 100){
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = -115;
        int b = 124;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
