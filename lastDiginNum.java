package basicmath;

public class lastDiginNum {
    public static void main(String[] args) {
        System.out.println(getLastDigit("6","2"));
    }

        static int getLastDigit(String a, String b) {
            // code here
            if(b.equals("0")){
                return 1;
            }
            int lastdig = a.charAt(a.length()-1)-'0';

            int exp = modulo(4,b);
            if(exp==0){
                exp=4;
            }
            int result =1;
            for(int i =0;i<exp;i++){
                result = result*lastdig;
            }
            return result%10;
        }
        private static int modulo(int a,String b){
            int res = 0;
            for(int i = 0;i<b.length();i++){
                res = (res*10+(b.charAt(i)-'0'))%a;
            }
            return res;
        }

    }