package University_Management_System;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Programdetail extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField SemesternotxtF;
	private JTextField CredithourstxtF1;
	private JTextField CredithourstxtF2;
	private JTextField CredithourstxtF3;
	private JTextField CredithourstxtF4;
	private JTextField CredithourstxtF5;
	private JTextField subjecttxtF1;
	private JTextField subjecttxtF2;
	private JTextField subjecttxtF3;
	private JTextField subjecttxtF4;
	private JTextField subjecttxtF5;
	private JTextField obtainedmarkstxtF1;
	private JTextField obtainedmarkstxtF2;
	private JTextField obtainedmarkstxtF3;
	private JTextField obtainedmarkstxtF4;
	private JTextField obtainedmarkstxtF5;
	private JLabel StudentRnoL;
	private JTextField StudentRnotxtF;
	private JLabel StudentnameL;
	private JTextField StundentnametxtF;
	private JLabel SfathernameL;
	private JTextField SfathernametxtF;
	private JLabel GPAL;
	private JTextField GPAtxtF;
	private JLabel CGPAL;
	private JTextField CGPAtxtF;
	private JButton Okbtn;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programdetail frame = new Programdetail();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Programdetail() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Icon Path"));
		setTitle("Program Detail");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.GRAY);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ProgramdetailL = new JLabel("Program Detail");
		ProgramdetailL.setForeground(new Color(255, 255, 255));
		ProgramdetailL.setBackground(new Color(255, 255, 255));
		ProgramdetailL.setFont(new Font("Tahoma", Font.BOLD, 14));
		ProgramdetailL.setBounds(256, 0, 114, 28);
		contentPane.add(ProgramdetailL);
		
		JLabel SemesternoL = new JLabel("Semester No :");
		SemesternoL.setForeground(new Color(255, 255, 255));
		SemesternoL.setFont(new Font("Tahoma", Font.BOLD, 11));
		SemesternoL.setBounds(24, 122, 90, 20);
		contentPane.add(SemesternoL);
		
		SemesternotxtF = new JTextField();
		SemesternotxtF.setBounds(121, 122, 495, 20);
		contentPane.add(SemesternotxtF);
		SemesternotxtF.setColumns(10);
		
		JLabel SubnameL = new JLabel("Subject Names :");
		SubnameL.setForeground(new Color(255, 255, 255));
		SubnameL.setFont(new Font("Tahoma", Font.BOLD, 11));
		SubnameL.setBounds(24, 153, 90, 22);
		contentPane.add(SubnameL);
		
		JComboBox Subnamebox1 = new JComboBox();
		Subnamebox1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select Name", "Programming", "Maths", "English", "Pak Study", "Physics"}));
		Subnamebox1.setToolTipText("");
		Subnamebox1.setBounds(120, 153, 90, 22);
		contentPane.add(Subnamebox1);
		
		JComboBox Subnamebox2 = new JComboBox();
		Subnamebox2.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select Name", "Programming", "Maths", "English", "Pak Study", "Physics"}));
		Subnamebox2.setBounds(220, 153, 92, 22);
		contentPane.add(Subnamebox2);
		
		JComboBox Subnamebox3 = new JComboBox();
		Subnamebox3.setModel(new DefaultComboBoxModel(new String[] {"Select Name", "Programming", "Maths", "English", "Pak Study", "Physics"}));
		Subnamebox3.setBounds(322, 153, 90, 22);
		contentPane.add(Subnamebox3);
		
		JComboBox Subnamebox4 = new JComboBox();
		Subnamebox4.setModel(new DefaultComboBoxModel(new String[] {"Select Name", "Programming", "Maths", "English", "Pak Study", "Physics"}));
		Subnamebox4.setBounds(424, 153, 92, 22);
		contentPane.add(Subnamebox4);
		
		JComboBox Subnamebox5 = new JComboBox();
		Subnamebox5.setModel(new DefaultComboBoxModel(new String[] {"Select Name", "Programming", "Maths", "English", "Pak Study", "Physics"}));
		Subnamebox5.setBounds(526, 153, 90, 22);
		contentPane.add(Subnamebox5);
		
		JLabel CredithoursL = new JLabel("Credit Hours :");
		CredithoursL.setForeground(new Color(255, 255, 255));
		CredithoursL.setFont(new Font("Tahoma", Font.BOLD, 11));
		CredithoursL.setBounds(24, 186, 90, 20);
		contentPane.add(CredithoursL);
		
		CredithourstxtF1 = new JTextField();
		CredithourstxtF1.setBounds(120, 186, 90, 20);
		contentPane.add(CredithourstxtF1);
		CredithourstxtF1.setColumns(10);
		
		CredithourstxtF2 = new JTextField();
		CredithourstxtF2.setBounds(222, 186, 92, 20);
		contentPane.add(CredithourstxtF2);
		CredithourstxtF2.setColumns(10);
		
		CredithourstxtF3 = new JTextField();
		CredithourstxtF3.setBounds(324, 186, 90, 20);
		contentPane.add(CredithourstxtF3);
		CredithourstxtF3.setColumns(10);
		
		CredithourstxtF4 = new JTextField();
		CredithourstxtF4.setBounds(424, 186, 92, 20);
		contentPane.add(CredithourstxtF4);
		CredithourstxtF4.setColumns(10);
		
		CredithourstxtF5 = new JTextField();
		CredithourstxtF5.setBounds(526, 186, 90, 20);
		contentPane.add(CredithourstxtF5);
		CredithourstxtF5.setColumns(10);
		
		JLabel SubjectmarksL = new JLabel("Subjet Marks :");
		SubjectmarksL.setForeground(new Color(255, 255, 255));
		SubjectmarksL.setFont(new Font("Tahoma", Font.BOLD, 11));
		SubjectmarksL.setBounds(24, 219, 90, 17);
		contentPane.add(SubjectmarksL);
		
		subjecttxtF1 = new JTextField();
		subjecttxtF1.setBounds(120, 217, 90, 20);
		contentPane.add(subjecttxtF1);
		subjecttxtF1.setColumns(10);
		
		subjecttxtF2 = new JTextField();
		subjecttxtF2.setBounds(222, 217, 92, 20);
		contentPane.add(subjecttxtF2);
		subjecttxtF2.setColumns(10);
		
		subjecttxtF3 = new JTextField();
		subjecttxtF3.setBounds(324, 217, 90, 20);
		contentPane.add(subjecttxtF3);
		subjecttxtF3.setColumns(10);
		
		subjecttxtF4 = new JTextField();
		subjecttxtF4.setBounds(424, 217, 92, 20);
		contentPane.add(subjecttxtF4);
		subjecttxtF4.setColumns(10);
		
		subjecttxtF5 = new JTextField();
		subjecttxtF5.setBounds(526, 217, 90, 20);
		contentPane.add(subjecttxtF5);
		subjecttxtF5.setColumns(10);
		
		JLabel obtainedmarksL = new JLabel("Obtained Marks :");
		obtainedmarksL.setForeground(new Color(255, 255, 255));
		obtainedmarksL.setFont(new Font("Tahoma", Font.BOLD, 11));
		obtainedmarksL.setBounds(24, 251, 102, 14);
		contentPane.add(obtainedmarksL);
		
		obtainedmarkstxtF1 = new JTextField();
		obtainedmarkstxtF1.setBounds(120, 248, 90, 20);
		contentPane.add(obtainedmarkstxtF1);
		obtainedmarkstxtF1.setColumns(10);
		
		obtainedmarkstxtF2 = new JTextField();
		obtainedmarkstxtF2.setBounds(222, 248, 92, 20);
		contentPane.add(obtainedmarkstxtF2);
		obtainedmarkstxtF2.setColumns(10);
		
		obtainedmarkstxtF3 = new JTextField();
		obtainedmarkstxtF3.setBounds(324, 248, 90, 20);
		contentPane.add(obtainedmarkstxtF3);
		obtainedmarkstxtF3.setColumns(10);
		
		obtainedmarkstxtF4 = new JTextField();
		obtainedmarkstxtF4.setBounds(424, 248, 92, 20);
		contentPane.add(obtainedmarkstxtF4);
		obtainedmarkstxtF4.setColumns(10);
		
		obtainedmarkstxtF5 = new JTextField();
		obtainedmarkstxtF5.setBounds(526, 248, 90, 20);
		contentPane.add(obtainedmarkstxtF5);
		obtainedmarkstxtF5.setColumns(10);
		
		StudentRnoL = new JLabel("Student R/No :");
		StudentRnoL.setForeground(new Color(255, 255, 255));
		StudentRnoL.setFont(new Font("Tahoma", Font.BOLD, 11));
		StudentRnoL.setBounds(25, 37, 89, 14);
		contentPane.add(StudentRnoL);
		
		StudentRnotxtF = new JTextField();
		StudentRnotxtF.setBounds(121, 34, 495, 20);
		contentPane.add(StudentRnotxtF);
		StudentRnotxtF.setColumns(10);
		
		StudentnameL = new JLabel("Stundent Name :");
		StudentnameL.setForeground(new Color(255, 255, 255));
		StudentnameL.setFont(new Font("Tahoma", Font.BOLD, 11));
		StudentnameL.setBounds(24, 62, 102, 23);
		contentPane.add(StudentnameL);
		
		StundentnametxtF = new JTextField();
		StundentnametxtF.setBounds(121, 65, 495, 20);
		contentPane.add(StundentnametxtF);
		StundentnametxtF.setColumns(10);
		
		SfathernameL = new JLabel("S/Father Name :");
		SfathernameL.setForeground(new Color(255, 255, 255));
		SfathernameL.setFont(new Font("Tahoma", Font.BOLD, 11));
		SfathernameL.setBounds(24, 82, 102, 39);
		contentPane.add(SfathernameL);
		
		SfathernametxtF = new JTextField();
		SfathernametxtF.setBounds(121, 93, 495, 20);
		contentPane.add(SfathernametxtF);
		SfathernametxtF.setColumns(10);
		
		GPAL = new JLabel("GPA :");
		GPAL.setForeground(new Color(255, 255, 255));
		GPAL.setFont(new Font("Tahoma", Font.BOLD, 11));
		GPAL.setBounds(24, 278, 46, 23);
		contentPane.add(GPAL);
		
		GPAtxtF = new JTextField();
		GPAtxtF.setBounds(121, 279, 495, 20);
		contentPane.add(GPAtxtF);
		GPAtxtF.setColumns(10);
		
		CGPAL = new JLabel("CGPA :");
		CGPAL.setForeground(new Color(255, 255, 255));
		CGPAL.setFont(new Font("Tahoma", Font.BOLD, 11));
		CGPAL.setBounds(24, 312, 46, 18);
		contentPane.add(CGPAL);
		
		CGPAtxtF = new JTextField();
		CGPAtxtF.setBounds(120, 310, 496, 20);
		contentPane.add(CGPAtxtF);
		CGPAtxtF.setColumns(10);
		
		Okbtn = new JButton("OK");
		Okbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Okbtn,"Result");
				
			}
		});
		Okbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		Okbtn.setBounds(435, 341, 129, 28);
		contentPane.add(Okbtn);
		
		JButton Backbtn = new JButton("Back");
		Backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				student j=new student();
				j.setVisible(true);
			}
		});
		Backbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		Backbtn.setBounds(121, 341, 129, 28);
		contentPane.add(Backbtn);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(""));
		lblNewLabel.setBounds(-251, 1, 884, 377);
		contentPane.add(lblNewLabel);
	}
}
