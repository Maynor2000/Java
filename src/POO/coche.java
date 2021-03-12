package POO;

import javax.swing.JOptionPane;

public class coche {
	private int rueda;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso;
	
	private	String color;
		
	private int peso_total;
			
	private boolean asiento_cureo,climatizador;
	
	//getter de datos generales		
	public String Dime_datos_generales() {
		
		return "la plataforma del veiculo tiene "+ rueda+" ruedas"+
		"\nmide "+  largo/1000+" metros con un ancho de "+ancho+
		"cm"+"\nun peso de platafrorma de "+peso;
	}
	//getter del largo
	public String dame_largo() {
		
		return"el largo del coche es "+ largo;
	}
	
	//setter del cambio de color
	//this indica que es la variable de la clase
	// y no la del parametro que recive 
	public void cambia_color(String color) {
		if (color.equals("azul")||color.equals("rojo")) {
			this.color=color;
		}else {
			
			JOptionPane.showMessageDialog(null,"color incorrecto");
			
		}
		    
		    
		
		}
		
	//getter de dame color
	public String dame_color() {
		return color;
	}
	//constructor
	public coche() {
		
		 rueda=4;
		
		 largo=2000;
		
		 ancho=300;
		
		 motor=1600;
		
		 peso=500;
		
	}
	
}
