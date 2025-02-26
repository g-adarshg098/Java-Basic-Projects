import java.util.*;  

public class Calculator {  

    // Function to display the calculator menu  
    public static String calculatorDisplay() {  
        return "Welcome to Calculator\n\n" +  
               "Choose one operation:\n" +  
               "1. Add\n" +  
               "2. Subtract\n" +  
               "3. Multiply\n" +  
               "4. Divide\n" +  
               "5. Exit\n";  
    }  

    // Function to get user input and store in an array  
    public static void userInput(Scanner scanner, int[] numbers) {  
        System.out.println("Give two numbers on two lines");  
        System.out.print("Number 1 is: ");  
        numbers[0] = scanner.nextInt();  
        System.out.print("Number 2 is: ");  
        numbers[1] = scanner.nextInt();  
    }  

    // Function to perform addition  
    public static int addition(int a, int b) {  
        return a + b;  
    }  

    // Function to perform subtraction  
    public static int subtraction(int a, int b) {  
        return a - b;  
    }  

    // Function to perform multiplication  
    public static int multiply(int a, int b) {  
        return a * b;  
    }  

    // Function to perform division  
    public static String divide(int a, int b) {  
        if (b == 0) {  
            return "Error: Division by zero!";  
        }  
        return "The Quotient is: " + (a / b);  
    }  

    // Function to handle the calculator operations  
    public static String calculatorFunction(int userChoice, Scanner scanner) {  
        int[] numbers = new int[2];  
        String result = "";  

        switch (userChoice) {  
            case 1: // Addition  
                userInput(scanner, numbers);  
                int sum = addition(numbers[0], numbers[1]);  
                result = "The sum is: " + sum;  
                break;  
            case 2: // Subtraction  
                userInput(scanner, numbers);  
                int difference = subtraction(numbers[0], numbers[1]);  
                result = "The difference is: " + difference;  
                break;  
            case 3: // Multiplication  
                userInput(scanner, numbers);  
                int product = multiply(numbers[0], numbers[1]);  
                result = "The product is: " + product;  
                break;  
            case 4: // Division  
                userInput(scanner, numbers);  
                result = divide(numbers[0], numbers[1]);  
                break;  
            case 5: // Exit  
                result = "Exiting the calculator, bye bye!";  
                break;  
            default:  
                result = "Invalid option! Please choose a valid operation.";  
        }  

        return result;  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int userChoice;  

        while (true) {  
            // Display the calculator menu  
            System.out.println(calculatorDisplay());  

            System.out.print("Select the operation: ");  
            userChoice = scanner.nextInt();  

            // Process the user choice and get result  
            String result = calculatorFunction(userChoice, scanner);  
            System.out.println(result);  

            // Exit the loop if the user chose to exit  
            if (userChoice == 5) {  
                break;  
            }  
        }  

        // Close scanner to prevent resource leak  
        scanner.close();  
    }  
}
