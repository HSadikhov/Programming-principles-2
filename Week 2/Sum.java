import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first integer: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        
        sc.close();

    }

}
