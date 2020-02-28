package com.chat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_2 {
	static String username2;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_2 window = new Window_2();
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
	public Window_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 418, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setBounds(12, 13, 179, 16);
		frame.getContentPane().add(lbl2);
		
		JTextArea display2 = new JTextArea();
		display2.setBounds(12, 38, 367, 270);
		frame.getContentPane().add(display2);
		
		JButton clear1 = new JButton("CLEAR");
		clear1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		clear1.setBounds(292, 9, 97, 25);
		frame.getContentPane().add(clear1);
		
		JTextArea text2 = new JTextArea();
		text2.setBounds(12, 321, 252, 43);
		frame.getContentPane().add(text2);
		
		JButton send2 = new JButton("SEND");
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text2.getText();
				if (s.equals("")) {
					return; //if its null return nothing
				}
				display2.append(username2 + ":" + s + "\n");
				Window_1.sendText(); //send text method of Window_2
				text2.setText("");
			}
		});
		send2.setBounds(282, 321, 97, 43);
		frame.getContentPane().add(send2);
		
		
	}

	public static void sendText() {
		String s = Window_1.text1.getText();
		if (s.equals("")) {
			return; //if null return nothing
		}
		display2.append(Window_1.username1 + ":" + s + "\n");
	}
	
	private javax.swing.JLabel lbl2;
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;
}
