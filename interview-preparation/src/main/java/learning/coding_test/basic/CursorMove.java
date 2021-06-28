package learning.coding_test.basic;

import java.awt.Robot;
import java.util.Random;

public class CursorMove {
	
	private static final int TEN_SECONDS = 10000;
	private static final int MAX_X = 800;
	private static final int MAX_Y = 1000;
	
	
	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		Random random = new Random();
		
		while(true) {
			robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
			Thread.sleep(TEN_SECONDS);
		}
	}

}