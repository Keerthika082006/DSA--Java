package BasicMath;

import com.sun.jdi.PathSearchingVirtualMachine;

import static BasicMath.LCM_HCF.gcd;

public class LCM_HCF {

    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int[] res = new int[2];
        int g = gcd(a, b);       // find gcd
        int l = lcm(a,b);     // find lcm using formula

        // add values into array
        res[0] = l;  // LCM
        res[1] = g;  // GCD

        return res;


    }

     static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }

     static int lcm(int a, int b){
            return (a/gcd(a,b))*b;
        }

    public static void main(String[] args) {
        int[] result = lcmAndGcd(12, 18);
        System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);
    }
    }


