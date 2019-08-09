import java.util.*;
public class OandE {

	public static void main(String[] args) {
		/**
		 * A simple game to play , choosing even or odd and the computer 
		 * will be against you with the other choice than yours .
		 * You choosing a number between 1-5 and the same thing to the computer.
		 * The sum of your choice added to the computer's too and will be divided.
		 * if the reminder is 0 (even) and you chose it , you will be the winner.
		 * Otherwise , hard luck , the computer won :) .
		 */
		Scanner input = new Scanner(System.in);
		//the beginning of the game 
		System.out.println("Let's play a game called \"Odds and Evens!\"");
		//Delay for 5 seconds
		sleepy(5);
		System.out.print("What's your name?  ");
		String name = input.next();
		System.out.print("Hi "+name+"! , which do you choose? (O)dds or (E)vens?  ");
		String choosing = input.next();
		choosing = checking(choosing);
		String comChoice = turnsChoice(choosing, name);
		//Line 
		line();
		//delay for 4 seconds
		sleepy(4);
		//choosing a number 
		System.out.print("How many fingers do you put out? [(1 to 5)only]   ");
		int playerF = input.nextInt();
		int computerF = randomN();
		System.out.println("The computer plays "+ computerF+" fingers.");
		int sum = playerF + computerF;
		//delay for 5 seconds
		sleepy(5);
		System.out.println(playerF+ " + " +computerF+" = "+ sum);
		//checking the sum if it's even or odd .
		boolean sumQ = (sum%2==0);
		String oddOrEven = check(sumQ);
		System.out.println(sum +" ....."+oddOrEven);
		line();
		sleepy(4);
		//The result .
		result(oddOrEven, choosing, comChoice,name);
		
		
	}
	public static void result (String oddOrEven , String choosing , String comChoice,String name) {
		/**
		 * The final checking for the winner
		 * @param String oddOrEven , String choosing , String comChoice and String name to
		 * to determine the winner .
		 * @return void.
		 */
		if(oddOrEven.equals(choosing)) {
			System.out.println(name +" wins! :)");
		}else if(oddOrEven.equals(comChoice)) {
			System.out.println( "The computer wins! :D");
		}else {
			System.out.println("Error occured .");
		}
		
	}
	public static void sleepy (int num) {
		/**
		 * Makes a delay in the program to give a look of a real game.
		 * Using try/catch function to prevent interrupting .
		 * @param int value for specific time amount .
		 * @return void .
		 */
		try
		{
		    Thread.sleep(num *1000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
	public static String checking (String choosing) {
		/**
		 * Checking the choice of the player to determine later 
		 * the choice of the computer depending on this choice.
		 * @param String choosing - what the user will enter as
		 * an input .
		 * @return String choosing - same parameter to organize it 
		 * better.
		 */
		if(choosing.equalsIgnoreCase("o")) {
			choosing ="odd";
		}else if(choosing.equalsIgnoreCase("e")) {
			choosing ="even";
		}else {
			System.out.println("Error ocurred ...");
			System.exit(0);
		}
		return choosing;
	}
	public static String turnsChoice(String choosing, String name) {
		/**
		 * Taking the parameter choosing from the previous method and
		 * determining the turn of the computer.
		 * @param <b> choosing </b> and <b> name </b> strings and the 
		 * way is clear below .
		 * @return String comChoice - the computer choice.
		 */
		String comChoice ="";
		if(choosing.equals("even")) {
			
			System.out.print (name +" has chose "+choosing+"s.");
			comChoice = "odd";
			System.out.println(", so the computer is "+ comChoice+"s.");
			
		}else {
			System.out.print (name +" has chose "+choosing+"s.");
			comChoice = "even";
			System.out.println(", so the computer is "+ comChoice+"s.");
			
		}
		return comChoice;
	}
	public static int randomN() {
		/**
		 * Creating a random number between 1 to 5 to let the computer play.
		 * @param void .
		 * @return int num - value of the random generated numbers .
		 */
		Random rand = new Random();
		int num = rand.nextInt(6)+1;
		return num;
	}
	public static void line() {
		/**
		 * Creating a line between the games' parts.
		 * @param void.
		 * @return void.
		 */
		System.out.println("-----------------------------------------");
	}
	public static String check (boolean sumQ) {
		/**
		 * Checking if the boolean expression is true(even) or false(odd).
		 * The boolean expression is checking for the sum mod. 2 .
		 * @param boolean sumQ - the value of the boolean expression of sum%2.
		 * @return String oddOrEven - returns weather it's even or odd.
		 */
		String oddOrEven ="";
		if(sumQ) {
			oddOrEven = "even";
		} else {
			oddOrEven = "odd";
		}
		return oddOrEven ;
		
	}
	

}
