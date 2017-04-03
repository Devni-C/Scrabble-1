import java.util.*;
import java.io.*;
public class Scoring
{
	private int points; // This is where we initialize the points and and set that equal to the points earned by the player based on the words enetered
	public void score (ArrayList<String> scorelist1) // // This is where the words are broken down into letters and are assigned a value depending on the letter. The values at the end are added together to give us the points. Also, the parameter is set to retrieve a list from gameboard.
	{	
		ArrayList<String> wordbreakdown = new ArrayList<String>();
		points = 0;
		for (String x:scorelist1) // // This for statement is a for each loop and for each word it executes the body as long as it doesn't over pass the legnth of the words of scorelist1 retrieved from gameboard 
		{
			for(int i = 0; i < x.length(); i++) // This is where the words from the list are broken down into letters and added to wordbreakdown list
			{
				wordbreakdown.add(x.substring(i,i+1));
			}
		}
		System.out.println(wordbreakdown); // This prints out the individual letters to the screen
		for (String y:wordbreakdown) // This for statement is a for each loop and for each letters it executes the body as long it doesn't over pass the length of the letters of wordbreakdown. There are if and if else statements in the body so when a letter matches the if statement and makes it true, it adds the points to the points variable.
		{
			if (y.equals("a") || y.equals("e") ||y.equals("i") ||y.equals("o") ||y.equals("u") ||y.equals("l") ||y.equals("n") ||y.equals("s") ||y.equals("t") ||y.equals("r"))
			{
				points = points + 1;
			}
			else if (y.equals("d") ||y.equals("g"))
			{
				points = points + 2;
			}
			else if (y.equals("b") ||y.equals("c") ||y.equals("m") ||y.equals("p"))
			{
				points = points + 3;
			}
			else if (y.equals("f") ||y.equals("h") ||y.equals("v") ||y.equals("m") ||y.equals("y"))
			{
				points = points + 4;
			}
			else if (y.equals("k"))
			{
				points = points + 5;
			}
			else if (y.equals("j") ||y.equals("x"))
			{
				points = points + 8;
			}
			else if (y.equals("q") ||y.equals("z"))
			{
				points = points + 10;
			}	
		}
		System.out.println(points);
	}
}