class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int cycle = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < n; j += cycle) {
                result.append(s.charAt(j));

                int secondIndex = j + cycle - 2 * row;

                if (row != 0 && row != numRows - 1 && secondIndex < n) {
                    result.append(s.charAt(secondIndex));
                }
            }
        }

        return result.toString();
    }
}