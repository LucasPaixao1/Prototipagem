package Spalsh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import View.ViewLoginDesign;

import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.io.File;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

public class SpalshScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpalshScreen frame = new SpalshScreen();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SpalshScreen() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 357);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(17,144,147));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(17,144,147));
		panel.setBounds(0, 0, 637, 357);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setForeground(Color.GRAY);
		progressBar.setStringPainted(true);
		progressBar.setBounds(131, 183, 441, 27);
		panel.add(progressBar);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Elephant", Font.PLAIN, 12));
		label.setForeground(Color.WHITE);
		label.setBounds(252, 266, 162, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Varej\u00E3o Santos");
		label_1.setForeground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Elephant", Font.PLAIN, 36));
		label_1.setBounds(119, 102, 459, 43);
		panel.add(label_1);
		
		new Thread(){
			public void run(){
				for (int i = 0; i < 101; i++) {
					try {
						sleep(120);
						progressBar.setValue(i);
						
						if(progressBar.getValue()<=20){
							label.setText("Carregando banco de dados");
							
						}else if(progressBar.getValue()<=40){
							label.setText("Carregando tabelas");
							//panel.setBackground(Color.RED);
							
						}else if (progressBar.getValue()<=70){
							label.setText("Carregando Sistema");
							panel.setBackground(new Color(25,25,112));
							
						}else if(progressBar.getValue()==100){
							ViewLoginDesign Window = new ViewLoginDesign();
							Window.setVisible(true);
							dispose();
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
			
			
		}.start();
		
		
	}
}
