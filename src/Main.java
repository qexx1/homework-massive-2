public class Main {
    public static void main(String[] args) {
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        //task 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum);


        //task 2
        int[] arr1 = generateRandomArray();
        int max = 99_999;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("Макс. сумма трат составила " + max);
        int[] arr2 = generateRandomArray();
        int min = 200_001;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }
        System.out.println("Мин. сумма трат составила " + min);

        //task 3
        int[] arr3 = generateRandomArray();
        int sum1 = 0;
        for (int j: arr3) {
            sum1 += j;
        }
        double average = (double) sum1/ arr3.length;
        System.out.println("Средняя сумма трат за месяц " + average);

        //task 4
        char[] reverseFullName = {'n','a','v','I',' ', 'v', 'o', 'n','a','v','I'};
        char a = 0;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            a += reverseFullName[i];
            System.out.println(a);
        }
    }
}