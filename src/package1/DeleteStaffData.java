package package1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import package2.JDBC_Student;
import package2.*;

public class DeleteStaffData {

	private JFrame frameDeleteData;
	private JTextField txtSerialNumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStaffData window = new DeleteStaffData();
					window.frameDeleteData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStaffData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameDeleteData = new JFrame();
		frameDeleteData.getContentPane().setBackground(new Color(128, 128, 128));
		frameDeleteData.setBounds(250, 50, 1050, 800);
		frameDeleteData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDeleteData.getContentPane().setLayout(null);
		
		JLabel lblEnterSerialNo = new JLabel("DELETE STUDENT ENTRY");
		lblEnterSerialNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterSerialNo.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblEnterSerialNo.setBounds(287, 22, 462, 58);
		frameDeleteData.getContentPane().add(lblEnterSerialNo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 84, 964, 9);
		frameDeleteData.getContentPane().add(separator);
		
		JLabel lblEnterSerialNo_1 = new JLabel("Enter Serial No to Delete  : ");
		lblEnterSerialNo_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblEnterSerialNo_1.setBounds(69, 162, 364, 39);
		frameDeleteData.getContentPane().add(lblEnterSerialNo_1);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setColumns(10);
		txtSerialNumber.setBounds(478, 162, 257, 39);
		frameDeleteData.getContentPane().add(txtSerialNumber);
		
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
		btnNewButton.setBounds(779, 162, 107, 38);
		frameDeleteData.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("First Name ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(77, 252, 118, 30);
		frameDeleteData.getContentPane().add(lblNewLabel_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(205, 255, 251, 27);
		frameDeleteData.getContentPane().add(txtFirstName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name  ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(69, 329, 118, 30);
		frameDeleteData.getContentPane().add(lblNewLabel_1_1);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(205, 332, 251, 27);
		frameDeleteData.getContentPane().add(txtLastName);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 421, 964, 9);
		frameDeleteData.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(144, 514, 85, 34);
		frameDeleteData.getContentPane().add(btnBack);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameDeleteData.setVisible(false);
			}
		});
		btnClose.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnClose.setBackground(Color.RED);
		btnClose.setBounds(777, 514, 85, 34);
		frameDeleteData.getContentPane().add(btnClose);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDBC_Staff jd= new JDBC_Staff();
				int SerialNo=Integer.parseInt(txtSerialNumber.getText());
				
				int status=jd.deleteData(SerialNo);
				
				 if(status==1) {
					   JOptionPane.showMessageDialog(null,"Data Deleted Successfully" );
				   }else {
					   JOptionPane.showMessageDialog(null,"Problem in Add Data" );
				   }
				 txtSerialNumber.setText(null);
				 txtFirstName.setText(null);
				 txtLastName.setText(null);
				
				
			}
		});
		btnDelete.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnDelete.setBackground(new Color(255, 0, 0));
		btnDelete.setBounds(453, 514, 85, 34);
		frameDeleteData.getContentPane().add(btnDelete);
	}

}
