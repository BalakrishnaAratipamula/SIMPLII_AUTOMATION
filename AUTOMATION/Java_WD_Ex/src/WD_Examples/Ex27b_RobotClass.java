package WD_Examples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

//Robot class enter the values where the cursor is pointing
public class Ex27b_RobotClass { //to execute this program select entire prog 'ctrl+a' and execute 'alt+r, s, Enter'. then Result: 'D' will type in screen
	public static void main(String[] args) throws Exception {
		// Create obj for Robot class //setContents - the transferable object representing the clipboard content
		Robot rbt = new Robot();
		
		// paste : ctrl+V
		rbt.keyPress(KeyEvent.VK_D); //VK_anyKeyWeWant //VK_SEMICOLON --> ;
		// to release keys
		rbt.keyRelease(KeyEvent.VK_D);
		
	}
}
