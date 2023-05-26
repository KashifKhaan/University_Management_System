package University_Management_System;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SandFform extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SandFform frame = new SandFform();
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
	public SandFform() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Icon Path"));
		setTitle("Student & Faculty");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 497, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.GRAY);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton studentbtn = new JButton("Student");
		studentbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				student j=new student();
				j.setVisible(true);
			}
		});
		studentbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		studentbtn.setBounds(178, 33, 135, 45);
		contentPane.add(studentbtn);
		
		JLabel studentL = new JLabel("");
		studentL.setEnabled(false);
		studentL.setIcon(new ImageIcon("Icon Path"));
		studentL.setBounds(87, 11, 81, 67);
		
		contentPane.add(studentL);
		
		JButton Facultybtn = new JButton("Faculty");
		Facultybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faculty j=new faculty();
				j.setVisible(true);
				dispose();
			}
		});
		Facultybtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		Facultybtn.setBounds(178, 110, 135, 45);
		contentPane.add(Facultybtn);
		
		JLabel FacultyL = new JLabel("");
		FacultyL.setEnabled(false);
		FacultyL.setIcon(new ImageIcon("Icon Path"));
		FacultyL.setBounds(82, 78, 71, 87);
		contentPane.add(FacultyL);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login j=new Login();
				j.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(201, 179, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Icon Path"));
		lblNewLabel.setBounds(-143, 0, 624, 227);
		contentPane.add(lblNewLabel);
	}
}
