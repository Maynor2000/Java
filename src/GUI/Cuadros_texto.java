package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
public class Cuadros_texto {

	public static void main(String[] args) {
		marco_texto  mt = new marco_texto ();

	}

}
class marco_texto extends JFrame{
	public marco_texto() {
		add(new panel_texto());
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
class panel_texto extends JPanel{
	public panel_texto() {
		JLabel e = new JLabel("usuario");
		add(e);
		 campo1 = new JTextField(20);
		add(campo1);
		 //campo2 = new JPasswordField(20);
		//add(campo2);
		JButton iniciar = new JButton("Entrar");
		add(iniciar);
		firma = new JLabel();
		add(firma);
		funcion n  = new funcion();
		iniciar.addActionListener(n);
		Document miDocument=campo1.getDocument();
		miDocument.addDocumentListener(new funcion());
		
		
	}
JTextField campo1;
String usuario;
int arroba;
JLabel firma;
	
class funcion implements ActionListener,DocumentListener{



	public void actionPerformed(ActionEvent e) {
		usuario=campo1.getText();
		
		evaluar();
		if(usuario.equals("maynor")) {
			System.out.println("iniciandooo");
		}else {
			System.out.println("contraseña incorrecta");
		}
		
	}
	public void evaluar() {
		for(int i=0;i<usuario.length();i++) {
			usuario.charAt(i);
		if(usuario.charAt(i)=='@') {
			arroba++;
		}

		}
		if(usuario.charAt(0)=='.') {
			firma.setText("error");
		}
		System.out.println("arroba: "+arroba);

	}
	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertUpdate(DocumentEvent arg0) {
		System.out.println("escribiste ");
		
	}
	@Override
	public void removeUpdate(DocumentEvent arg0) {
		System.out.println("borraste ");
		
	}
	
}
	
}