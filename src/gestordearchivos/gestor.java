package gestordearchivos;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class gestor {

	public static void main(String[] args) {
		
		    JFileChooser chooser = new JFileChooser();
		   /* FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    chooser.setFileFilter(filter);*/
		    
		    int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       System.out.println("You chose to open this file: " +
			            chooser.getSelectedFile().getName());
			       System.out.println(chooser.getDescription(chooser.getSelectedFile()));
			      
			    }
					
	
	}

}
