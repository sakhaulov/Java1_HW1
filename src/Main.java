import java.util.Random;

public class Main {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Жёлтый");
        } else if (value > 100) {
            System.out.println("Зелёный");
        }

    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(200);
        int b = rand.nextInt(200);

        System.out.println("-- Запускаем printThreeWords");
        printThreeWords();
        System.out.println("-- Запускаем checkSumSign");
        checkSumSign(a, b);
        System.out.println("-- Запускаем printColor");
        printColor(a);
        System.out.println("-- Запускаем compareNumbers");
        compareNumbers(a, b);

    }
}

