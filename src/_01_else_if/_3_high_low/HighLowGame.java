
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = 1 +  new Random().nextInt(100);
		
		// 2. Print out the random variable above
		
	//	System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for(int loop=0;loop<10;loop+=1) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String idk = JOptionPane.showInputDialog("Take a guess a the numbers");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int idk2 = Integer.parseInt(idk);
			// 5. if the guess is correct
			if(idk2==random) {
				JOptionPane.showMessageDialog(null, "You win!");
				System.exit(0);
				}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if(idk2>random) {
				JOptionPane.showMessageDialog(null, "Too high!");
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
			if(idk2<random) {
				JOptionPane.showMessageDialog(null, "Too low!");
			}
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose!");
		
	}

}


