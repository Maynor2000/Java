package GUI;

import java.awt.BorderLayout;

import javax.swing.*;

public class cajas {

	public static void main(String[] args) {
		framecajas cajaB = new framecajas();

	}

}
class framecajas extends JFrame{
	public framecajas() {
		
		setSize(200,200);
		JLabel nombre = new JLabel("nombre");
		JTextField texto = new JTextField(10);
		texto.setMaximumSize(texto.getPreferredSize());
		Box caja1= Box.createHorizontalBox();
		caja1.add(nombre);
		caja1.add(Box.createHorizontalStrut(10));
		caja1.add(texto);
		JLabel contrasena = new JLabel("contraseña");
		JPasswordField contra = new JPasswordField(10);
		contra.setMaximumSize(contra.getPreferredSize());
		Box caja2 = Box.createHorizontalBox();
		caja2.add(contrasena);
		caja2.add(Box.createHorizontalStrut(10));
		caja2.add(contra);
		
		JButton b1 = new JButton("continuar");
		JButton b2 = new JButton("cancelar");
		
		Box caja3 = Box.createHorizontalBox();
		caja3.add(b1);
		caja3.add(Box.createGlue());
		caja3.add(b2);
		Box caja4 = Box.createVerticalBox();
		caja4.add(caja1);
		caja4.add(caja2);
		caja4.add(caja3);
		add(caja4,BorderLayout.CENTER);
		setVisible(true);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
