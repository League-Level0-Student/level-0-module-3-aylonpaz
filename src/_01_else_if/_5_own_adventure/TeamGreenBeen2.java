package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class TeamGreenBeen2 {
public static void main(String[] args){
	JOptionPane.showMessageDialog(null, "You wake up and find yourself in a magical forest");
	String choice1 = JOptionPane.showInputDialog("You see a castle on your right, and a mage's hut on your left, do you go left or right?");
	if(choice1.toLowerCase().contains("left")) {
		JOptionPane.showMessageDialog(null, "He  says 'Bipidi Bapidi Boo, I teleport you!' and "
				+ "telleports you, but he does not no what universe you live. "
				+ "You then get kidnaped by aleins and and are never seen again.");
		else if(choice1)
	}
}
}
