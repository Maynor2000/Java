package GUI;
import javax.swing.*;
public class JList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JListFrame nombreList = new JListFrame();
	}

}
class JListFrame extends JFrame{
	JListFrame(){
		setTitle("JList");
		setSize(300,300);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new JListPanel());
		setVisible(true);
	}
	
}
class JListPanel extends JPanel{
	JListPanel(){
	
	}
	public void List() {
		String[] nombres = new String[3];
		nombres[0]="maynor";
		nombres[1]="blanca";
		nombres[2]="aurora";
		
		
	}
	
}