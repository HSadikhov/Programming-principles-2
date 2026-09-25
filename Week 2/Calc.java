public class Calc {
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Please provide exactly two integers as arguments.");
            return;
        }

        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

       
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        
    
        if (num2 != 0) {
            System.out.println("Integer Division: " + (num1 / num2));
            System.out.println("Remainder: " + (num1 % num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}