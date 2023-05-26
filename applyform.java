package University_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
//import de.wannawork.jcalendar.JCalendarComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class applyform extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JLabel lblNewLabel_29;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applyform frame = new applyform();
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
	public applyform() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Icon Path"));
		setTitle("Application Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 633, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.GRAY);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(241, 39, 166, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Application Form");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(231, 11, 150, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("(Must be filled by the candidate)");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(214, 39, 210, 48);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setIcon(new ImageIcon("Icon Path"));
		lblNewLabel_3.setBounds(10, 11, 92, 58);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Position Applied For :");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(383, 83, 126, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(504, 82, 92, 15);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Advertisment No :");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(383, 98, 100, 20);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(504, 100, 92, 15);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("S.No Of the Post :");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(383, 119, 100, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(503, 118, 92, 15);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Name :");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(33, 80, 46, 17);
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(145, 80, 228, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Father Name :");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(29, 100, 85, 33);
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(145, 106, 228, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Date Of Birth :");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9.setBounds(29, 136, 100, 18);
		contentPane.add(lblNewLabel_9);
		
//		JCalendarComboBox calendarComboBox = new JCalendarComboBox();
//		calendarComboBox.setBounds(145, 134, 228, 20);
//		contentPane.add(calendarComboBox);
		
		JLabel lblNewLabel_10 = new JLabel("Age :");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_10.setBounds(29, 165, 46, 18);
		contentPane.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(145, 163, 451, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Domicile :");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(29, 194, 111, 18);
		contentPane.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(145, 192, 451, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Contact No :");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12.setBounds(29, 221, 100, 20);
		contentPane.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(145, 221, 451, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Cnic No :");
		lblNewLabel_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13.setBounds(29, 252, 100, 14);
		contentPane.add(lblNewLabel_13);
		
		textField_8 = new JTextField();
		textField_8.setBounds(145, 250, 451, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Mailling Address :");
		lblNewLabel_14.setForeground(new Color(255, 255, 255));
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_14.setBounds(29, 283, 111, 18);
		contentPane.add(lblNewLabel_14);
		
		textField_9 = new JTextField();
		textField_9.setBounds(145, 281, 451, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Current Position :");
		lblNewLabel_15.setForeground(new Color(255, 255, 255));
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_15.setBounds(29, 313, 111, 18);
		contentPane.add(lblNewLabel_15);
		
		textField_10 = new JTextField();
		textField_10.setBounds(145, 311, 451, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Metric");
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16.setBounds(145, 451, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Fsc");
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_17.setBounds(231, 451, 46, 15);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Bachelor's");
		lblNewLabel_18.setForeground(new Color(255, 255, 255));
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_18.setBounds(323, 451, 84, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Workspace Add :");
		lblNewLabel_19.setForeground(new Color(255, 255, 255));
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_19.setBounds(29, 345, 111, 14);
		contentPane.add(lblNewLabel_19);
		
		textField_11 = new JTextField();
		textField_11.setBounds(145, 342, 451, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Destinction :");
		lblNewLabel_20.setForeground(new Color(255, 255, 255));
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_20.setBounds(29, 373, 100, 20);
		contentPane.add(lblNewLabel_20);
		
		textField_12 = new JTextField();
		textField_12.setBounds(145, 373, 451, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Email Address :");
		lblNewLabel_21.setForeground(new Color(255, 255, 255));
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_21.setBounds(29, 405, 111, 18);
		contentPane.add(lblNewLabel_21);
		
		textField_13 = new JTextField();
		textField_13.setBounds(145, 403, 451, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_22.setForeground(new Color(255, 255, 255));
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_22.setBounds(-14, 420, 667, 14);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Educational Record");
		lblNewLabel_23.setForeground(new Color(255, 255, 255));
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_23.setBounds(241, 434, 166, 14);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("M.Phil");
		lblNewLabel_24.setForeground(new Color(255, 255, 255));
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_24.setBounds(417, 451, 46, 14);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblPhd = new JLabel("Ph.D");
		lblPhd.setForeground(new Color(255, 255, 255));
		lblPhd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhd.setBounds(503, 451, 46, 15);
		contentPane.add(lblPhd);
		
		JLabel lblNewLabel_25 = new JLabel("Total Marks :");
		lblNewLabel_25.setForeground(new Color(255, 255, 255));
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_25.setBounds(29, 469, 85, 14);
		contentPane.add(lblNewLabel_25);
		
		textField_14 = new JTextField();
		textField_14.setBounds(145, 467, 65, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(229, 468, 72, 19);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(321, 467, 72, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(417, 467, 72, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(504, 467, 92, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Obtained Marks :");
		lblNewLabel_26.setForeground(new Color(255, 255, 255));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_26.setBounds(28, 494, 107, 14);
		contentPane.add(lblNewLabel_26);
		
		textField_19 = new JTextField();
		textField_19.setBounds(145, 492, 65, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(231, 492, 72, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(321, 492, 72, 20);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(417, 492, 72, 20);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(504, 492, 92, 20);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Percentage :");
		lblNewLabel_27.setForeground(new Color(255, 255, 255));
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_27.setBounds(29, 519, 100, 18);
		contentPane.add(lblNewLabel_27);
		
		textField_24 = new JTextField();
		textField_24.setBounds(145, 517, 65, 20);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(231, 517, 72, 20);
		contentPane.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBounds(321, 517, 72, 20);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(417, 517, 72, 20);
		contentPane.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(504, 517, 92, 20);
		contentPane.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Board/University :");
		lblNewLabel_28.setForeground(new Color(255, 255, 255));
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_28.setBounds(29, 545, 111, 14);
		contentPane.add(lblNewLabel_28);
		
		textField_29 = new JTextField();
		textField_29.setBounds(145, 543, 65, 20);
		contentPane.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(231, 543, 72, 20);
		contentPane.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(321, 543, 72, 20);
		contentPane.add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setBounds(417, 543, 72, 20);
		contentPane.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(504, 543, 92, 20);
		contentPane.add(textField_33);
		textField_33.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faculty j=new faculty();
				j.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(33, 580, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton,"Submitted Successfully");
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(507, 574, 89, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setIcon(new ImageIcon("Icon Path"));
		lblNewLabel_29.setBounds(0, 0, 617, 629);
		contentPane.add(lblNewLabel_29);
	}
}
