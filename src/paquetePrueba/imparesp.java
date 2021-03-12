package paquetePrueba;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class imparesp {

	public static void main(String[] args) {
		pframe pfr = new pframe();

	}

}
class pframe extends JFrame{
	public pframe() {
		 add(new ppanel());
	    setVisible(true);
	    setSize(300,300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class ppanel extends JPanel implements ActionListener{
	 private JTextArea ja1;
	 JTextField mitex;
	 String numeros;
	 JLabel mil;
	JButton btm1 = new JButton("calcular");
	JButton btm2 = new JButton("borrar");
	JButton agregar;
	JComboBox caja = new JComboBox();
	public ppanel() {
		 ja1 = new JTextArea(8,24);
		 mil = new JLabel("cuantos numeros impares calcularas");
		 mitex = new JTextField(3);
		 mitex.setText("0");
		add(mitex);
		 agregar = new JButton("agregar");
		 agregar.setVisible(false);
		JScrollPane scp = new JScrollPane(ja1);
		add(mil);
		ja1.setLineWrap(true);
		add(scp);
		ja1.setText(b);
		
		add(btm1);
		add(btm2);
		add(agregar);
		add(caja);
		elegir();
		btm1.addActionListener(this);
		btm2.addActionListener(this);
		caja.addActionListener(this);
		
		//impares();
		
	}
	String b;
	boolean comprobar;
	public void impares(int num) {
		int a=0;
		for (int i=0;i<num;i++) {
			a++;
		int c= a+i;
			 b= Integer.toString(c);
			
			 ja1.append(b); 
			 ja1.append(" - ");
			 
			 System.out.println(b);
		}
	}
	public void elegir() {
		caja.addItem("impares");
		caja.addItem("calcular 5 calificaciones");
		caja.addItem("calcular N calificaciones");
		caja.addItem("validar año");
		caja.addItem("factorial");
	}
	public void calcularCalificaciones() {
		int calificaciones[]= new int[4];
			//calificaciones[0]=
	}
	public void cambiarInterfaz() {
		if(caja.getSelectedItem()=="impares") {
			this.btm1.setVisible(true);
			this.agregar.setVisible(false);
		}
		if (caja.getSelectedItem()=="calcular 5 calificaciones") {
			this.agregar.setVisible(true);
			this.btm1.setVisible(false);
			
			
		}
		if (caja.getSelectedItem()=="calcular N calificaciones") {
			
		}
		if (caja.getSelectedItem()=="validar año") {
			
		}
		if (caja.getSelectedItem()=="factorial") {
	
}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (caja.getSelectedItem()=="calcular 5 calificaciones") {
			cambiarInterfaz();
		}
		if (caja.getSelectedItem()=="impares") {
			cambiarInterfaz();
		}
		 String numeros=mitex.getText();
		 System.out.println( numeros.length());
		 int entero = Integer.parseInt(numeros);
		 System.out.println(mitex.getDocument());		 
		 if(e.getSource()==btm1) {
			 //System.out.println( c.length());
			 if(entero>0) {
				 comprobar=true;
			 }
			 if(comprobar) {
				 impares(entero);
				 mil.setForeground(Color.BLACK);
				 mil.setText("calcularas "+entero+ " numeros impares");
				
			 }
			 else {
				 mil.setForeground(Color.RED);
				 mil.setText("Escribe una cantidad");
			 }
		
			 
		 }
		  if (e.getSource()==btm2) {
			ja1.setText(" ");
			mitex.setText("0");
		 }
		  
	}
}