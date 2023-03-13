public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
//            Пишем код для задачи 1
        int[] arr = generateRandomArray();
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int[] arr = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
                        if (arr[i] > max) {
                max = arr[i];
            }
                    }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int[] array = generateRandomArray();
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + (double) array[i] / array.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i < reverseFullName.length && i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
