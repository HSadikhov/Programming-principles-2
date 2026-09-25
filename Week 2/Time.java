import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = sc.nextInt();
        
        
        int hours = totalSeconds / 3600;
        int remainingAfterHours = totalSeconds % 3600;
        
        int minutes = remainingAfterHours / 60;
        int seconds = remainingAfterHours % 60;
        
        System.out.println(totalSeconds + " seconds is equivalent to:");
        System.out.println(hours + " Hours, " + minutes + " Minutes, and " + seconds + " Seconds.");
        
        sc.close();
    }
}