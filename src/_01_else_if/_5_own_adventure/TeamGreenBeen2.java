package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class TeamGreenBeen2 {
public static void main(String[] args){
	JOptionPane.showMessageDialog(null, "You wake up and find yourself in a magical forest");
	String choice1 = JOptionPane.showInputDialog("You see a castle on your right, and a mage's hut on your left, do you go left or right?");
	if(choice1.toLowerCase().contains("left")) {
		JOptionPane.showMessageDialog(null, "He  says 'Bipidi Bapidi Boo, I teleport you!' and \n teleports you, but he does not no what universe you live. \n You then get kidnapped by aliens and and are never seen again.");
	}
		else if(choice1.toLowerCase().contains("right")){
			String knights = JOptionPane.showInputDialog("The knight charge, do you fight or try to resolve the conflict?");
			if(knights.toLowerCase().contains("fight")) {
				JOptionPane.showMessageDialog(null, "You attempt fight the knights. You then remember your insanely weak and get beat up and thrown in the castle prison to rot away for "
						+ "the rest of your life.");
			}
			else if(knights.toLowerCase().contains("resolve")) {
				JOptionPane.showMessageDialog(null, "You talk to the king and tell him your home universe, and he sends you home.");
			}
		}
	
	}
}

