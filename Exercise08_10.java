/******************************************************************************
 * This program creates and prints a 4x4 grid randomly populated with ones or
 * zeros. Then it prints witch row and column has the largest number of ones
 * respectively
 ******************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise08_10 {
    public static void main(String[] args) {
        int[][] grid = makeGrid();
        
        //print the grid
        for(int[] col : grid){
            for(int row : col){
                System.out.print(row);
            }
            System.out.println("");
        }
        
        //largest row
        int largestRow = findLargestRow(grid);
        
        System.out.println("The largest row index: " + largestRow);
        
        int largestCol = findLargestCol(grid);
        
        System.out.println("The largest column index: " + largestCol);
    }
    
    public static int[][] makeGrid(){
        int[][] grid = new int[4][4];
        for (int col = 0; col < grid.length; col++) {
            for (int row = 0; row < grid[col].length; row++) {
                grid[col][row] = (int)(Math.random()*2);
            }
        }
        return grid;
    }
    
    public static int findLargestRow(int[][] grid){
        int maxRow = 0;
        int maxRowSize = 0;
        for(int row = 0; row < grid.length; row++){
            int rowSize = grid[row][0] + grid[row][1] + grid[row][2] + grid[row][3];
            
            if(rowSize > maxRowSize){
                maxRowSize = rowSize;
                maxRow = row;
            }
        }
        return maxRow;
    }
    
    public static int findLargestCol(int[][] grid){
        int maxCol = 0;
        int maxColSize = 0;
        for(int col = 0; col < grid.length; col++){
            int colSize = grid[0][col] + grid[1][col] + grid[2][col] + grid[3][col];
            
            if(colSize > maxColSize){
                maxColSize = colSize;
                maxCol = col;
            }
        }
        return maxCol;
    }
}
