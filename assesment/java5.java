import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is an " + result + " number.");
        
        scanner.close();
    }
}
