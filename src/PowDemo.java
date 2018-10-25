import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class PowDemo {
    public  static  double myPow(double x, int n) {
        if (n == 0){
            return  1;
        }
        int a = n / 2;
        int b = n % 2 ;
        if (a != 0){
            if (b ==0){
                double result = myPow(x,a);
               // if (a<0) result = 1/result;
                return result*result;
            }else {
                double result = myPow(x,a);
                if (a<0){
                    result = result*result / x;
                }else {
                    result = result*result*x;
                }
                return result;
            }
        }else {
            return n < 0? 1/x:x;
         //   return x;
        }

    }

    public static void main(String[] args) {
        System.out.println(myPow(2,-3));
    }
}
