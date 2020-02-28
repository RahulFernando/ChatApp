  package com.chat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_1 {
	
	static String username1;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_1 window = new Window_1();
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
	public Window_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 409, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea display1 = new JTextArea();
		display1.setBounds(12, 44, 367, 270);
		frame.getContentPane().add(display1);
		
		JTextArea text1 = new JTextArea();
		text1.setBounds(12, 347, 252, 43);
		frame.getContentPane().add(text1);
		
		JButton send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = text1.getText();
				if (s.equals("")) {
					return; //if its null return nothing
				}
				display1.append(username1 + ":" + s + "\n");
				Window_2.sendText(); //send text method of Window_2
				text1.setText("");
			}
		});
		send1.setBounds(276, 347, 97, 43);
		frame.getContentPane().add(send1);
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setBounds(12, 13, 179, 16);
		frame.getContentPane().add(lbl1);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		clear.setBounds(276, 9, 97, 25);
		frame.getContentPane().add(clear);
		
	}
	
	//send text method
	public static void sendText() {
		String s = Window_2.text2.getText();
		if (s.equals("")) {
			return; //if null return nothing
		}
		display1.append(Window_2.username2 + ":" + s + "\n");
	}
	
	private javax.swing.JLabel lbl1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
}
