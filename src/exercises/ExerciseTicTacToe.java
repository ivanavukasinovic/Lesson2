package exercises;

import org.jointheleague.graphical.robot.Robot;

public class ExerciseTicTacToe {
	
	private void ticTacToe()
	{
		Robot robot = new Robot("batman");
		
		int x = 290;
		int y = 40;
		int length = 540;
		int margin = 30;
		
		robot.setSpeed(30);
		robot.setPenWidth(5);
		robot.setPenColor(0, 0, 0);
		robot.setPos(x, y);
		robot.turn(180);
		robot.penDown();
		robot.move(length);
		for (int i = 0; i < 3; i++) 
		{
			robot.penUp();
			for (int j = 0; j < 2; j++) 
			{
				robot.turn(90);
				robot.move(length/3);
			}
			robot.turn(90);
			robot.penDown();
			robot.move(length);
		}
		
		robot.penUp();
		robot.setPos((x - length/3 + margin), (y + margin));
		robot.turn(225);
		robot.setPenColor(255, 0, 0);
		robot.penDown();
		int xSize = (int)Math.sqrt((length/3 - margin*2)*(length/3 - margin*2)*2);
		robot.move(xSize);
		robot.penUp();
		robot.turn(135);
		robot.move(length/3 - margin*2);
		robot.turn(135);
		robot.penDown();
		robot.move(xSize);
		
		Robot sophia = new Robot();
		
		sophia.setSpeed(90);
		sophia.setPos((x + length/3/2), (y + length/3 + margin));
		sophia.setPenWidth(5);
		sophia.setPenColor(0, 0, 255);
		sophia.penDown();
		sophia.turn(90);
		for (int i = 0; i < 36; i++) 
		{
			sophia.move(10);
			sophia.turn(10);
		}
		
		robot.penUp();
		robot.setPos((x + margin), (y + margin));
		robot.turn(90);
		robot.penDown();
		robot.move(xSize);
		robot.penUp();
		robot.turn(135);
		robot.move(length/3 - margin*2);
		robot.turn(135);
		robot.penDown();
		robot.move(xSize);
		
		sophia.penUp();
		sophia.setPos((x + length/3 + length/3/2), (y + margin));
		sophia.penDown();
		for (int i = 0; i < 36; i++) 
		{
			sophia.move(10);
			sophia.turn(10);
		}
		
		robot.penUp();
		robot.setPos((x - length/3 + margin), (y + length/3 + margin));
		robot.turn(90);
		robot.penDown();
		robot.move(xSize);
		robot.penUp();
		robot.turn(135);
		robot.move(length/3 - margin*2);
		robot.turn(135);
		robot.penDown();
		robot.move(xSize);
		
		sophia.penUp();
		sophia.setPos((x - length/3/2), (y + length/3*2 + margin));
		sophia.penDown();
		for (int i = 0; i < 36; i++) 
		{
			sophia.move(10);
			sophia.turn(10);
		}
		
		sophia.penUp();
		sophia.setPos((x - length/3 + margin), (y + length/3*2 + (length/3-margin)));
		sophia.turn(315);
		sophia.setPenColor(255, 255, 0);
		sophia.penDown();
		sophia.move((int)Math.sqrt((length - margin*2)*(length - margin*2)*2));
		
		robot.penUp();
		robot.setPos((x + length), (y + length/3*2));
		robot.turn(225);
		
		sophia.penUp();
		sophia.setPos((x + length), (y + length/3));
		sophia.turn(225);
	}

	public static void main(String[] args) {
		
		new ExerciseTicTacToe().ticTacToe();

	}

}
