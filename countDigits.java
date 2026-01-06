package basicmath;

public class countDigits {
    static int fun(int n){
        int count =0;
        int original = n;

        while(n>0){
            // last digit
            int last = n%10;

            
            if(last != 0 && original%last==0){
                count++;
            }
            //removing last digit
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fun(12));
    }
}

