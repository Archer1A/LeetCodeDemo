public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0 ){
            return false;
        }
        String  a = String.valueOf(x);
        StringBuilder sb = new StringBuilder(a);
        String res = sb.reverse().toString();
        if (res.equals(a)){
            return true;
        }else {
            return false;
        }

    }
}
