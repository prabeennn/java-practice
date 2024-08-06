package looping;
import java.util.Scanner;
public class Automorfic {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

    // Function to check if a number is automorphic
    static boolean isAutomorphic(int num) {
        long square = (long) num * num; // Use long to avoid overflow

        // Count the number of digits in the given number
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int lastDigits = (int) (square % Math.pow(10, count));

        return lastDigits == num;
    }
}
