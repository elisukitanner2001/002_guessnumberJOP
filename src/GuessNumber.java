import java.util.Random;
/*
 * vocab: "encapsulation" means keep all related in a 
 * single class, do not spread things all over the place!
 * old days spaghetti code could not trace anything
 * now we don't do that 
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class GuessNumber {
	// "field" very important is "Scope"
	// public means any other class has access; usually bad
	// private means only used inside of this class; usually good
	// "protected" can be used by any other class in this package
	// default is protected
	private int lowerLimit = 0;
	private int upperLimit = 10;	

	Random rand = new Random();

	Scanner keyboard = new Scanner(System.in);
	/*
	 * !. set lower upper bounds on numbers 2. pick a random number in that range 3.
	 * start looping --guess --check for win --if win congrats --if no win repeat
	 * --guess limit 5 per game
	 * 
	 */

	public GuessNumber() {

	}// end of constructor

	public void StartGame() {

		Boolean gameRunning = true;
		int guess;
		int answer = rand.nextInt(upperLimit) + lowerLimit;
		int countLimit = 5;
		String startMsg = "";
		String enterGuess= "";
		String CountLimit = "";
		String win = "congrats! You Won!";
		String toHigh = "sorry your guess is to high";
		String toLow = "Sorry your guess is to low";
		String WTC="what did you do?!?!?!!? YOU HAVE DISTRUBTED THE SPACE TIME CONTINUIM!!!!!!!!";
		//System.out.println("for testing purposes anser is: " + answer);
		startMsg ="for testing purposes anser is: " + answer;
		JOptionPane.showMessageDialog(null,  startMsg);
		// test

		while (gameRunning && countLimit > 0) {
			enterGuess ="please enter your guess, between " + lowerLimit + " and " + (upperLimit - 1);
			//System.out.println("please enter your guess, between " + lowerLimit + " and " + (upperLimit - 1));

			guess = Integer.parseInt(JOptionPane.showInputDialog(enterGuess));//keyboard.nextInt(upperLimit) + lowerLimit;
			
			//test
			CountLimit ="countLimit:" + countLimit;
			JOptionPane.showMessageDialog(null, CountLimit);
			//System.out.println("countLimit:" + countLimit);
			if (guess == answer) {
				JOptionPane.showMessageDialog(null, win);
				//System.out.println("congrats! You Won!");
				gameRunning = false;
			} else if (guess < answer) {
				JOptionPane.showMessageDialog(null, toLow);
				//System.out.println("Sorry your guess is to low");

			} else if (guess > answer) {
				JOptionPane.showMessageDialog(null, toHigh);
				//System.out.println("sorry your guess is to high");
			} else {
				JOptionPane.showMessageDialog(null, WTC);
				//System.out.println("what did you do?!?!?!!? YOU HAVE DISTRUBTED THE SPACE TIME CONTINUIM!!!!!!!!");
			}
			countLimit--;
		} // end of while
		//add conditionals for custom comments
		/*
		if(countLimit >=3 ) {
			System.out.println("Well done! You are briliant");			
			
		}else if(countLimit==2 || countLimit==1) {
			
			System.out.println("Well done, you could do better next time though");
			
		} else if(countLimit == 0) {
			
			System.out.println("Way to close!");
			
		}else if(countLimit < 0 ){
			System.out.println("you lose!");
		}else {
			
		} */

		// for (int i = 0; i<100; i++) {
		// System.out.println(i + ", rand =" + (rand.nextInt(upperLimit) + lowerLimit));
		// }

		// System.out.println("Random Number = " + n);
		/*
		 * for (int i = 0; i <= 4; i++) { System.out.println("logic check, i = " + i); }
		 * // end of for
		 * 
		 */

	}// end of start game

}// end of class



