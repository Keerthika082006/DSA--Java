package basicmath;

public class perfectNum{
    public static void main(String[] args) {
        System.out.println(fun(8));
        }
        static int sum = 0;
        static boolean fun(int n){
            for(int i =1;i<n;i++){
                if(n%i==0){
                    System.out.println(i);
                    sum+=i;
                }
            }
            System.out.println(sum);
            if(n==sum){
                return true;
            }
            else{
                return false;
            }
        }
    }

