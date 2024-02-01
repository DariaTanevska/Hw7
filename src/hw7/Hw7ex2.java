package hw7;

public class Hw7ex2 {
    public static void main(String[] args) {
        Hw7ex2 om = new Hw7ex2();
        om.printMessage();
        om.printMessage("Hello, world!");
        String[] arr = {"apple", "banana", "cherry"};
        om.printMessage(arr);
        int[] nums = {1, 2, 3, 4, 5};
        om.printMessage(nums);
        om.printMessage("Hello, world!", 42);
    }

    public void printMessage() {
        System.out.println("Я пустой");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void printMessage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public void printMessage(String message, int num) {
        System.out.println("Ваше сообщение - \"" + message + "\", ваше число - " + num);
    }
}
