package BasicMath;

public class findMissingNUm {
    public static void main(String[] args) {
           int[] arr={1,2,4,5};
        System.out.println(fun(arr,5));
    }
    static int fun(int[] arr ,int n){
        int sum =0;
        int total = n*(n+1)/2;
        for(int display:arr){
            sum+=display;
        }
        return total-sum;
    }
}
