public class MultiArray
{
	private int[][] grid;
	
	public MultiArray(){
		grid = new int[10][10];
		for(int column = 0; column < 10 ; column++)
		{
				
			for(int row = 0; row < 10; row++)
			{
				grid[column][row] = 1;		
				System.out.print(grid[column][row]);
			}
			System.out.println("");
		}
		System.out.println("");	
	}
		
	public static void patternRow(){
		
	}
	
}
