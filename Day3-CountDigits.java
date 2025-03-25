import java.util.Scanner;  

class CountDigits {  

    // Function to count digits  
    static int countDigit(int n) {  
        // Base case for zero  
        if (n == 0)  
            return 1;  

        int count = 0;  

        // Iterate till n has digits remaining  
        while (n != 0) {  
            // Remove rightmost digit  
            n = n / 10;  
            // Increment digit count  
            ++count;  
        }  
        return count;  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        // Prompt user input  
        System.out.print("Enter a number: ");  
        int n = scanner.nextInt();  
        
        // Close scanner  
        scanner.close();  

        // Display count of digits  
        System.out.println("Number of digits: " + countDigit(n));  
    }  
}
