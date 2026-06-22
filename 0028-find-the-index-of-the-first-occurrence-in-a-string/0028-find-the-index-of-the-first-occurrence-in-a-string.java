class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            String sub = "";

            for (int j = i; j < i + m; j++) {
                sub += haystack.charAt(j); // slow string building
            }

            if (sub.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
