import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        
        scanner.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
