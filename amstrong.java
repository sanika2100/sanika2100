import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int originalNum = number; 
        int sum = 0; 
        while (number != 0) {
            int digit = number % 10; 
            sum += digit * digit * digit; 
            number = number / 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}