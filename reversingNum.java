package basicmath;

import java.util.Scanner;

public class reversingNum {

        public static void main(String[] args) {
            Scanner ob = new Scanner(System.in);
            int num = ob.nextInt();

            int rev = 0;
            while(num>0){
                int lastDig = num%10;

                if(lastDig!=0) {
                    rev = (rev * 10) + lastDig;
                }
                num = num/10;


            }
            System.out.println( rev);
}}
