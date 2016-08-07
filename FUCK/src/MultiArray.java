import java.util.*;


public class MultiArray
{
	private int[][] grid;
	
	public MultiArray()
	{
		grid = new int[10][10];
		for(int column = 0; column < 10; column++)
		{			
			for(int row = 0; row < 10; row++)
			{
				grid[column][row] = 1;		
			}
		}
	}
		
	private void printArray()
	{
		for(int column = 0; column < 10; column++)
		{
			for(int row = 0; row < 10; row++)
			{
				System.out.print(grid[column][row]);
			}
			System.out.println("");
		}
	}
	
	public void patternRow()
	{
		for(int column = 0; column < 10; column+=2)
		{			
			for(int row = 0; row < 10; row++)
			{
				grid[column][row] = 0;		
			}
		}
		printArray();
	}
	
	public void patterCheckered(){
		for(int column = 0; column < 10; column++)
		{				
			for(int row = 1; row < 10; row+=2)
			{
				grid[column][row] = 0;		
			}
		}
		for(int column = 0; column < 10; column+=2)
		{				
			for(int row = 1; row < 10; row+=2)
			{
				grid[column][row] = 1;		
			}
		}
		printArray();
	}	
	public void userChoice(){
		Scanner Input = new Scanner(System.in);
		int []userInput;
		userInput = new int[3];
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Please enter our choice: ");
			userInput[i] = Input.nextInt();
		}
		
		printArray();
	}
}
