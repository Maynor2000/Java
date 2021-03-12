package Threads;
import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame marco=new MarcoRebote();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}




//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota{
	
	// Mueve la pelota invirtiendo posición si choca con límites
	
	public void mueve_pelota(Rectangle2D limites){
		
		x+=dx;
		
		y+=dy;
		
		if(x<limites.getMinX()){
			
			x=limites.getMinX();
			
			dx=-dx;
		}
		
		if(x + TAMX>=limites.getMaxX()){
			
			x=limites.getMaxX() - TAMX;
			
			dx=-dx;
		}
		
		if(y<limites.getMinY()){
			
			y=limites.getMinY();
			
			dy=-dy;
		}
		
		if(y + TAMY>=limites.getMaxY()){
			
			y=limites.getMaxY()-TAMY;
			
			dy=-dy;
			
		}
		
	}
	
	//Forma de la pelota en su posición inicial
	
	public Ellipse2D getShape(){
		
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
		
	}	
	
	private static final int TAMX=15;
	
	private static final int TAMY=15;
	
	private double x=0;
	
	private double y=0;
	
	private double dx=1;
	
	private double dy=1;
	
	
}

// Lámina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel{
	
	//Añadimos pelota a la lámina
	
	public void add(Pelota b){
		
		pelotas.add(b);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Pelota b: pelotas){
			
			g2.fill(b.getShape());
		}
		
	}
	
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame{
	
	public MarcoRebote(){
		
		setBounds(600,300,400,350);
		
		setTitle ("Rebotes");
		
		lamina=new LaminaPelota();
		
		add(lamina, BorderLayout.CENTER);
		
		JPanel laminaBotones=new JPanel();
		
		add(laminaBotones, BorderLayout.SOUTH);
		da1 = new JButton("dale1");
		da1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				comienza_el_juego(a);
				
			}
			
		});
		laminaBotones.add(da1);
		da2 = new JButton("dale2");
		da2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				comienza_el_juego(a);
				
			}
			
		});
		laminaBotones.add(da2);
		da3 = new JButton("dale3");
		da3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				comienza_el_juego(a);
				
			}
			
		});
		laminaBotones.add(da3);
		//---------------------------------------------------------------
		de1 = new JButton("deten1");
		de1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				detener(a);
				
			}
			
		});
		laminaBotones.add(de1);
		de2 = new JButton("deten2");
		de2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				detener(a);
				
			}
			
		});
		laminaBotones.add(de2);
		de3 = new JButton("deten3");
		de3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				detener(a);
				
			}
			
		});
		laminaBotones.add(de3);
		
		
	}
	
	//funccion que detiene la ejecucion de los hilos
	public void detener(ActionEvent a) {
		if(a.getSource().equals(de1)) {
			t1.interrupt();
		}
		if(a.getSource().equals(de2)) {
			t2.interrupt();
		}
		if(a.getSource().equals(de3)) {
			t3.interrupt();
		}
		
	}
	//Ponemos botones
	
	public void ponerBoton(Container c, String titulo, ActionListener oyente){
		
		JButton boton=new JButton(titulo);
		
		c.add(boton);
		
		boton.addActionListener(oyente);
		
	}
	
	//Añade pelota y la bota 1000 veces
	
	public void comienza_el_juego (ActionEvent a){
		
					
			Pelota pelota=new Pelota();
			lamina.add(pelota);
			Runnable rt= new hilos(pelota,lamina);
			if(a.getSource().equals(da1)) {
				t1 = new Thread(rt);
				t1.start();
			}
			if(a.getSource().equals(da2)) {
				t2 = new Thread(rt);
				t2.start();
			}
			if(a.getSource().equals(da3)) {
				t3 = new Thread(rt);
				t3.start();
			}


			
			
		
		
	}
	JButton da1,da2,da3,de1,de2,de3;
	Thread t1,t2,t3;
	
	private LaminaPelota lamina;
	
	
}
class hilos implements Runnable{
	public hilos(Pelota pelota,Component lamina) {
		this.lamina=lamina;
		this.pelota=pelota;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().isInterrupted());
		
		while(!Thread.currentThread().isInterrupted()){
			pelota.mueve_pelota(lamina.getBounds());
			lamina.paint(lamina.getGraphics());
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				Thread.currentThread().isInterrupted();
			}
		}
		
		System.out.println(Thread.currentThread().isInterrupted());
		
		/*while(!Thread.interrupted()) {
			
		}*/
		/*for (int i=1; i<=3000; i++){
			
			pelota.mueve_pelota(lamina.getBounds());
			
			lamina.paint(lamina.getGraphics());
			*/
			
		}
		
	//}
	private Component lamina;
	private Pelota pelota;
	
}
