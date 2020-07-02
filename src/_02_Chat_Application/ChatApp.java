package _02_Chat_Application;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp {
	JFrame frame;
	JPanel panel;
	String message;
	JLabel text;
	//JLabel serverMessage;
	
	ChatApp() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		text = new JLabel();
		frame.add(panel);
	}
	
	void run(String message) {
		text.setText(message);
		panel.add(text);
		frame.pack();
	}

}
