package GUI;
import javax.swing.*;
public class creandoMarco {

	public static void main(String[] args) {
		miMarco marco = new miMarco();
		
	}

}
class miMarco extends JFrame{
	public miMarco() {
		setSize(1024,720);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0,0);
		setTitle("mi ventana");
	}
}
