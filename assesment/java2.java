import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double smallest = (num1 < num2) ? num1 : num2;

        System.out.println("The smallest number is: " + smallest);
        
        scanner.close();
    }
}