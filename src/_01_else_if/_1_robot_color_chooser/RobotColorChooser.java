
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(50);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for(int loop=0;loop<1000000000;loop=+1) {
			String color = JOptionPane.showInputDialog("What is your favorite color?");
		if(color.toLowerCase().contains("red")) {
			rob.setPenColor(255,0,0);
		}else if(color.toLowerCase().contains("blue")) {
			rob.setPenColor(0,0,255);
		}else if(color.toLowerCase().contains("green")) {
			rob.setPenColor(0,255,0);
		}else if(color.toLowerCase().contains("purple")) {
			rob.setPenColor(96, 48, 209);
		}else if(color.toLowerCase().contains("yellow")) {
			rob.setPenColor(139, 209, 48);
		}else if(color.toLowerCase().contains("pink")) {
			rob.setPenColor(250, 5, 185);
		}else {
			JOptionPane.showMessageDialog(null, "I dont know that one! Your favorite color is black now.");
			rob.setPenColor(0,0,0);
		}
		for(int moreLoops=0;moreLoops<4;moreLoops+=1) {
		rob.move(100);
		rob.turn(90);
		}
		rob.turn(10);
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
}
