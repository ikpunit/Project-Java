import java.util.scanner;
public class Calculator {
    public static void maijn(String[]args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("1.Addition (+)");
        System.out.println("2.Subtraction (-)");
        System.out.println("3.Multiplication (*)");
        System.out.println("4.Division (/)");
        System.out.println("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        System.out.println("Enter first number: ");
        double result;
        switch (choice) {
            case1:
            result = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = "+ result);
            break;
            case2:
            result = num1 - num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = "+ result);
            break;
            case3:
            result = num1 * num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = "+ result);
            break;
            case4:
            if (num2 != 0){
            result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = "+ result);
            } else {
                System.out.println("Error! Dicision by zero is not allowed.")
            }
            break;

        default:
        System.out.println("Invalid choice! Please select a valid operation.");
        break;
            
            
        }   
        scanner.close();
            
            
    }
}
