package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {
	
	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot jerry = new Robot();

		// #2. Set your robot’s position to x=300 and y=300
		jerry.setX(300);
		jerry.setY(300);

		// #3. Put the robot's pen down
		jerry.penDown();

		// #4. Set the robot’s speed to 5
		jerry.setSpeed(5);

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)
		for (int i = 0; i < 6; i++) {
			
		
			
			// #6. Set the pen color to black
			jerry.setPenColor(Color.black);
			
			// #7. move the robot by 50
			jerry.move(50);
			
			// #8. turn the robot to the right by 60
			jerry.turn(60);
			
			// #12. set the pen color to blue for even numbers of i
			if(i % 2 == 0) {
				jerry.setPenColor(Color.BLUE);
			}
		
			// #13. set the pen color to red for all odd numbers of i
			if(i % 2 == 1) {
				jerry.setPenColor(Color.red);
			}
			
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
			for (int j = 0; j < 6; j++) {
				
			
			
					// #10. turn the robot to the left by 60
				jerry.turn(-60);
					
					// #11. move the robot by 50 (play the start button)
				jerry.move(50);
			
			}
				
			
			// #14. set the pen color to black
			jerry.setPenColor(Color.BLACK);
		}
		
	}

}
