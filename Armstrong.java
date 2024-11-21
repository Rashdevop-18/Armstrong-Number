import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        

        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length(); // Get the number of digits

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n); // Add the nth power of each digit
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
