import java.util.Scanner;

public class MultiArray
{
	private int[][] grid;

	public MultiArray(){
		grid = new int[10][10];
		for(int col = 0; col < 10 ; col++)
		{

			for(int row = 0; row < 10; row++)
			{
				grid[row][col] = 1;		
			}
		}
		printArray();
	}

	private void printArray(){
		for(int[] row:grid){
			for(int col:row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public void patternRow(){
		for(int row = 0; row < 10 ; row++){
			for(int col = 0; col < 10; col++)
			{
				grid[row][col] = row%2;		
			}
		}
		printArray();
	}

	public void patternCheckered(){
		for(int row = 0; row < 10 ; row++)
		{
			for(int col = 0; col < 10; col++)
			{
				grid[row][col] = (row+col)%2;;		
			}
		}
		printArray();
	}

	public void userChoice(){
		Scanner scan=new Scanner(System.in);
		int[] pattern=new int[3];
		for(int choices=0; choices<3; choices++){
			System.out.print("Please enter your choice: ");
			pattern[choices]=scan.nextInt();
		}
		scan.close();
		for(int col = 0; col < 10 ; col++)
		{
			for(int row = 0; row < 10; row++)
			{
				grid[col][row] = pattern[(row+col)%3];		
			}
		}
		printArray();
	}
	
	public void sumArray(){
		int total=0;
		for(int row=0; row<10; row++){
			int rowSum=0;
			for(int col=0; col<10; col++){
				rowSum+=grid[row][col];
				total+=grid[row][col];
			}
			System.out.println("Total for row "+row+": " + rowSum);
		}
		System.out.println("Total sum:" +total);
	}

}
