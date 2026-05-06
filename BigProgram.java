public class BigProgram {

    public static void main(String[] args) {
        System.out.println("Starting Big Java Program...version 2");

        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            sum += i;
            if (i % 100 == 0) {
                System.out.println("Reached: " + i + " Sum: " + sum);
            }
        }

        printFibonacci(20);
        printPrimeNumbers(50);

        System.out.println("Final Sum: " + sum);
        System.out.println("Program Completed!");
    }

    public static void printFibonacci(int n) {
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void printPrimeNumbers(int limit) {
        System.out.println("Prime Numbers:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
System.out.println("CI/CD test successful!");
