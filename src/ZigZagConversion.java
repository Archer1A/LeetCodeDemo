public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return  s;
        StringBuilder result = new StringBuilder();
        int cycleLenth  = 2 * numRows -2;
        for (int i =0; i<numRows;i++){
            for (int j =0; j +i< s.length();j+=cycleLenth){
                result.append(s.charAt(i+j));
                if (i != 0 && i != numRows-1 && j +cycleLenth - i <s.length() ){
                    result.append(s.charAt(j+cycleLenth -i));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
}
