package campbell;

/* 
 * Thegameofbasketball.java
 * Made by Javaughn Campbell
 * Created on January 18, 2016
 * This program gives the user 16 different players and information about them and the user has to try and name the player. At the end, the program shows the users score and the correct answers to all the questions
 */



import java.awt.Font;

import java.awt.Image;

import java.awt.Toolkit;



import hsa_new.Console;



public class Thegameofbasketball  {



	public static void main(String[] args) {



		String answer;
		int score = 0;
		Console basketball = new Console(45, 155);

		String userAnswer;

		String[] players = new String[] { "Lebron James", "Kevin Durant", "Stephen Curry", "Chris Paul", "Michael Jordan",
				"Russell Westbrook", "Kawhi Leonard", "James Harden", "Allen Iverson", "Ray Allen", "Blake Griffin", "Carmelo Anthony", "Shaquille O’Neal", "Kyle Lowry", "Kobe Bryant", "Demar Derozan" };

		String[] history = new String[] {
	
	                "This player is considered one of the greatest basketball players ever. He is a three time NBA Champion, three time NBA Finals MVP, four-time NBA League MVP, two-time Olympic gold medal champion, and the 2004 Rookie of the Year.\n Who is he? (first and last name please)", 
			
					"This player currently plays for the Golden State Warriors. He is a four-time NBA scoring champion, Rookie of the year in 2008, and the NBA’s league MVP.\n Who is he? (first and last name please)",
	                "This player is considered one of the best shooters to ever play the game of basketball. Both him and his brother currently play in the NBA and his father use to play for the Toronto Raptors and the Charlette Hornets.\n Who is he? (first and last name please)",
					"This player currently plays for the Los Angeles Clippers. He was the 2006 NBA Rookie of the Year, He has led the league in assists four-times, and led the league in steals six times.\n Who is he? (first and last name please)",
					"This player is most respected player to ever play the game of basketball and some may say his playing style is similar to Kobe Bryant’s. He is the G.O.A.T.\n Who is he? (first and last name please)",
					"This is one of the most explosive players currently in the league. In 2015 he had 21 triple doubles and is ranked number 7 with the most triple double by an NBA player in a single season and was the NBA scoring champion in 2015.\n Who is he? (first and last name please)",
					"This player currently plays for the San Antonio Spurs. He led his team to winning an NBA championship in 2014 where he was named the NBA finals MVP, and he is also a two-time NBA Defensive Player of the Year 2 years in a row.\n Who is he? (first and last name please)",
					"This player is currently playing for the Houston Rockets. He is the youngest player to reach 1,000 career three pointers made, The only player to record at least 50 points, 15 assists, and 15 rebounds in a single game, and he is a two-time NBA minutes leader.\n Who is he? (first and last name please)",	
					"This player was one of the most controversial basketballs in the league. He is a four-time NBA scoring champion, three-time NBA steals leader, eleven-time NBA All-Star, NBA’s MVP in 2001, NBA’s Rookie of the year in 1997, and he is also a Hall of Famer.\n Who is he? (first and last name please)",
					"This player was known as a three-point specialist when he was in the NBA. He is a two-time NBA Champion, three-time Gold medalist as a member of team USA’s mens basketball team, ten-time NBA All-Star, and USA Basketball Male Athlete of the Year in 1995.\n Who is he? (first and last name please)",
	
					"This player currently plays for the Los Angeles Clippers. He was NBA’s Rookie of the Year in 2011, an NBA All-Star five years in a row since 2011, and best known for his Slam Dunk Championship in 2011 also.\n Who is he? (first and last name please)",
	
					"This player is one of the greatest to play the game of basketball. He is a nine-time NBA All-Star, the NBA minutes leader in 2014, NBA scoring champion in 2013, and a New York Native.\n Who is he? (first and last name please)",
	
					"This player is a 7ft 1 giant. He is a four-time NBA Champion, three-time NBA Finals MVP, fifteen-time NBA All-Star, two-time NBA scoring champion, NBA’s Rookie of the Year in 1993, and |He also has 2 jersey numbers retired for both teams he won championships with.\n Who is he? (first and last name please)",
	
					"This player plays for the Toronto Raptors. He is two-time NBA All-Star. In his first year as an All-Star he was a starter. He was also All-NBA Third Team.\n Who is he? (first and last name please)",
	
					"This player is one of the greatest to ever play the game of basketball. He is a eighteen-time NBA All-Star, four-time NBA All-Star Game MVP, two-time NBA scoring champion, five-time NBA Champion, and he was also the 1997 NBA Slam Dunk Contest Champion.\n Who is he? (first and last name please)",
	 
					"This player is currently playing for the Toronto Raptors. He is a three-time NBA All-Star, and his role model is Kobe Bryant. He is also Starting in the NBA All-star Game this year.\n Who is he? (first and last name please)",
				};


		Image[] pictures = new Image[] { Toolkit.getDefaultToolkit().getImage("LebronJames.jpg"),

				Toolkit.getDefaultToolkit().getImage("KevinDurant.jpg"),

				Toolkit.getDefaultToolkit().getImage("StephenCurry.jpg"),

				Toolkit.getDefaultToolkit().getImage("ChrisPaul.jpg"),

				Toolkit.getDefaultToolkit().getImage("MichaelJordan.jpg"),

				Toolkit.getDefaultToolkit().getImage("RussellWestbrook.jpg"),

				Toolkit.getDefaultToolkit().getImage("KawhiLeonard.jpg"),

				Toolkit.getDefaultToolkit().getImage("JamesHarden.jpg"),

				Toolkit.getDefaultToolkit().getImage("AllenIverson.jpg"),

				Toolkit.getDefaultToolkit().getImage("RayAllen.jpg"),

				Toolkit.getDefaultToolkit().getImage("BlakeGriffin.jpg"),

				Toolkit.getDefaultToolkit().getImage("CarmeloAnthony.jpg"),

				Toolkit.getDefaultToolkit().getImage("ShaquilleO’Neal.jpg"),

				Toolkit.getDefaultToolkit().getImage("KyleLowry.jpg"),

				Toolkit.getDefaultToolkit().getImage("KobeBryant.jpg"),

				Toolkit.getDefaultToolkit().getImage("DemarDerozan.jpg")};


		basketball.println("Hello, you have entered the world of basketball trivia\n");

		basketball.println("Unlike other games, I will not ask you any hard questions. I will show you background knowledge"
				+ " about a player and you will have to guess who the player is.\n");

		basketball.println("Some players are known, and some not so much.\n");
		
		basketball.println("This game requires no cheating so don’t think about googling the answers.\n");

		basketball.print("Are you ready for the challenge? yes or no");

		answer = basketball.readLine();

		basketball.clear();
		

		if (answer.equalsIgnoreCase("yes")) {

			for (int i = 0; i <= 15; i++) {

				basketball.setFont(new Font("SansSerif", Font.BOLD, 50));

				basketball.drawString("Basketball Trivia", 400, 35);

				basketball.setFont(new Font("SansSerif", Font.PLAIN, 15));

				basketball.setCursor(5, 1);

				basketball.println(history[i]);
				
				basketball.drawImage(pictures[i], 100, 250, 1000, 500, null);
				
				userAnswer = basketball.readLine();
				
				basketball.setCursor(8, 3);

				score = scores( players, basketball, userAnswer, score, i);

				basketball.clear();

			}

			basketball.println("your score was " + score);

			basketball.println("all the correct answers are:");

			for(int i=0; i<=15; i++){

				correctAnswers(players, basketball, i); 

			}



		} else {

			basketball.println("I guess we wont play then");

		}

		

		



	}

	public static int scores(String[] players, Console basketball, String userAnswer, int score, int i){

		if (userAnswer.equalsIgnoreCase(players[i])) {

			score = score + 1;

		}

		return score;

		}

	public static void correctAnswers(String[] players, Console basketball, int i){

		basketball.println(players[i]);

	}

}	
