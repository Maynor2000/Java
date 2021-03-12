package sockets;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
		nick = new JTextField(5);
		
		add(nick);
	
		JLabel texto=new JLabel("CLIENTE");
		
		add(texto);
		
		ip = new JTextField(8);
		
		add(ip);
		
		area1= new  JTextArea(12,20);
		
		add(area1);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		add(miboton);
		
		
		miboton.addActionListener(new evento());
		
		Thread michat = new Thread(this);
		michat.start();
		
	}
	
	
	
	private	class evento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a) {
			// TODO Auto-generated method stub
			//System.out.println(campo1.getText());
			try {
				Socket misock = new Socket("192.168.0.5",9999);
				mensaje datos = new mensaje(nick.getText(),ip.getText(),campo1.getText());
				ObjectOutputStream flujo = new ObjectOutputStream(misock.getOutputStream());
				flujo.writeObject(datos);
				area1.setForeground(Color.BLUE);
				area1.append(nick.getText()+": "+campo1.getText()+"\n");
				campo1.setText("");
				misock.close();
				/*DataOutputStream flujoS = new DataOutputStream(misock.getOutputStream());
				flujoS.writeUTF(campo1.getText());
				flujoS.close();*/
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
	}
		
		
		
	private JTextField campo1,nick,ip;
	
	private JTextArea area1;
	
	private JButton miboton;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket miser = new ServerSocket(9999);
			Socket misocket;
			mensaje recuperado;
			
			while(true) {
				misocket = miser.accept();
				ObjectInputStream entradaDatos = new ObjectInputStream(misocket.getInputStream());
				recuperado = (mensaje)entradaDatos.readObject();
				String nick = recuperado.getNick();
				String ip = recuperado.getIp();
				String mensaje = recuperado.getMensaje();
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		mensaje recuperado;
		
	}
	
}