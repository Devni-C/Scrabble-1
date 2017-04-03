import java.util.*;
import java.io.*;
import java.util.Random;
public class Gameboard
{
	private ArrayList<String> boardlist1 = new ArrayList<String>(); // This is where we initialize a string list
	private ArrayList<String> boardlist2 = new ArrayList<String>(); //This is where we initialize the other string list
	public String Name1; // This is where we initialize the string Name1 and and set that equal to whatever player 1 entereed as a name
	public String Name2; // This is where we initialize the string Name2 and and set that equal to whatever player 2 entereed as a name
	public ArrayList<String> getGameList1() // This is where the getGameList1 retrieves the list of player 1 words that was entered and sets it to public so that other classes will use it
	{
		return boardlist1;
	}
	public ArrayList<String> getGameList2() // This is where the getGameList2 retrieves the list of player 2 words that was entered and sets it to public so that other classes will use it
	{
		return boardlist2;
	}	
	public void game() // This is where all information the user enteres is process and handled in order to play the game.
	{
		Random random = new Random(); // We initialize the random component (explained later down the page)
		int randnum, randnum1, randnum2;
		char randchar, randchar1, randchar2;
		boardlist1 = new ArrayList<String>();
		boardlist2 = new ArrayList<String>();
		Scanner key1 = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);
		Scanner key3 = new Scanner(System.in);
		Scanner key4 = new Scanner(System.in);
		
		System.out.println("Player 1, please insert a name: ");
		Name1 = key3.nextLine();
		
		System.out.println("Player 2, please insert a name: ");
		Name2 = key4.nextLine();
		
		System.out.println(Name1 + " enter a word.");
		String str1 = key1.nextLine();
		boardlist1.add(str1);// When the player 1 enters a word it adds to the appropriate list associated with the player

		randnum = random.nextInt(str1.length());// Here the randnum is set equal to a random number based on how long the string length is of what player 1 one has entered
		randchar = str1.charAt(randnum);// The number from randnum then picks a letter associated with that number based on the what the string is and is set to equal randchar
		
		System.out.println(Name2 +" enter word starting with the letter: " + Character.toLowerCase(randchar));// Player 2 has to enter a word starting with the letter retirieved from ranchar and is set to lower case so it isn't case sensitive
		String str2 = key2.nextLine();
		if (str2.toLowerCase().charAt(0) != Character.toLowerCase(randchar))// This if statement checks if the the first letter of the word Player 2 entered does not match the randchar, then it will execute the body. Also, it is set to lower case so it isn't case sensitive
		{
			while (str2.toLowerCase().charAt(0) != Character.toLowerCase(randchar))// This while statement continuously gives out this error as long as the if statement is true
			{
				System.out.println("Word entered does not begin with the letter specified, word should start with: " + Character.toLowerCase(randchar));
				str2 = key2.nextLine();
			}
		}
		else// If the if statement is false and the letters do equal to each other, the word entered by player 2 will be added to its approriate list associated with the player
		{
			boardlist2.add(str2);
		}

		while ((boardlist1.size() < 10 && boardlist2.size() < 10))// This while statement makes sure that both players have 9 entries, keep in mind that two entries have been enetered above. Essentially, the body of this statement is nothing new from above but repeats many times as long it is below 10 entries.
		{
			randnum1 = random.nextInt(str2.length());
			randchar1 = str2.charAt(randnum1);
			
			System.out.println(Name1 +" enter word starting with the letter: " + Character.toLowerCase(randchar1));
			str1 = key1.nextLine();
			
			if (str1.toLowerCase().charAt(0) != Character.toLowerCase(randchar1))
			{
				while (str1.toLowerCase().charAt(0) != Character.toLowerCase(randchar1))
				{
					System.out.println("Word entered does not begin with the letter specified, word should start with: " + Character.toLowerCase(randchar1));
					str1 = key1.nextLine();
				}
			}
			boardlist1.add(str1);
	
			randnum2 = random.nextInt(str1.length());
			randchar2 = str1.charAt(randnum2);
			System.out.println(Name2+" enter word starting with the letter: " + Character.toLowerCase(randchar2));
			str2 = key2.nextLine();
			if (str2.toLowerCase().charAt(0) != Character.toLowerCase(randchar2))
				{
					while (str2.toLowerCase().charAt(0) != Character.toLowerCase(randchar2))
					{
						System.out.println("Word entered does not begin with the letter specified, word should start with: " + Character.toLowerCase(randchar2));
						str2 = key2.nextLine();
					}
				}
			boardlist2.add(str2);
		}
	}
}