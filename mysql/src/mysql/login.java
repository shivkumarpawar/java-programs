package mysql;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField passwordField;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(12, 40, 103, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Adobe Gothic Std B", Font.BOLD, 18));
		lblLogin.setBounds(69, 13, 103, 39);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 105, 103, 39);
		contentPane.add(lblPassword);
		
		user = new JTextField();
		user.setBounds(12, 75, 206, 30);
		contentPane.add(user);
		user.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					Statement stmt=con.createStatement();
					String sql= "Select * from user where UserName='"+user.getText()+"' and password = '"+pass.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					  JOptionPane.showMessageDialog(null , "Log in succesefully...");
					else
						 JOptionPane.showMessageDialog(null , "Incorrect credentials..");
					con.close();
					  
					  
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		btnNewButton.setBounds(12, 195, 97, 25);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(43, 174, -6, 22);
		contentPane.add(passwordField);
		
		pass = new JPasswordField();
		pass.setBounds(12, 144, 206, 30);
		contentPane.add(pass);
	}
}
