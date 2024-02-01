package hw7;

public class Hw7ex1t1 {
    public static void printEvenOdd(int[] arr) {
        System.out.println("Even numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
