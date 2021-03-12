package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class checbox {

	public static void main(String[] args) {
		frame fr = new frame();

	}

}
class frame extends JFrame{
	public frame() {
		
		setSize(500,300);
		add(new panel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class panel extends JPanel{
	public panel(){
		milabel = new JLabel("maynor alvarez acopa");
		ButtonGroup btng =  new ButtonGroup();
		JRadioButton miradio = new JRadioButton();
		add(miradio);
		JRadioButton miradio1 = new JRadioButton();
		add(miradio1);
		
		check1=new JCheckBox("color rojo");
		check2=new JCheckBox("bold");
		add(milabel);
		btng.add(miradio1);
		btng.add(miradio);
		milabel.setFont(new Font("Arial",Font.ITALIC,24));
		check1.addActionListener(new funcion());
	}
	JLabel milabel;
	JCheckBox check1,check2;
class funcion implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==check1) {
			
			boolean selec = check1.isSelected();
			if(selec) {
				milabel.setForeground(Color.red);
				milabel.setFont(new Font("Arial",Font.BOLD,24));
			}else {
				//check1.setSelected(false);
				milabel.setForeground(Color.black);
				milabel.setFont(new Font("Arial",Font.ITALIC,24));
			}
		}
		if(e.getSource()==check2) {
			
		}
		
	}
	
}
}