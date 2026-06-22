class Solution {
    public boolean checkGoodInteger(int n) {
        int Sum=0, square=0;
        while(n>0){
            int b = n%10;
            Sum+=b;
            square+=(b*b);
            n=n/10;
        }
        if((square-Sum)>=50){
            return true;
        }else{
            return false;
        }
    }
}