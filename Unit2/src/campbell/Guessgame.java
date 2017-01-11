package campbell;

/*Guessgame.java
 *Made by Javaughn Campbell
 *Created on Tuesday, January 10, 2016
 *Program displays the rolling of a dice 10000 times
 */

import java.util.Scanner;

public class Guessgame {

	
	public static void main(String[] args) {

		// TODO Auto-generated method stub



		Scanner scan = new Scanner(System.in);



		String[] guess = new String[] { "Toronto Raptors", "Miami Heat", "Charlotte Hornets", "New Orleans Pelicans",

				"San Antonio Spurs", "Cleveland Cavaliers", "Oklahoma City Thunder", "Los Angeles Lakers",

				"Boston Celtics", "Atlanta Hawks", "Indiana Pacers", "Dallas Mavericks", "Houston Rockets",

				"Portland Trailblazers", "Chicago Bulls", "Detroit Pistons", "Denver Nuggets", "Sacramento Kings",

				"Phoenix Suns", "Milwaukee Bucks" };

		boolean[] computerGuess = new boolean[20];

		String answer = null;

		int n;

		System.out.println("Hey, lets play a game. Think of an NBA team and I have to guess it");

		System.out.print("Do you wanna Play? ");

		answer = scan.nextLine();


				if (answer.equalsIgnoreCase("yes")) {

					System.out.println("Ok Lets go, Now think of the team in your head");

					for (int x = 19; x > -1; x--) {
						n = (int) (Math.random() * guess.length);
						
						while (computerGuess[n]) {
						n = (int) (Math.random() * guess.length);

				}

				if (!computerGuess[n]) {
					
					System.out.println("\nAre you thinking of the " + guess[n] + "?");
					System.out.print("Yes or No? ");
					answer = scan.nextLine();


				if (answer.equalsIgnoreCase("yes")) {

						System.out.println("\nI won since i guessed your team lol");
						x = 0;
				}
				
				else
						 
					computerGuess[n]= true;
				}

					}

				if (answer.equalsIgnoreCase("yes")) {
				System.out.println(" ");

				}

				else {

				System.out.println("\nWOW I give up, you win");

						}

		}



	}



}

