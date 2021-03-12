package GUI;

import javax.swing.*;

public class muelles {

	public static void main(String[] args) {
		framemuelle mu = new framemuelle();

	}

}
class framemuelle extends JFrame{
	public framemuelle() {
		add(new panelmuelle());
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class panelmuelle extends JPanel{
	public panelmuelle() {
		JButton bt1 = new JButton("boton1");
		JButton bt2 = new JButton("boton2");
		JButton bt3 = new JButton("boton3");
		SpringLayout milayout = new SpringLayout();
		setLayout(milayout);
		add(bt1);
		add(bt2);
		add(bt3);
		Spring muelle2 = Spring.constant(0, 10, 100);
		Spring muelle_fijo = Spring.constant(20);
		milayout.putConstraint(SpringLayout.WEST,bt1, muelle2, SpringLayout.WEST, this);
		milayout.putConstraint(SpringLayout.WEST,bt2, muelle_fijo, SpringLayout.EAST, bt1);
		milayout.putConstraint(SpringLayout.WEST,bt3, muelle_fijo, SpringLayout.EAST, bt2);
		milayout.putConstraint(SpringLayout.EAST,this, muelle2, SpringLayout.EAST, bt3);


	}
}