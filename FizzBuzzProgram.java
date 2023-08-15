
import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz ");
            } else if (i % 5 != 0 && i % 3 == 0) {
                System.out.println("Fizz ");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}