package BasicMath;

public class primeNum {
    public static void main(String[] args) {
        System.out.println(fun(7));
    }
    static boolean fun(int n ){
        if(n<=1){
            return false;
        }
        if(n%2==0||n%3==0){
            return false;
        }
        if(n==2||n==3){
            return true;
        }
        for(int i = 5; i<=Math.sqrt(n);i=i+6){
            if(n%i==0||n%(2+i)==0){
                return false;
            }
        }
        return true;
    }
}
