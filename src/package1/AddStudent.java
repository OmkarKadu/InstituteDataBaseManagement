package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import package2.*;

public class AddStudent {

	private JFrame frameAddStudent;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtNumber;
	private JTextField txtAddress;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frameAddStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAddStudent = new JFrame();
		frameAddStudent.getContentPane().setBackground(new Color(63, 164, 192));
		frameAddStudent.setBounds(250, 50, 1050, 800);
		frameAddStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddStudent.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT ENTRY FORM ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(132, 20, 771, 53);
		frameAddStudent.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(87, 80, 862, 8);
		frameAddStudent.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(252, 150, 67));
		panel.setBounds(129, 144, 787, 558);
		frameAddStudent.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Details");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBounds(329, 10, 129, 34);
		panel.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(0, 54, 787, 34);
		panel.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("First Name.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(32, 67, 88, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name.");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(32, 113, 88, 34);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile No.");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(32, 157, 88, 34);
		panel.add(lblNewLabel_1_2);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(130, 77, 192, 19);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(130, 123, 192, 19);
		panel.add(txtLastName);
		
		txtNumber = new JTextField();
		txtNumber.setColumns(10);
		txtNumber.setBounds(130, 167, 192, 19);
		panel.add(txtNumber);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Address.");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(32, 211, 88, 34);
		panel.add(lblNewLabel_1_2_1);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(130, 211, 197, 94);
		panel.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Gender");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_2_1_1.setBounds(32, 322, 88, 34);
		panel.add(lblNewLabel_1_2_1_1);
		
		JRadioButton RadiobtnMale = new JRadioButton("Male");
		buttonGroup.add(RadiobtnMale);
		RadiobtnMale.setBackground(new Color(255, 255, 255));
		RadiobtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		RadiobtnMale.setBounds(130, 330, 103, 21);
		panel.add(RadiobtnMale);
		
		JRadioButton RadiobtnFemale = new JRadioButton("Female");
		buttonGroup.add(RadiobtnFemale);
		RadiobtnFemale.setBackground(new Color(255, 128, 192));
		RadiobtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		RadiobtnFemale.setBounds(235, 330, 103, 21);
		panel.add(RadiobtnFemale);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Degree.");
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_2_1_1_1.setBounds(32, 366, 88, 34);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "ME", "MCS"}));
		comboBox.setBounds(130, 375, 192, 21);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("Subject.");
		lblNewLabel_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_2_1_1_1_1.setBounds(370, 322, 88, 34);
		panel.add(lblNewLabel_1_2_1_1_1_1);
		
		JCheckBox chkboxJAVA = new JCheckBox("JAVA");
		chkboxJAVA.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chkboxJAVA.setBounds(464, 330, 93, 21);
		panel.add(chkboxJAVA);
		
		JCheckBox chkboxPython = new JCheckBox("PYTHON");
		chkboxPython.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chkboxPython.setBounds(574, 330, 93, 21);
		panel.add(chkboxPython);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(0, 470, 787, 34);
		panel.add(separator_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(417, 77, 295, 220);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setIcon(new ImageIcon("F:\\FullStackJava\\DataBaseManagement\\src\\Images\\GrpStudents1.png"));
		lblNewLabel_2.setBounds(0, 0, 295, 220);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2_1_1_1_2 = new JLabel("D.O.B");
		lblNewLabel_1_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_2_1_1_1_2.setBounds(370, 366, 88, 34);
		panel.add(lblNewLabel_1_2_1_1_1_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(464, 379, 93, 21);
		panel.add(dateChooser);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(128, 621, 1, 2);
		frameAddStudent.getContentPane().add(separator_2);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameAddStudent.setVisible(false);
			}
		});
		btnClose.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnClose.setBackground(new Color(255, 0, 0));
		btnClose.setBounds(628, 502, 85, 34);
		panel.add(btnClose);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtAddress.setText(null);
			    txtNumber.setText(null);
			    chkboxJAVA.setSelected(false);
			    chkboxPython.setSelected(false);
			    dateChooser.setCalendar(null);
			     
			}
		});
		btnReset.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnReset.setBackground(new Color(0, 128, 255));
		btnReset.setBounds(464, 502, 85, 34);
		panel.add(btnReset);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String FirstName=txtFirstName.getText();
				String LastName=txtLastName.getText();
				long MobileNumber= Long.parseLong(txtNumber.getText());
			    String Address=txtAddress.getText();
			    
			    System.out.println(FirstName + " " + LastName + " " + MobileNumber + " " + Address );
			    
			    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			    String date = sdf.format(dateChooser.getDate());
			    
			    System.out.println(date);
			    
			    String subject1=null;
			    String subject2= null;
			    
			    boolean isSelected=chkboxJAVA.isSelected();
			    
			   if(isSelected) {
				   subject1=chkboxJAVA.getLabel();
			   }
			   
			   isSelected=chkboxPython.isSelected();
			    
			   if(isSelected) {
				   subject2=chkboxPython.getLabel();
			   }
			   
			   System.out.println(subject1 + subject2);
			   
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
			   
			   
			   JDBC_Student jd= new JDBC_Student();
			   int status=jd.insertData(FirstName, LastName, MobileNumber, Address, gender,date,degree, subject1, subject2);
			   
			   if(status==1) {
				   JOptionPane.showMessageDialog(null,"Data Uploaded" );
			   }else {
				   JOptionPane.showMessageDialog(null,"Problem in Add Data" );
			   }
			   
			   
			   
			   
				
			}
		});
		btnSave.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnSave.setBackground(new Color(128, 255, 0));
		btnSave.setBounds(292, 502, 85, 34);
		panel.add(btnSave);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDataManagement.main(null);
			}
		});
		btnBack.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnBack.setBackground(new Color(192, 192, 192));
		btnBack.setBounds(130, 502, 85, 34);
		panel.add(btnBack);
		
		
	}
}
