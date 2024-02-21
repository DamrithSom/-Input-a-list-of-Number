import java.util.Scanner;

public class inputNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input the number of elements
        System.out.print("Input amount of numbers to put in a list: ");
        int numberAmount = input.nextInt();
        
        // Create an array to store the numbers
        int[] numbers = new int[numberAmount];

        // Input numbers
        System.out.println("Input numbers: ");
        for (int i = 0; i < numberAmount; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            
            // Check if the input number is negative
            if (numbers[i] < 0) {
                System.out.println("Please enter a non-negative number.");
                i--; // Go back and take user input again
            }
        }

        // Output numbers
        System.out.println("Output numbers: ");
        for (int i = 0; i < numberAmount; i++) {
            System.out.println(numbers[i]);
        }
        
        input.close();
    }
}
