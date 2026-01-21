public class print_name_n {

    public static void printNumber(int n, int current) {
        // base condition → stop when current becomes greater than n
        if (current > n)
            return;

        System.out.println(current);

        printNumber(n, current + 1);   // recursive call to move to next number
    }

    public static void main(String[] args) {
        printNumber(5, 1);   // prints 1 to 5
    }
}