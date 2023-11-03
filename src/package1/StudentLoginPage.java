package package1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class StudentLoginPage {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLoginPage window = new StudentLoginPage();
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
	public StudentLoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(StudentLoginPage.class.getResource("/Images/OK logo.jpg")));
		frame.getContentPane().setBackground(new Color(65, 156, 190));
		frame.setForeground(new Color(0, 0, 0));
		frame.setBackground(new Color(255, 255, 255));
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		Dimension dim=tool.getScreenSize();
		int height = (int)dim.getHeight();
		int width = (int)dim.getWidth();
		frame.setBounds(100, 100, width/2, height/2);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("N Infinity Engineering Academy ");
		lblNewLabel.setForeground(new Color(64, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(213, 27, 347, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(48, 76, 658, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Login Student");
		lblNewLabel_1.setForeground(new Color(224, 31, 31));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(284, 104, 185, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel txtLogin = new JLabel("Username");
		txtLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setForeground(new Color(255, 255, 255));
		txtLogin.setBounds(145, 167, 116, 44);
		frame.getContentPane().add(txtLogin);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(257, 181, 239, 19);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel txtPassword = new JLabel("Password");
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPassword.setBounds(145, 233, 116, 44);
		frame.getContentPane().add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(48, 314, 658, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(new Color(0, 0, 255));
		btnLogin.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("OmkarKadu") && pwdPassword.getText().equals("omkar179")) {
					
					MainEntryPage.main(null);
					
				}else {
					JOptionPane.showMessageDialog(null,"Incorrect Username or Password","Login Failure",JOptionPane.ERROR_MESSAGE);
					JOptionPane.showConfirmDialog(null, "Change Username or Password");
					
				}
				
			}
		});
		btnLogin.setBounds(350, 335, 102, 33);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				pwdPassword.setText(null);
			}
		});
		btnReset.setBounds(107, 335, 102, 33);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Do you want to Exit?","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
					System.exit(0);
				}
				
			}
		});
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnExit.setBounds(576, 335, 102, 33);
		frame.getContentPane().add(btnExit);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(259, 247, 236, 19);
		frame.getContentPane().add(pwdPassword);
	}
}
