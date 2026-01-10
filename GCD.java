package basicmath;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GCD {
    public static void main(String[] args) {


    Scanner obb = new Scanner(System.in);
    int n1 = obb.nextInt();
    int n2 = obb.nextInt();
//-----------------------------------------
    for (int i=1;i<=min(n1,n2);i++){
        if(n1%i==0 && n2%i==0){
            System.out.println(i);

        }
    }
//-------------------------------------------
//        for(int i=min(n1,n2);i>=1;i++){
//            if(n1%i==0 && n2%i==0){
//                System.out.println(i);
//                break;
//            }
//        }
//---------------------------------------------

}}
