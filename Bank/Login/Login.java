package com.Bank.Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setTitle("Goliath National Bank");
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 466);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(30, 144, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Goliath National Bank");
		title.setForeground(new Color(30, 144, 255));
		title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 34));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBackground(Color.WHITE);
		title.setBounds(93, 10, 428, 36);
		contentPane.add(title);
		
		JLabel accountRequester = new JLabel("Enter your account number");
		accountRequester.setFont(new Font("Dubai Medium", Font.BOLD, 25));
		accountRequester.setHorizontalAlignment(SwingConstants.CENTER);
		accountRequester.setBounds(104, 68, 374, 36);
		contentPane.add(accountRequester);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		textField.setBounds(148, 126, 307, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter pin");
		lblNewLabel.setFont(new Font("Dubai Medium", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(104, 181, 374, 36);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 25));
		passwordField.setBounds(177, 227, 225, 36);
		contentPane.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.setForeground(new Color(30, 144, 255));
		loginButton.setBackground(new Color(255, 255, 255));
		loginButton.setFont(new Font("Dubai Medium", Font.BOLD, 20));
		loginButton.setBounds(104, 287, 143, 36);
		contentPane.add(loginButton);
		
		JButton resetButton = new JButton("Reset Password");
		resetButton.setBackground(new Color(255, 255, 255));
		resetButton.setForeground(new Color(30, 144, 255));
		resetButton.setFont(new Font("Dubai Medium", Font.BOLD, 20));
		resetButton.setBounds(324, 290, 197, 34);
		contentPane.add(resetButton);
	}
}
