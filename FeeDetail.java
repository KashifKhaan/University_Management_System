package University_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
//import de.wannawork.jcalendar.JCalendarComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
public class FeeDetail extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Banktxtf;
	private JTextField Nametxtf;
	private JTextField Accountnotxtf;
	private JTextField ProgrammcodetxtF;
	private JTextField AmounttxtF;
	private JTextField ContactnotxtF;
	private JTextField BatchtxtF;
	private JTextField SemestertxtF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeDetail frame = new FeeDetail();
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
	public FeeDetail() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Icon Path"));
		setTitle("Finance System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 389, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.GRAY);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Fdetail = new JLabel("Finance System");
		Fdetail.setForeground(new Color(255, 255, 255));
		Fdetail.setFont(new Font("Tahoma", Font.BOLD, 17));
		Fdetail.setBounds(111, 11, 165, 26);
		contentPane.add(Fdetail);
		
		JLabel BankL = new JLabel("Bank Slip No :");
		BankL.setForeground(new Color(255, 255, 255));
		BankL.setFont(new Font("Tahoma", Font. BOLD, 11));
		BankL.setBounds(53, 48, 80, 14);
		contentPane.add(BankL);
		
//		JCalendarComboBox datepicker = new JCalendarComboBox();
//		datepicker.setBounds(174, 76, 154, 20);
//		contentPane.add(datepicker);
		
		Banktxtf = new JTextField();
		Banktxtf.setBounds(173, 45, 154, 20);
		contentPane.add(Banktxtf);
		Banktxtf.setColumns(10);
		
		JLabel DateL = new JLabel("Date :");
		DateL.setForeground(new Color(255, 255, 255));
		DateL.setFont(new Font("Tahoma", Font. BOLD, 11));
		DateL.setBounds(53, 73, 73, 19);
		contentPane.add(DateL);
		
		JLabel NameL = new JLabel("Name :");
		NameL.setForeground(new Color(255, 255, 255));
		NameL.setFont(new Font("Tahoma", Font. BOLD, 11));
		NameL.setBounds(53, 103, 46, 20);
		contentPane.add(NameL);
		
		Nametxtf = new JTextField();
		Nametxtf.setBounds(174, 103, 154, 20);
		contentPane.add(Nametxtf);
		Nametxtf.setColumns(10);
		
		JLabel AccountnoL = new JLabel("Account No :");
		AccountnoL.setForeground(new Color(255, 255, 255));
		AccountnoL.setFont(new Font("Tahoma", Font.BOLD, 11));
		AccountnoL.setBounds(53, 134, 80, 20);
		contentPane.add(AccountnoL);
		
		Accountnotxtf = new JTextField();
		Accountnotxtf.setBounds(174, 134, 154, 20);
		contentPane.add(Accountnotxtf);
		Accountnotxtf.setColumns(10);
		
		JLabel ProgrammcodeL = new JLabel("Programm Code :");
		ProgrammcodeL.setForeground(new Color(255, 255, 255));
		ProgrammcodeL.setFont(new Font("Tahoma", Font.BOLD, 11));
		ProgrammcodeL.setBounds(53, 165, 122, 20);
		contentPane.add(ProgrammcodeL);
		
		ProgrammcodetxtF = new JTextField();
		ProgrammcodetxtF.setBounds(174, 165, 154, 20);
		contentPane.add(ProgrammcodetxtF);
		ProgrammcodetxtF.setColumns(10);
		
		JLabel AmountL = new JLabel("Amount :");
		AmountL.setForeground(new Color(255, 255, 255));
		AmountL.setFont(new Font("Tahoma", Font. BOLD, 11));
		AmountL.setBounds(53, 200, 80, 14);
		contentPane.add(AmountL);
		
		AmounttxtF = new JTextField();
		AmounttxtF.setBounds(174, 197, 154, 20);
		contentPane.add(AmounttxtF);
		AmounttxtF.setColumns(10);
		
		JLabel ContactnoL = new JLabel("Contact No :");
		ContactnoL.setForeground(new Color(255, 255, 255));
		ContactnoL.setFont(new Font("Tahoma", Font. BOLD, 11));
		ContactnoL.setBounds(53, 221, 80, 34);
		contentPane.add(ContactnoL);
		
		ContactnotxtF = new JTextField();
		ContactnotxtF.setBounds(173, 228, 155, 20);
		contentPane.add(ContactnotxtF);
		ContactnotxtF.setColumns(10);
		
		JLabel BatchL = new JLabel("Batch :");
		BatchL.setForeground(new Color(255, 255, 255));
		BatchL.setFont(new Font("Tahoma", Font. BOLD, 11));
		BatchL.setBounds(53, 261, 46, 14);
		contentPane.add(BatchL);
		
		BatchtxtF = new JTextField();
		BatchtxtF.setBounds(174, 259, 154, 20);
		contentPane.add(BatchtxtF);
		BatchtxtF.setColumns(10);
		
		JLabel SemesterL = new JLabel("Semester :");
		SemesterL.setForeground(new Color(255, 255, 255));
		SemesterL.setFont(new Font("Tahoma", Font. BOLD, 11));
		SemesterL.setBounds(53, 296, 80, 14);
		contentPane.add(SemesterL);
		
		SemestertxtF = new JTextField();
		SemestertxtF.setBounds(174, 290, 154, 20);
		contentPane.add(SemestertxtF);
		SemestertxtF.setColumns(10);
		
		JButton feebtn = new JButton("Submit");
		feebtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		feebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(feebtn,"Submitted");
				
			}
		});
		feebtn.setBounds(239, 333, 89, 23);
		contentPane.add(feebtn);
		
		JButton Backbtn = new JButton("Back");
		Backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				student j=new student();
				j.setVisible(true);
			}
		});
		Backbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		Backbtn.setBounds(41, 333, 89, 23);
		contentPane.add(Backbtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Icon Path"));
		lblNewLabel.setBounds(0, 0, 373, 399);
		contentPane.add(lblNewLabel);
	}
}
