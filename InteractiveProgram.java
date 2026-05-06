import java.util.Scanner;

public class InteractiveProgram {

    public static void main(String[] args) {

        System.out.println("=== Interactive Java Program ===");

        // If arguments are passed (Jenkins mode)
        if (args.length > 0) {
            System.out.println("Running in CI mode...");

            int num = Integer.parseInt(args[0]);

            System.out.println("Number: " + num);
            System.out.println("Square: " + (num * num));
            System.out.println("Cube: " + (num * num * num));

            System.out.println("CI/CD execution completed!");
        } 
        else {
            // Local interactive mode
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Square: " + (num * num));
            System.out.println("Cube: " + (num * num * num));

            System.out.println("Local execution completed!");
        }
    }
}


