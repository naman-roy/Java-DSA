import java.util.Scanner;

public class SingleLineArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the entire line of input
        System.out.println("Enter the array elements in a single line:");
        String inputLine = scanner.nextLine();
        
        // Split the input line into an array of strings where each string is a single character
        String[] stringArray = inputLine.split("");
        
        // Create an array of integers to hold each digit
        int[] intArray = new int[stringArray.length];
        
        // Convert each string to an integer and store it in the array using parseInt
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        
        // Print the array to verify
        System.out.println("The array elements are:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
