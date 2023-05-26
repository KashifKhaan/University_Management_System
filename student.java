package University_Management_System;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class student extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel student;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student frame = new student();
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
	public student() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Icon Path"));
		setTitle("Student");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 411, 300);
		student = new JPanel();
		student.setBorder(new EmptyBorder(5, 5, 5, 5));
		student.setBackground(Color.GRAY);

		setContentPane(student);
		student.setLayout(null);
		
		JButton Admissionbtn = new JButton("Program Detail");
		Admissionbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Programdetail j=new Programdetail();
				j.setVisible(true);
				dispose();
			}
		});
		Admissionbtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Admissionbtn.setBounds(202, 138, 130, 38);
		student.add(Admissionbtn);
		
		JButton Feedetailbtn = new JButton("Finance System");
		Feedetailbtn.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				dispose();
			
				FeeDetail j=new FeeDetail();
				j.setVisible(true);
				
			}
		});
		Feedetailbtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Feedetailbtn.setBounds(202, 89, 130, 38);
		student.add(Feedetailbtn);
		
		JButton Examsystembtn = new JButton("Exam System");
		Examsystembtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Examsystem j=new Examsystem();
				j.setVisible(true);
				
			}
		});
		Examsystembtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Examsystembtn.setBounds(49, 138, 130, 38);
		student.add(Examsystembtn);
		
		JButton Backbtn = new JButton("Back");
		Backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SandFform j=new SandFform();
				j.setVisible(true);
				
			}
		});
		Backbtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Backbtn.setBounds(141, 195, 94, 23);
		student.add(Backbtn);
		
		JButton btnNewButton = new JButton("Admission Form");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdmissionForm j=new AdmissionForm();
				j.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(49, 89, 130, 38);
		student.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Icon Path"));
		lblNewLabel.setBounds(0, 0, 395, 261);
		student.add(lblNewLabel);
	}

	public static void setColor(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}
}
