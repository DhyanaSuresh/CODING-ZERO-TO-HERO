import java.util.Scanner;

class ReverseArray {
    
    // function to reverse an array
    static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        // Get array elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array
        reverseArray(arr);

        // Print reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
