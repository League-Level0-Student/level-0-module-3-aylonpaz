
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();

		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(100);
		rob.setY(100);
		rob.setSpeed(100);
		rob.penDown();
		// 2. Make the robot draw a star shape. Hint: angle=144.
		
			for (int mtnDewBotBaja = 0; mtnDewBotBaja < 8; mtnDewBotBaja += 1) {
				for (int mtnDewBot = 0; mtnDewBot < 5; mtnDewBot += 1) {
					rob.move(30);
					rob.turn(144);
				}
				if(mtnDewBotBaja<7) {
					rob.penUp();
				
				rob.turn(90);
				rob.move(100);
				rob.turn(-90);
				}
				rob.penUp();
				if(mtnDewBotBaja<7) {
					rob.penDown();
				}
				
			}
			rob.penUp();
			rob.setAngle(180);
			rob.move(100);
			rob.penDown();
			rob.setAngle(180);
			
			
			
			
		
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
