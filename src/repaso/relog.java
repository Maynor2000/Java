package repaso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Date;



public class relog extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		relog frame = new relog();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public relog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		 
		 btnNewButton = new JButton("stop");
		 contentPane.add(btnNewButton);
		
		 miboton = new JButton("iniciar");
		contentPane.add(miboton);
		
		
		mirelog mi = new mirelog();
		miboton.addActionListener(mi);
		btnNewButton.addActionListener(mi);
		 milabel = new JLabel("New label");
		milabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(milabel);
	}
	public void iniciar(mirelog mi,String btn,Timer relog) {
		
		if(btn=="iniciar")relog.start();
			if(btn=="stop")relog.stop();
		
		
	}
	
	public String getTime() {
		int tiempo = new Date().getSeconds();
		int tiempo1 = new Date().getMinutes();
		int tiempo2 = new Date().getHours();
		String segundos = Integer.toString(tiempo);
		String minutos = Integer.toString(tiempo1);
		String horas = Integer.toString(tiempo2);
	
		return horas+":"+minutos+":"+segundos;
	}
	private class mirelog implements ActionListener{
		Timer relog = new Timer(0,this);
		@Override
		public void actionPerformed(ActionEvent e) {
			String btn =e.getActionCommand();
			if(e.getActionCommand()!=null)iniciar(this,btn,relog);
			
			System.out.println(e.getActionCommand());
			
			
			milabel.setText(getTime());
		}
		
	}
	private JLabel milabel;
	private JButton miboton;
	private JButton btnNewButton;

}
