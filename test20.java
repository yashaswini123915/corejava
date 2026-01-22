package corejavaprograms;

public class test20 {

    public static void main(String[] args) {
        int n = 153; // 153 is a classic Armstrong number (1^3 + 5^3 + 3^3)
        int temp = n;
        int remainder, sum = 0;

        // Use temp > 0 so we don't destroy the original value of n
        while (temp != 0) {
            remainder = temp % 10;          // Get the last digit
            sum = sum + (remainder * remainder * remainder); // Cube it and add to sum
            temp = temp / 10;               // Remove the last digit
        }

        if (n == sum) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}