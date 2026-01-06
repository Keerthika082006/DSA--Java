package basicmath;

public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println(fun(3,1));
    }
    static int fun (int num,int i){
         int sum =0;
         while(i<=num){
            sum+=i;
            i++;
         }
        return sum;
    }
}