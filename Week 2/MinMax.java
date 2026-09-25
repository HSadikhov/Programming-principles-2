import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter floating-point numbers (Press Ctrl+Z then Enter to finish):");
        
        
        if (sc.hasNextDouble()) {
           
            double min = sc.nextDouble();
            double max = min;
            
            
            while (sc.hasNextDouble()) {
                double current = sc.nextDouble();
                
                if (current < min) {
                    min = current;
                }
                
                if (current > max) {
                    max = current;
                }
            }
            
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        } else {
            System.out.println("No valid numbers were entered.");
        }
        
        sc.close();
    }
}