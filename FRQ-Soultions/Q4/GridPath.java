import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    if(row!=4 && col!=4){
      if(grid[row+1][col]>grid[row][col+1]){
        Location xy= new Location(row,col+1); 
        return xy;
      }else{
        Location xy= new Location(row+1, col);
        return xy;
      }
    }else if(row!=4){
      Location xy= new Location(row+1, col);
      return xy;
    }else{
      Location xy= new Location(row, col+1);
      return xy; 
    }
  }

  
  // PART B
  public int sumPath(int row, int col) {
    int sum=0; 
    while(row!=4||col!=4){
      Location yx= getNextLoc(row,col);
      sum+=grid[row][col];
      row=yx.getRow();
      col=yx.getCol();
    }
    return sum; 
  }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
