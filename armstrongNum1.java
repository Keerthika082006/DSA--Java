package basicmath;

import java.util.Scanner;

import java.util.Scanner;

public class armstrongNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        // count digits
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int last = num % 10;
            sum += Math.pow(last, digits);  // digit^digits
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
