package sockets;



import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		Thread hilo = new Thread(this);
		hilo.start();
		
		}

	private	JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket miser = new ServerSocket(9999);
			mensaje recuperado;
			while(true) {
				
				Socket mis = miser.accept();
				ObjectInputStream entradaDatos = new ObjectInputStream(mis.getInputStream());
				recuperado = (mensaje)entradaDatos.readObject();
				String nick = recuperado.getNick();
				String ip = recuperado.getIp();
				String mensaje = recuperado.getMensaje();
				/*DataInputStream entrada = new DataInputStream(mis.getInputStream());
				String mensaje = entrada.readUTF();
				areatexto.append(mensaje+"\n");
				mis.close();
				*/
				Socket envioDatos = new Socket(ip,9090);
				ObjectOutputStream salidaDatos = new ObjectOutputStream(envioDatos.getOutputStream());
				salidaDatos.writeObject(recuperado);
				salidaDatos.close();
				envioDatos.close();
				miser.close();
			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

