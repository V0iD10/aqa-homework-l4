public class MainClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumInRangeBetween(1,11);
        positiveVsNegative(-1);
        negativeNum(-7);
        printStringMultipleTimes("Greetings, realm!",3);
        boolean leapYear = leapYear(2015);
        System.out.println(leapYear);
        arrayFlip();
        arrayFilled();
        multiplyTimesTwo();
        squArray();
        OneDeeArray(3,7);


    }

    public static void printThreeWords() {
        System.out.println("1)");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }


    public static void checkSumSign() {
        System.out.println("2)");
        int a = 9;
        int b = 7;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Положительная сумма");
        }
        else {
            System.out.println("Отрицательная сумма");
        }
    }

    public static void printColor() {
        System.out.println("3)");
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

    public static void compareNumbers() {
        System.out.println("4)");
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
        System.out.println("5)");
        int sum = a + b;

        if (sum > 10 && sum <= 20) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void positiveVsNegative(int num) {
        System.out.println("6)");
        if (num >=0) {
            System.out.println("Положительное значение");
        }
        else {
            System.out.println("Отрицательное значение");
        }
    }

    public static void negativeNum(int a) {
        System.out.println("7)");
        if (a < 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void printStringMultipleTimes(String text, int num) {
        System.out.println("8)");
        for (int i = 0; i < num; i++)
            System.out.println(text);
    }

    public static boolean leapYear(int year) {
        System.out.println("9)");
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void arrayFlip() {
        System.out.println("10)");
        int[] array = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            else if (array[i] == 1) {
                array[i] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
    }

    public static void arrayFilled() {
        System.out.println("\n11)");
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int num : array) {
            System.out.print(num + ", \n");
        }
    }

    public static void multiplyTimesTwo() {
        System.out.println("12)");
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }

        System.out.print("x2: ");
        for (int number : numbers) {
            System.out.print(number + ",");
        }
    }

    public static void squArray() {
        System.out.println("\n13)");
        int n = 4;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] OneDeeArray(int len, int initialValue) {
        System.out.println("14)");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        return array;
    }
}