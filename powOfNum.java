package BasicMath;

public class powOfNum {
    public static void main(String[] args) {
        System.out.println(fun(2,4));
    }
    static int fun(int base,int exp){
        int result = 1;
        for(int i = 0;i<exp;i++){
            result *= base;
        }
        return result;
    }
}
