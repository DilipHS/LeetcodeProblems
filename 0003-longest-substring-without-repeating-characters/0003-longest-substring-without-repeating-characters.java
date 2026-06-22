class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] t = new int[256];
        for(int i = 0; i<256; i++){
            t[i]=-1;
        }
        int le=0;
        int ma=0;

        for(int j = 0; j < s.length(); j++){
            char ch = s.charAt(j);
            if(t[ch]>=le){
                le = t[ch]+1;
            }
            t[ch] = j;
            ma=Math.max(ma,j-le+1);
        }
        return ma;
    }
}