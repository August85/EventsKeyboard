package ak.example.events;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardEvents {

	public static void main(String args[]) {
		KeyboardEvents events = new KeyboardEvents();
		events.waitThisThread();
		events.sendKeyEvents();

	}

	public void sendKeyEvents() {
		try {
			Robot r = new Robot();
			//r.setAutoDelay(900);

			System.out.println("This is the starting line: ");

			// r.keyPress(KeyEvent.VK_F2);
			// r.keyPress(KeyEvent.VK_H);
			r.keyPress(KeyEvent.VK_WINDOWS);
			// r.keyPress(KeyEvent.VK_I);
			// r.keyPress(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_SPACE);
			 r.keyRelease(KeyEvent.VK_WINDOWS);
			 r.keyRelease(KeyEvent.VK_SPACE);
			// r.keyPress(KeyEvent.VK_I);
			// r.keyPress(KeyEvent.VK_S);
			// r.keyPress(KeyEvent.VK_SPACE);
			// r.keyPress(KeyEvent.VK_F);
			// r.keyPress(KeyEvent.VK_U);
			// r.keyPress(KeyEvent.VK_N);

			System.out.println("This is the ending line: ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void waitThisThread() {
		try {
			Thread.currentThread();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
