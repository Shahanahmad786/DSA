public class ReverseNumber {

    public static void main(String[] args) {

        int n = 12345;   // Number to reverse
        int reversed = 0;

        // Loop until the number becomes 0
        while (n > 0) {
            int lastDigit = n % 10;      // Extract last digit
            reversed = reversed * 10 + lastDigit;  // Add it to reversed number
            n = n / 10;                  // Remove last digit
        }

        System.out.println("Reversed Number: " + reversed);
    }
}