package package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainEntryPage {

	private JFrame frmMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEntryPage window = new MainEntryPage();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainEntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		frmMain.getContentPane().setBackground(new Color(79, 150, 176));
		frmMain.setBackground(new Color(79, 150, 176));
		frmMain.setIconImage(Toolkit.getDefaultToolkit().getImage(MainEntryPage.class.getResource("/Images/OK logo.jpg")));
		frmMain.setTitle("N Infinity Main Entry Page");
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int height = dim.height;
		int width = dim.width;
		frmMain.setSize(width, height);
		frmMain.setLocationRelativeTo(null);
		
		
		
//       	frmMain.setBounds(100, 100, 450, 300);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		
		JLabel txtTitle = new JLabel("Welcome to N Infinity Engineering Academy");
		txtTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle.setForeground(new Color(64, 0, 0));
		txtTitle.setFont(new Font("Times New Roman", Font.BOLD, 35));
		txtTitle.setBounds(324, 54, 874, 49);
		frmMain.getContentPane().add(txtTitle);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 128, 0));
		separator.setBounds(163, 129, 1196, 12);
		frmMain.getContentPane().add(separator);
		
		JButton btnStaff = new JButton("STAFF");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnStaff.setBackground(new Color(255, 255, 255));
		btnStaff.setIcon(new ImageIcon("F:\\FullStackJava\\DataBaseManagement\\src\\Images\\StaffRS.jpg"));
		btnStaff.setBounds(281, 300, 326, 257);
		frmMain.getContentPane().add(btnStaff);
		
		JButton btnStudent = new JButton("");
		btnStudent.setBackground(new Color(255, 255, 255));
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDataManagement.main(null);
			}
		});
		btnStudent.setIcon(new ImageIcon("F:\\FullStackJava\\DataBaseManagement\\src\\Images\\StudentResized.jpg"));
		btnStudent.setBounds(861, 300, 326, 257);
		frmMain.getContentPane().add(btnStudent);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 128, 0));
		separator_1.setBounds(163, 677, 1196, 12);
		frmMain.getContentPane().add(separator_1);
		
		JButton btnback = new JButton("");
		btnback.setIcon(new ImageIcon(MainEntryPage.class.getResource("/Images/backArrowResized.jpg")));
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentLoginPage.main(null);
				frmMain.setVisible(false);
			}
		});
		btnback.setBackground(new Color(255, 255, 255));
		btnback.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 25));
		btnback.setBounds(1183, 743, 63, 49);
		frmMain.getContentPane().add(btnback);
		
		JButton btnExit = new JButton("");
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setIcon(new ImageIcon(MainEntryPage.class.getResource("/Images/exitIconR.jpg")));
		btnExit.setBackground(new Color(255, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 25));
		btnExit.setBounds(1269, 743, 63, 49);
		frmMain.getContentPane().add(btnExit);
	}

}
