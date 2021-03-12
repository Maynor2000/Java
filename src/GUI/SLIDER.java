package GUI;

import javax.swing.*;

public class SLIDER {

	public static void main(String[] args) {
		frameslider fs = new frameslider();

	}

}
class frameslider extends JFrame{
	public frameslider() {
		add(new panelslider());
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class panelslider extends JPanel{
	public panelslider() {
		JSlider js = new JSlider();
		js.setMajorTickSpacing(20);
		js.setMinorTickSpacing(10);
		js.setSnapToTicks(true);
		js.setPaintLabels(true);
		js.setPaintTicks(true);
		
		add(js);
	}
}