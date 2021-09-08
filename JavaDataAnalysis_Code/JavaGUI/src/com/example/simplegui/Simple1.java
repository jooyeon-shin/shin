package com.example.simplegui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JPasswordField;

public class Simple1 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simple1 frame = new Simple1();
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
	public Simple1() {
		setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		setTitle("Learn JAVA");
		
		
		JLabel lblNewLabel = new JLabel("New label");
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
	}

}
