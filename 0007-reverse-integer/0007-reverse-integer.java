class Solution {
    public int reverse(int x) {
        boolean isNegative = x<0;
        String s = Integer.toString(Math.abs(x));
        String reverse = new StringBuilder(s).reverse().toString();

        try{
            int result = Integer.parseInt(reverse);
            return isNegative ? -result:result;
        }catch(NumberFormatException e){
            return 0;
        }
    }
}