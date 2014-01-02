package robots;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class simple_robots {

	public static void main(String[] args) {
		try {
            Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_H);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyPress(KeyEvent.VK_O);
           
            robot.keyPress(KeyEvent.VK_SPACE);

            robot.keyPress(KeyEvent.VK_W);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_1);
        } 
     catch (AWTException ex) {
            ex.printStackTrace();
        }

	}

}
