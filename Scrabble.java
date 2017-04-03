import java.util.ArrayList;
public class Scrabble 
{
	public static void main (String[] args)
	{
		System.out.println("Hello, and welcome to Scrabble. This is a variance of Scrabble with only two players.");
		System.out.println("Each player, when it is his/her turn, has to put a word on the board.");
		System.out.println("Depending on the word, the player will recieve a certain amount of points based on the amount ");
		System.out.println("and type of letters used. Below are the point values per letter.");
		System.out.println("1 point -A, E, I, O, U, L, N, S, T, R");
		System.out.println("2 points-D, G");
		System.out.println("3 points-B, C, M, P");
		System.out.println("4 points-F, H, V, W, Y");
		System.out.println("5 points-K");
		System.out.println("8 points- J, X");
		System.out.println("10 points-Q, Z.");
		
		Gameboard play = new Gameboard();
		play.game();// This calls on the game method from gameboard and executes the main part of the program

		Scoring points = new Scoring();
		
		ArrayList<String> list1 = play.getGameList1();// This sets the list from gameboard to a new variable
		ArrayList<String> list2 = play.getGameList2();// This sets the list from gameboard to a new variable
		String scrabblename1 = play.Name1;// This sets the string from gameboard to a new variable
		String scrabblename2 = play.Name2;// This sets the string from gameboard to a new variable
		
		System.out.println(scrabblename1 + " has entered " + list1);
		points.score(list1);// The list with all the words are added to the score paramter in Scoring class so that each indivdual letter is given a point. It prints out each letter from the word entered as well as the overall points.
		System.out.println();
		
		System.out.println(scrabblename2 + " has entered " + list2);
		points.score(list2);// The list with all the words are added to the score paramter in Scoring class so that each indivdual letter is given a point. It prints out each letter from the word entered as well as the overall points.
		System.out.println();
	}
}