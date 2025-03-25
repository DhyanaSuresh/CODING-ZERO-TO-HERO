import java.util.Scanner;  

public class FirstLastDigit {  
	
    // Method to find the first digit  
    public static int firstDigit(int n) {  
        while (n >= 10)  
            n /= 10;  
        return n;  
    }  

    // Method to find the last digit  
    public static int lastDigit(int n) {  
        return n % 10;  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        // Prompt user input
        System.out.print("Enter a number: ");  
        int n = scanner.nextInt();  
        
        // Close scanner
        scanner.close();  

        // Display first and last digit
        System.out.println("First Digit: " + firstDigit(n));  
        System.out.println("Last Digit: " + lastDigit(n));  
    }  
}
