class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;
        int land=0;
        int neigh = 0;

        for(int i=0; i<rows; i++){
            for (int j = 0; j<col ; j++){
                if(grid[i][j]==1){
                    land++;

                    if(i<rows-1 && grid[i+1][j]==1)
                    neigh++;

                    if(j<col-1 && grid[i][j+1]==1)
                    neigh++;
                }
            }
        }
        return land*4 - neigh*2;
    }
}