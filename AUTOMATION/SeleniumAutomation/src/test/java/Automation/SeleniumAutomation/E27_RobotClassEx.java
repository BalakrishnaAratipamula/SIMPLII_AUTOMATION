package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class E27_RobotClassEx {
	public static void main(String[] args) throws AWTException {
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_D); //Pressing the key //VK - Virtual keyboard
		rbt.keyRelease(KeyEvent.VK_D); //Releasing the key
		
	}
}
