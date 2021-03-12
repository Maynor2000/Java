package GUI;
import javax.swing.*;
import java.awt.event.*;
public class eventoRaton {

	public static void main(String[] args) {
		ventanaRaton vr = new ventanaRaton();

	}

}
class ventanaRaton extends JFrame{
	
	public ventanaRaton() {
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		laminaRaton lr = new laminaRaton();
		add(lr);
		addMouseListener(lr);
	}
	
}
class laminaRaton extends JPanel implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getModifiersEx());//detecta el boton pulsdado //observar
		//System.out.println(e.getClickCount());//devuelve las veces que se pilso el boton
		//System.out.println(e.getButton());//devuelve el boton pulsado
		//System.out.println(e.getX()+" "+e.getY());//debuelve las cordenadas donde se clikeo
		//System.out.println(e.getX()+" "+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}