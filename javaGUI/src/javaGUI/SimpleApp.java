package javaGUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleApp {

	private JFrame frame;
	private JTextField txtMsg;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleApp window = new SimpleApp();
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
	public SimpleApp() {
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
		/// label
		JLabel lblNewLabel = new JLabel("Enter Your name");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 156, 14);
		frame.getContentPane().add(lblNewLabel);
		/// text box
		txtMsg = new JTextField();
		txtMsg.setBounds(188, 8, 211, 20);
		frame.getContentPane().add(txtMsg);
		txtMsg.setColumns(10);
		// button 1
		btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 65, 114, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// Convert string to float

				lblMsg.setText("Welcome aboard " + txtMsg.getText() + "!!!!");
			}
		});
		// button 2
		btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(255, 65, 91, 23);
		frame.getContentPane().add(btnNewButton_1);
		//// adding functionality
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtMsg.setText("");
				lblMsg.setText("");
			}
		});

		// display label
		lblMsg = new JLabel("");
		lblMsg.setBounds(20, 112, 392, 67);
		frame.getContentPane().add(lblMsg);
	}

}
