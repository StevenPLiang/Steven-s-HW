import java.util.*;

public class Hw2 {
	
	public static void main(String[] args)
	{	
		int[][] grid;
		grid = new int[10][10];
//		int i;
//		i = 0;
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
}
