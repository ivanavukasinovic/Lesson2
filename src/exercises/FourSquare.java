package exercises;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	public static void main(String[] args) {

		Robot robot = new Robot();
		
		robot.setSpeed(15);
		robot.setPenWidth(20);
		robot.penDown();
		
		robot.setRandomPenColor();
		for (int i = 0; i < 4; i++) 
		{
			robot.turn(90);
			robot.move(100);
		}
		
		for (int i = 0; i < 3; i++) 
		{
			robot.turn(90);
			robot.setRandomPenColor();
			for (int j = 0; j < 4; j++) 
			{
				robot.turn(90);
				robot.move(100);
			}	
		}	
		
		robot.turn(90);

	}

}
