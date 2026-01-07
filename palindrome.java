package basicmath;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int num = ob.nextInt();

        int originalVal = num;

        int rev = 0;

        while (num > 0) {
           int  las = num % 10;
            rev = (rev*10)+las;
            num = num / 10;
            System.out.print(las);

        }
       if (rev==originalVal) {
            System.out.println("the given num  is palindrome");
        }
       else {
            System.out.println("the given num is not a palindrome");
        }
    }

    }

