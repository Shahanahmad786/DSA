import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;       // extract digit
            sum += digit * digit * digit; // cube of digit
            num = num / 10;             // remove last digit
        }

        if(sum == original){
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}