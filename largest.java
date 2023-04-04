import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // initialize a variable to hold the largest number
        double largest = 0;

        // compare the three numbers using conditional statements to find the largest number
        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        // print the largest number
        System.out.println("The largest number is: " + largest);

        input.close();
    }
}
