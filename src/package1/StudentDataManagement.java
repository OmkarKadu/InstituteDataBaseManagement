package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentDataManagement {

	private JFrame frmStdDM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDataManagement window = new StudentDataManagement();
					window.frmStdDM.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDataManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStdDM = new JFrame();
		frmStdDM.getContentPane().setBackground(new Color(0, 0, 0));
		frmStdDM.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DATA BASE MANAGEMENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(256, 28, 1010, 67);
		frmStdDM.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(155, 143, 1211, 2);
		frmStdDM.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(409, 202, 703, 420);
		frmStdDM.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCreate = new JButton("");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(null);
			}
		});
		btnCreate.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/plusSign.jpeg")));
		btnCreate.setBounds(10, 10, 342, 199);
		panel.add(btnCreate);
		
		JButton btnShow = new JButton("");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowStudentData.main(null);
			}
		});
		btnShow.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/2529527SD.png")));
		btnShow.setBounds(353, 10, 342, 199);
		panel.add(btnShow);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudentData.main(null);
			}
		});
		btnUpdate.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/2529403UD1222.png")));
		btnUpdate.setBounds(10, 219, 342, 199);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudentData.main(null);
			}
		});
		btnDelete.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/delete.png")));
		btnDelete.setBounds(353, 219, 342, 199);
		panel.add(btnDelete);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(155, 676, 1211, 2);
		frmStdDM.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStdDM.setVisible(false);
//				StudentDataManagement.main(null);
			}
		});
		btnBack.setBackground(new Color(192, 192, 192));
		btnBack.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		btnBack.setBounds(523, 712, 124, 46);
		frmStdDM.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(900, 712, 124, 46);
		frmStdDM.getContentPane().add(btnExit);
		frmStdDM.setBackground(new Color(0, 0, 0));
		frmStdDM.setIconImage(Toolkit.getDefaultToolkit().getImage(StudentDataManagement.class.getResource("/Images/OK logo.jpg")));
		frmStdDM.setTitle("Student Data Management");
		
	     Toolkit tool = Toolkit.getDefaultToolkit();
	     Dimension dim = tool.getScreenSize();
	     int height = dim.height;
	     int width= dim.width;
	     frmStdDM.setSize(width, height);
	     System.out.println(width + " " +  height);
		
//		frmStdDM.setBounds(100, 100, 450, 300);
//		frmStdDM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frmStdDM.getContentPane().setLayout(null);
	}
}
