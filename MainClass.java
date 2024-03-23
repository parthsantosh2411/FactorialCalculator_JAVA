import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers to calculate their factorials:");
        String[] input = scanner.nextLine().split("\\s+");

        for (String arg : input) {
            try {
                int num = Integer.parseInt(arg);
                int fact = FactorialCalculator.factorial(num);
                System.out.println("Factorial of " + num + " is: " + fact);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " is not a valid integer");
            } catch (FactorialException e) {
                System.out.println(e.toString());
            }
        }
        scanner.close();
    }
}