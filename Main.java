import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers you wish to enter: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        int ind = 0;
        while (ind < n) { // Modified loop condition
            System.out.print("Enter number " + (ind + 1) + ": ");
            numbers[ind] = scanner.nextInt();
            ind++;
        }

        int[] count = count(numbers);
        printCounts(count); // Call printCounts method after counting
    }

    public static int[] count(int[] numbers) {
        int[] count = new int[101]; // Modified length to 101

        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i]]++;
        }

        return count;
    }

    public static void printCounts(int[] count) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("The number " + i + " appears " + count[i] + " times.");
            }
        }
    }
}