package GUI;


import javax.swing.*;

public class procesadortexto {

	public static void main(String[] args) {
		framesprocesador fp = new framesprocesador();
	}

}
class framesprocesador extends JFrame{
	public framesprocesador() {
		add(new panelprocesador());
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class panelprocesador extends JPanel{
	public panelprocesador() {
		JPanel areatexto = new JPanel();
		JMenuBar barra = new JMenuBar();
		
		JPanel menuP = new JPanel();
		JTextArea hoja = new JTextArea();
		menuP.add(hoja);
	}
}