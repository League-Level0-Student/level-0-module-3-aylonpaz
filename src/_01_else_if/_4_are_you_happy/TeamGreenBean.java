package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class TeamGreenBean {
	public static void main(String[] args) {

		String happyness= JOptionPane.showInputDialog("Are you happy?");
		if(happyness.toLowerCase().contains("yes")) {
	
			JOptionPane.showMessageDialog(null, "Then keep doing what your doing.");
	
		}
		else if(happyness.toLowerCase().contains("no")) {
			String desires= JOptionPane.showInputDialog("Do you want to be a [Big Shot]");
			if(desires.toLowerCase().contains("yes")) {
					JOptionPane.showMessageDialog(null,"then change something.");
			}
			else if(desires.toLowerCase().contains("no")) {
				JOptionPane.showMessageDialog(null, "Then keep doing what your doing");
			}


	}
			}
		
}
