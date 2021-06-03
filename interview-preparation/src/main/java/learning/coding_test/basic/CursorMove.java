package learning.coding_test.basic;

import java.awt.Robot;
import java.util.Random;

public class CursorMove {
	
	private static final int FIVE_SECONDS = 8000;
	private static final int MAX_X = 400;
	private static final int MAX_Y = 400;
	
	
	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		Random random = new Random();
		
		while(true) {
			robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
			Thread.sleep(FIVE_SECONDS);
		}
	}

}