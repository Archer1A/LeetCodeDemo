public class ReverseInteger {
    public static int reverse(int x){
       if (x <= Integer.MIN_VALUE || x ==0  || x > Integer.MAX_VALUE+1){
           return 0;
       }else if (x <10&& x > -10){
           return x;
       }
       int symbol = 1;
       if (x < 0 ){
           symbol = -1;
       }
       x = x*symbol;
        StringBuilder sb = new StringBuilder();
       while (x >= 10){
           sb.append(Integer.toString((x % 10)));
           x = x / 10;
       }
        sb.append(Integer.toString((x)));
        return Integer.parseInt(sb.toString()) * symbol;
    }


}
