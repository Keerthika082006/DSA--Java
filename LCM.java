package BasicMath;

public class LCM {
    public static void main(String[] args) {
        System.out.println(fun(12,18));
    }
    static int fun(int a, int b){
        int g = Math.max(a,b);
        int s = Math.min(a,b);

        for(int i = g;i<=a*b;i+=g){
            if(i%s==0){
                return i;
            }
        }
        return a*b;
    }
}
