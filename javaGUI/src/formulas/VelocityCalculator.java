package formulas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VelocityCalculator {

	private JFrame frmVelocityCalculator;
	private JTextField distance;
	private JTextField time;
	private JLabel answerJLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VelocityCalculator window = new VelocityCalculator();
					window.frmVelocityCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VelocityCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVelocityCalculator = new JFrame();
		frmVelocityCalculator.getContentPane().setBackground(new Color(166, 255, 255));
		frmVelocityCalculator.setTitle("Velocity Calculator");
		frmVelocityCalculator.setBounds(100, 100, 400, 350);
		frmVelocityCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVelocityCalculator.getContentPane().setLayout(null);
		///// window//////////////////////////////
		frmVelocityCalculator.setResizable(false);
		///////////////////////////////////////////////////

		JLabel lbldistance = new JLabel("Please input your distance below: ");
		lbldistance.setBounds(10, 11, 248, 14);
		frmVelocityCalculator.getContentPane().add(lbldistance);

		distance = new JTextField();
		distance.setBounds(10, 36, 298, 20);
		frmVelocityCalculator.getContentPane().add(distance);
		distance.setColumns(10);

		JLabel lbltime = new JLabel("Please input your time below:");
		lbltime.setBounds(10, 67, 248, 14);
		frmVelocityCalculator.getContentPane().add(lbltime);

		time = new JTextField();
		time.setBounds(10, 92, 298, 20);
		frmVelocityCalculator.getContentPane().add(time);
		time.setColumns(10);
		///////////////////////
		JLabel answer = new JLabel("");
		answer.setFont(new Font("Tahoma", Font.BOLD, 17));
		answer.setForeground(new Color(0, 0, 255));
		answer.setBounds(10, 196, 364, 54);
		frmVelocityCalculator.getContentPane().add(answer);

		JButton btnenter = new JButton("Enter");
		btnenter.setBounds(10, 141, 128, 23);
		frmVelocityCalculator.getContentPane().add(btnenter);

		btnenter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub

				try {
					//// get answer in String values from the user
					String diString = distance.getText();
					String timeString = time.getText();
					//// convert answers to double
					double dist = Double.parseDouble(diString);
					double time = Double.parseDouble(timeString);
					DecimalFormat df = new DecimalFormat("#.00000");
					double number = Double.valueOf(df.format(dist / time));

					/// get the results back to String
					String s = String.valueOf(number);
					/// Display answer to the user
					answer.setText("The answer is: " + s + " m/s ");
					/// Display for the programmer
					System.out.println("values entered were " + diString + " and " + timeString
							+ " the answer displayed to the user was: " + s + " m/s ");

				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
					/// message for the programmer
					// e1.printStackTrace();
					/// message for the user
					System.out.println("wrong input");

					answer.setText("😔 WRONG INPUT 😔 ");
				}
			}
		});

		JButton btnclose = new JButton("Close");
		btnclose.setBounds(195, 141, 113, 23);
		frmVelocityCalculator.getContentPane().add(btnclose);
		btnclose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}
