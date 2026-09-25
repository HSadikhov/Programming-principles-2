import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int originalNum = sc.nextInt();
        
        
        int num = Math.abs(originalNum);
        
        int sum = 0;
        int product = 1;
        int count = 0;
        
        
        if (num == 0) {
            sum = 0;
            product = 0;
            count = 1;
        } else {
            
            while (num > 0) {
                int digit = num % 10; 
                
                sum += digit;
                product *= digit;
                count++;
                
                num /= 10; 
            }
        }
        
        
        double average = (double) sum / count;
        
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
        System.out.println("Average of digits: " + average);
        
        sc.close();
    }
}