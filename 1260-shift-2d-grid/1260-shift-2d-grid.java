class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        while (k > 0) {
            int[][] d = new int[row][col];
            d[0][0] = grid[row - 1][col - 1];
            for (int j = 1; j < col; j++) {
                d[0][j] = grid[0][j - 1];
            }
            for (int i = 1; i < row; i++) {
                d[i][0] = grid[i - 1][col - 1];
                for (int j = 1; j < col; j++) {
                    d[i][j] = grid[i][j - 1];
                }
            }

            grid = d;
            k--;
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < col; j++) {
                temp.add(grid[i][j]);
            }

            ans.add(temp);
        }

        return ans;
    }
}