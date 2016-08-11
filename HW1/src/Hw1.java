import java.util.Scanner;

public class Hw1 {
	public static final int NUMBER_OF_WORDS=10;
	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);

		String[] words=new String[NUMBER_OF_WORDS];
		for(int i=0; i<NUMBER_OF_WORDS; i++){
			System.out.print("Word: ");
			words[i]=userInput.next();
		}


		System.out.print("Enter word to search for :");
		String searched=userInput.next();
		wordCount(words, searched);

		userInput.close();

	}
	
	public static boolean wordCount(String[] words, String word){
		int count = 0;
		for(String i:words){
			if(i.equals(word)){
				count++;
			}
		}
		System.out.println(count);
		return count>0;
	}
}
