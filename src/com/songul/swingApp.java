package com.songul;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingApp {

	private JFrame frame; // sadece pencere , uyg bu pencereyi oluþturarak baþlýyo
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblSay;
	private JButton btnBl;
	private JButton btnarp;
	private JButton btnkar;
	private JLabel lblSonuc;
	private JButton btnTemizle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {  //event leri çizdiriyor
			public void run() {
				try {
					swingApp window = new swingApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public swingApp() {   //constructor init i çaðýrýyor cons ý da main çaðýrýyo
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.MAGENTA);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdnz = new JLabel("say\u01311");
		lblAdnz.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		lblAdnz.setBounds(57, 70, 46, 14);
		frame.getContentPane().add(lblAdnz);
		
		textField = new JTextField();
		textField.setForeground(Color.MAGENTA);
		textField.setBounds(113, 67, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSelamla = new JButton("topla");
		
		btnSelamla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sayi1= Integer.parseInt(textField_1.getText());
				int sayi2= Integer.parseInt(textField.getText());
				int sonuc = sayi1 +sayi2;
				lblSonuc.setText(String.valueOf(sonuc));
			}
		});
		btnSelamla.setBounds(10, 187, 89, 23);
		frame.getContentPane().add(btnSelamla);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.MAGENTA);
		textField_1.setColumns(10);
		textField_1.setBounds(113, 109, 86, 20);
		frame.getContentPane().add(textField_1);
		
		lblSay = new JLabel("say\u01312");
		lblSay.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		lblSay.setBounds(57, 112, 46, 14);
		frame.getContentPane().add(lblSay);
		
		btnBl = new JButton("b\u00F6l");
		btnBl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sayi1= Integer.parseInt(textField.getText());
				int sayi2= Integer.parseInt(textField_1.getText());
				int sonuc = sayi1/sayi2;
				lblSonuc.setText(String.valueOf(sonuc));
			}
		});
		btnBl.setBounds(335, 187, 89, 23);
		frame.getContentPane().add(btnBl);
		
		btnarp = new JButton("\u00E7arp");
		btnarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sayi1= Integer.parseInt(textField.getText());
				int sayi2= Integer.parseInt(textField_1.getText());
				int sonuc = sayi1 *sayi2;
				lblSonuc.setText(String.valueOf(sonuc));
				
			}
		});
		btnarp.setBounds(222, 187, 89, 23);
		frame.getContentPane().add(btnarp);
		
		btnkar = new JButton("\u00E7\u0131kar");
		btnkar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sayi1= Integer.parseInt(textField.getText());
				int sayi2= Integer.parseInt(textField_1.getText());
				int sonuc = sayi1 -sayi2;
				lblSonuc.setText(String.valueOf(sonuc));
				
			}
		});
		btnkar.setBounds(113, 187, 89, 23);
		frame.getContentPane().add(btnkar);
		
		lblSonuc = new JLabel("sonu\u00E7");
		lblSonuc.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSonuc.setBounds(325, 86, 46, 14);
		frame.getContentPane().add(lblSonuc);
		
		btnTemizle = new JButton("Temizle");
		btnTemizle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				lblSonuc.setText("sonuç");
			}
		});
		btnTemizle.setBounds(172, 227, 89, 23);
		frame.getContentPane().add(btnTemizle);
	}
}
