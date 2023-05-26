package University_Management_System;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField PasswordF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kashif\\Downloads\\Prof"));
		setTitle("Login Form");
		setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 454, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		TextField UTF = new TextField();
		UTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		UTF.setName("");
		UTF.setBounds(171, 92, 115, 24);
		contentPane.add(UTF);


		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {


				if(UTF.getText().equals("kashi") && PasswordF.getText().equals("kashi"))
				{
					SandFform j=new SandFform();
					j.setVisible(true);
					dispose();
				}
				else {

					JOptionPane.showMessageDialog( LoginButton,"Invalid Password or Username",
							"WARNING", JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		LoginButton.setBounds(179, 194, 93, 23);
		contentPane.add(LoginButton);

		PasswordF = new JPasswordField();
		PasswordF.setHorizontalAlignment(SwingConstants.LEFT);
		PasswordF.setBounds(171, 133, 115, 24);
		contentPane.add(PasswordF);

		JLabel usericonL = new JLabel("Username: ");
		usericonL.setEnabled(false);
		usericonL.setBackground(new Color(0, 64, 0));
		usericonL.setForeground(new Color(128, 128, 64));
		usericonL.setIcon(new ImageIcon("Image Path"));
		usericonL.setBounds(100, 92, 100, 23);
		contentPane.add(usericonL);

		JLabel passiconL = new JLabel("Password: ");
		passiconL.setEnabled(false);
		passiconL.setIcon(new ImageIcon("Image Path"));
		passiconL.setBounds(100, 133, 100, 22);
		contentPane.add(passiconL);

		JLabel uoslogoiconL = new JLabel("");
		uoslogoiconL.setEnabled(false);
		uoslogoiconL.setIcon(new ImageIcon("Image Path"));
		uoslogoiconL.setBounds(171, 43, 100, 43);
		contentPane.add(uoslogoiconL);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Image Path"));
		lblNewLabel.setBounds(-324, -42, 947, 375);
		contentPane.add(lblNewLabel);
	}
}
