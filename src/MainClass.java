public class MainClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        numbersComparison();
        sumInRangeBetween(1,11);
        positiveVsNegative(-1);
        negativeNum(-7);

    }

    public static void printThreeWords() {
        System.out.println("1)"); //
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }


    public static void checkSumSign() {
        System.out.println("2)"); //
        int a = 9;
        int b = 7;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.println("3)"); //
        int value = 101;

        if (value <= 0) {
            System.out.println("Red");
        }
        else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Green");
        }
    }

    public static void numbersComparison() {
        System.out.println("4)"); //
        int a = 10;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        }
        else if (a < b) {
            System.out.println("a < b");

        }
    }

    public static void sumInRangeBetween(int a, int b) {
        System.out.println("5)"); //
        int sum = a + b;

        if (sum > 10 && sum <= 20) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void positiveVsNegative(int num) {
        System.out.println("6)"); //
        if (num >=0) {
            System.out.println("Положительное значение");
        }
        else {
            System.out.println("Отрицательное значение");
        }
    }

    public static void negativeNum(int a) {
        System.out.println("7)"); //
        if (a < 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }


}