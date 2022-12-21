package javaGUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorldAPP {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					HelloWorldAPP window = new HelloWorldAPP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorldAPP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnHelloWorld = new JButton("Click me!");
		btnHelloWorld.setForeground(new Color(255, 0, 0));
		btnHelloWorld.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnHelloWorld.setBounds(157, 117, 91, 23);
		frame.getContentPane().add(btnHelloWorld);
	}

}
