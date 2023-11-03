package package1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import package2.JDBC_Student;
import package2.*;

public class UpdateStaffData {

	private JFrame frameUpdateData;
	private JTextField txtSerialNumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobileNumber;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStaffData window = new UpdateStaffData();
					window.frameUpdateData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStaffData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameUpdateData = new JFrame();
		frameUpdateData.getContentPane().setBackground(new Color(193, 187, 62));
		frameUpdateData.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter Serial No to Update : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(21, 12, 364, 39);
		frameUpdateData.getContentPane().add(lblNewLabel);

		txtSerialNumber = new JTextField();
		txtSerialNumber.setBounds(372, 12, 257, 39);
		frameUpdateData.getContentPane().add(txtSerialNumber);
		txtSerialNumber.setColumns(10);

		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number=Integer.parseInt(txtSerialNumber.getText());

				JDBC_Staff jd= new JDBC_Staff();
				ResultSet result=null;
				result=jd.getRow(number);

				try {
					while(result.next()) {
						txtFirstName.setText(result.getString(2));
						txtLastName.setText(result.getString(3));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}


			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(708, 13, 107, 38);
		frameUpdateData.getContentPane().add(btnNewButton);

		JSeparator separator = new JSeparator();
		separator.setBounds(15, 61, 1005, 10);
		frameUpdateData.getContentPane().add(separator);

		JLabel lblNewLabel_1 = new JLabel("First Name ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(37, 115, 118, 30);
		frameUpdateData.getContentPane().add(lblNewLabel_1);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(190, 115, 251, 27);
		frameUpdateData.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Last Name  ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(37, 175, 118, 30);
		frameUpdateData.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Mobile Number");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(37, 238, 136, 30);
		frameUpdateData.getContentPane().add(lblNewLabel_1_2);

		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(190, 178, 251, 27);
		frameUpdateData.getContentPane().add(txtLastName);

		txtMobileNumber = new JTextField();
		txtMobileNumber.setColumns(10);
		txtMobileNumber.setBounds(190, 238, 251, 27);
		frameUpdateData.getContentPane().add(txtMobileNumber);

		JLabel lblNewLabel_1_2_1 = new JLabel("Address");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(37, 311, 136, 30);
		frameUpdateData.getContentPane().add(lblNewLabel_1_2_1);

		JTextArea txtAddress = new JTextArea();
		txtAddress.setBounds(190, 316, 251, 112);
		frameUpdateData.getContentPane().add(txtAddress);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("Gender");
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(37, 458, 136, 30);
		frameUpdateData.getContentPane().add(lblNewLabel_1_2_1_1);

		JRadioButton RadiobtnMale = new JRadioButton("Male");
		buttonGroup.add(RadiobtnMale);
		RadiobtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		RadiobtnMale.setBackground(Color.WHITE);
		RadiobtnMale.setBounds(190, 464, 103, 21);
		frameUpdateData.getContentPane().add(RadiobtnMale);

		JRadioButton RadiobtnFemale = new JRadioButton("Female");
		buttonGroup.add(RadiobtnFemale);
		RadiobtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		RadiobtnFemale.setBackground(new Color(255, 128, 192));
		RadiobtnFemale.setBounds(295, 465, 103, 21);
		frameUpdateData.getContentPane().add(RadiobtnFemale);

		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("QUAL.");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_1.setBounds(37, 527, 136, 30);
		frameUpdateData.getContentPane().add(lblNewLabel_1_2_1_1_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "BE", "ME", "MCA"}));
		comboBox.setBounds(190, 528, 208, 27);
		frameUpdateData.getContentPane().add(comboBox);

		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Department");
		lblNewLabel_1_2_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_2.setBounds(532, 458, 136, 30);
		frameUpdateData.getContentPane().add(lblNewLabel_1_2_1_1_2);

		JLabel lblNewLabel_1_2_1_1_3 = new JLabel("DOB");
		lblNewLabel_1_2_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_3.setBounds(488, 525, 136, 30);
		frameUpdateData.getContentPane().add(lblNewLabel_1_2_1_1_3);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(625, 527, 118, 21);
		frameUpdateData.getContentPane().add(dateChooser);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 633, 1005, 10);
		frameUpdateData.getContentPane().add(separator_1);

		JComboBox departComboBox = new JComboBox();
		departComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "MECHANICAL", "COMPUTER", "E&TC"}));
		departComboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		departComboBox.setBounds(649, 458, 208, 27);
		frameUpdateData.getContentPane().add(departComboBox);
		frameUpdateData.setBounds(250, 50, 1050, 800);
		frameUpdateData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDataManagement.main(null);
			}
		});
		btnBack.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(170, 694, 85, 34);
		frameUpdateData.getContentPane().add(btnBack);

		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameUpdateData.setVisible(false);
			}
		});
		btnClose.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnClose.setBackground(Color.RED);
		btnClose.setBounds(810, 694, 85, 34);
		frameUpdateData.getContentPane().add(btnClose);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobileNumber.setText(null);
				txtAddress.setText(null);
			}
		});
		btnReset.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnReset.setBackground(new Color(0, 128, 255));
		btnReset.setBounds(609, 694, 85, 34);
		frameUpdateData.getContentPane().add(btnReset);

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String FirstName=txtFirstName.getText();
				String LastName=txtLastName.getText();
				long MobileNumber= Long.parseLong(txtMobileNumber.getText());
				String Address=txtAddress.getText();

				System.out.println(FirstName + " " + LastName + " " + MobileNumber + " " + Address );

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date = sdf.format(dateChooser.getDate());

				System.out.println(date);

				String department=null;
				department =(String) departComboBox.getSelectedItem();
				System.out.println(department);

				String gender = null;

				if(RadiobtnMale.isSelected()) {
					gender= "Male";
				}else if(RadiobtnFemale.isSelected()) {
					gender= "Female";
				}else {
					System.out.println("Plz Select gender");
				}

				System.out.println(gender);

				String degree = null;
				degree = (String)comboBox.getSelectedItem();

				System.out.println(degree);

				System.out.println("Reached here");

				JDBC_Staff jd = new JDBC_Staff();
				int serialNo = Integer.parseInt(txtSerialNumber.getText());
				int updteStatus = jd.insertUpdate(serialNo ,FirstName, LastName, MobileNumber, Address, gender, date, degree,department);
				
				System.out.println(updteStatus);
				if(updteStatus==1) {
					JOptionPane.showMessageDialog(null,"Data Uploaded" );
					System.out.println(updteStatus);
				}else {
					JOptionPane.showMessageDialog(null,"Problem in Add Data" );
				}



			}
		});
		btnUpdate.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnUpdate.setBackground(new Color(0, 128, 255));
		btnUpdate.setBounds(372, 694, 85, 34);
		frameUpdateData.getContentPane().add(btnUpdate);


	}

}
