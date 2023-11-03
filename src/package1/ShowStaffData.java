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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


import package2.JDBC_Student;
import package2.*;

public class ShowStaffData {

	private JFrame frameShowData;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStaffData window = new ShowStaffData();
					window.frameShowData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowStaffData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameShowData = new JFrame();
		frameShowData.getContentPane().setBackground(new Color(250, 244, 133));
		frameShowData.setBounds(250, 50, 1050, 800);
		frameShowData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameShowData.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STAFF DATABASE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBackground(new Color(128, 6, 0));
		lblNewLabel.setBounds(266, 10, 505, 47);
		frameShowData.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 6, 0));
		separator.setBounds(71, 67, 894, 2);
		frameShowData.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(null); 
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		btnNewButton.setBounds(71, 703, 110, 38);
		frameShowData.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PRINT");
		btnNewButton_1.setForeground(new Color(0, 64, 128));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDBC_Staff jd = new JDBC_Staff();
				ResultSet result=jd.getTable();
				
				
				DefaultTableModel model = new DefaultTableModel();
				String[] columnNames = {"SerialNo" , "FirstName", "LastName","PhoneNumber", "Address" , "Gender", "DateOfBirth", "Qualification", "Department"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[] {
						result.getInt(1),
						result.getString(2),
						result.getString(3),
						result.getLong(4),
						result.getString(5),
						result.getString(6),
						result.getString(7),
						result.getString(8),
						result.getString(9),
						
						
						});
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		btnNewButton_1.setBounds(463, 703, 110, 38);
		frameShowData.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CLOSE");
		btnNewButton_2.setBackground(new Color(237, 18, 23));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameShowData.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		btnNewButton_2.setBounds(835, 707, 110, 38);
		frameShowData.getContentPane().add(btnNewButton_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 6, 0));
		separator_1.setBounds(71, 676, 894, 2);
		frameShowData.getContentPane().add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 115, 853, 510);
		frameShowData.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(128, 0, 0));
		table.setFont(new Font("Times New Roman", Font.BOLD, 10));
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"SerialNo", "FirstName", "LastName", "MobileNumber", "Address", "Gender", "DateOfBirth", "Education", "Subject_1", "Subject_2"
			}
		));
		scrollPane.setViewportView(table);
	}

}
