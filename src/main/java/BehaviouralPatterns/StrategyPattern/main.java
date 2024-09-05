package BehaviouralPatterns.StrategyPattern;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*Strategy Pattern: Strategy Pattern is a behavioural pattern that lets you
        define a family of algorithms put each of them into separate classes and make their objects interchangeable.
         */
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();

        // Read first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Read second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Read the desired action
        System.out.print("Enter the desired action (addition, subtraction, multiplication): ");
        String action = scanner.next();

        // Set the strategy based on user input
        if (action.equalsIgnoreCase("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equalsIgnoreCase("subtraction")) {
            context.setStrategy(new ConcreteStrategySub());
        } else if (action.equalsIgnoreCase("multiplication")) {
            context.setStrategy(new ConcreteStrategyMul());
        } else {
            System.out.println("Invalid action!");
            scanner.close();
            return;
        }

        // Execute the strategy and print the result
        int result = context.excecuteStrategy(firstNumber, secondNumber);
        System.out.println("Result: " + result);

        scanner.close();



    }
}
