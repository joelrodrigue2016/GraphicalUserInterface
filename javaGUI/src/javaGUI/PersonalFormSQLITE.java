
package javaGUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PersonalFormSQLITE {

	private JFrame frmPersonalDataCollection;
	private JTextField name;
	private JTextField lastname;
	private JTextField nationality;
	private JTextField age;
	private JTextField address;
	private JTextField school;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PersonalFormSQLITE window = new PersonalFormSQLITE();
					window.frmPersonalDataCollection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PersonalFormSQLITE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// frame
		frmPersonalDataCollection = new JFrame();
		frmPersonalDataCollection.getContentPane().setBackground(new Color(166, 255, 255));
		frmPersonalDataCollection.setTitle("Personal Data Collection Form");
		frmPersonalDataCollection.setBounds(100, 100, 598, 513);

		///// This allows the user to resize the window. In our case we are setting it
		///// to false so the user will not be allowed to resize the
		///// window//////////////////////////////
		frmPersonalDataCollection.setResizable(false);
		///////////////////////////////////////////////////
		frmPersonalDataCollection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPersonalDataCollection.getContentPane().setLayout(null);
		// name

		JLabel lblname = new JLabel("Name");
		lblname.setBounds(10, 11, 46, 14);
		frmPersonalDataCollection.getContentPane().add(lblname);

		name = new JTextField();
		name.setBounds(10, 29, 445, 20);
		frmPersonalDataCollection.getContentPane().add(name);
		name.setColumns(10);
		// last name
		JLabel lbllastname = new JLabel("Last Name");
		lbllastname.setBounds(10, 65, 445, 14);
		frmPersonalDataCollection.getContentPane().add(lbllastname);

		lastname = new JTextField();
		lastname.setBounds(10, 90, 445, 20);
		frmPersonalDataCollection.getContentPane().add(lastname);
		lastname.setColumns(10);
		// nationality
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(10, 121, 445, 14);
		frmPersonalDataCollection.getContentPane().add(lblNationality);

		nationality = new JTextField();
		nationality.setBounds(10, 146, 445, 20);
		frmPersonalDataCollection.getContentPane().add(nationality);
		nationality.setColumns(10);
		/// age
		JLabel lblage = new JLabel("Age");
		lblage.setBounds(10, 177, 445, 14);
		frmPersonalDataCollection.getContentPane().add(lblage);

		age = new JTextField();
		age.setBounds(10, 202, 86, 20);
		frmPersonalDataCollection.getContentPane().add(age);
		age.setColumns(10);
		// address
		JLabel lbladdress = new JLabel("Address");
		lbladdress.setBounds(10, 233, 445, 14);
		frmPersonalDataCollection.getContentPane().add(lbladdress);

		address = new JTextField();
		address.setBounds(10, 258, 445, 20);
		frmPersonalDataCollection.getContentPane().add(address);
		address.setColumns(10);
		// school
		JLabel lblschool = new JLabel("School");
		lblschool.setBounds(10, 289, 445, 14);
		frmPersonalDataCollection.getContentPane().add(lblschool);

		school = new JTextField();
		school.setBounds(10, 314, 445, 20);
		frmPersonalDataCollection.getContentPane().add(school);
		school.setColumns(10);
		// cancel button
		JButton btncancel = new JButton("Cancel");
		btncancel.setBounds(265, 376, 91, 23);
		frmPersonalDataCollection.getContentPane().add(btncancel);
		btncancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		/////////////////////////////////////
		// submit button
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.setBounds(77, 380, 91, 23);
		frmPersonalDataCollection.getContentPane().add(btnsubmit);
		//// When the user presses the submit button the data entered through the gui
		//// will be input inside the sql database(externally)
		btnsubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String firstName = name.getText();
				String lastName = lastname.getText();
				String Nationality = nationality.getText();
				String Age = age.getText();
				String Address = address.getText();
				String School = school.getText();
				Integer len = Age.length();

				try {
					if (len != 2) {
						JOptionPane.showMessageDialog(btnsubmit, "Enter a valid age");
					}
					Connection conn = null;
					String dbname = "personal";
					conn = DriverManager.getConnection("jdbc:sqlite:" + dbname + ".sqlite");
					conn.setAutoCommit(false);
					Statement stmt = conn.createStatement();
					System.out.println("Connected successfully!!");
					String query = "INSERT INTO personalInfo values('" + firstName + "','" + lastName + "','"
							+ Nationality + "','" + Age + "','" + Address + "','" + School + "')";
					Statement statement = conn.createStatement();

					stmt.executeUpdate(query);
					stmt.close();
					conn.commit();

					JOptionPane.showMessageDialog(btnsubmit, "Data was entered successfully!!");
					int x = statement.executeUpdate(query);
					if (x == 0) {
						JOptionPane.showMessageDialog(btnsubmit, "This alredy exist");
					}

					conn.close();
				} catch (Exception ex) {
					// TODO: handle exception
					ex.printStackTrace();
					JOptionPane.showMessageDialog(btnsubmit, "oops something went wrong!!!");
				}

			}
		});

	}

}