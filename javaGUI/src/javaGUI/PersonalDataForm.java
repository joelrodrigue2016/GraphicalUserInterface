package javaGUI;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class PersonalDataForm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalDataForm window = new PersonalDataForm();
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
	public PersonalDataForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 598, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblname = new JLabel("Name");
		lblname.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblname);

		textField = new JTextField();
		textField.setBounds(10, 29, 445, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lbllastname = new JLabel("Last Name");
		lbllastname.setBounds(10, 65, 445, 14);
		frame.getContentPane().add(lbllastname);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 90, 445, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(10, 121, 445, 14);
		frame.getContentPane().add(lblNationality);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 146, 445, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblage = new JLabel("Age");
		lblage.setBounds(10, 177, 445, 14);
		frame.getContentPane().add(lblage);

		JList list = new JList();
		list.setBounds(120, 398, 1, 1);
		frame.getContentPane().add(list);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 202, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lbladdress = new JLabel("Address");
		lbladdress.setBounds(10, 233, 445, 14);
		frame.getContentPane().add(lbladdress);

		textField_4 = new JTextField();
		textField_4.setBounds(10, 258, 445, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblschool = new JLabel("School");
		lblschool.setBounds(10, 289, 445, 14);
		frame.getContentPane().add(lblschool);

		textField_5 = new JTextField();
		textField_5.setBounds(10, 314, 445, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JButton btnsubmit = new JButton("Submit");
		btnsubmit.setBounds(77, 380, 91, 23);
		frame.getContentPane().add(btnsubmit);

		JButton btncancel = new JButton("Cancel");
		btncancel.setBounds(265, 376, 91, 23);
		frame.getContentPane().add(btncancel);
	}
}
