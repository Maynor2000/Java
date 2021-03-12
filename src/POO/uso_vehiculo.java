package POO;

import javax.swing.JOptionPane;

public class uso_vehiculo {

	public static void main(String[] args) {
		/*coche renault=new coche();
		renault.cambia_color(JOptionPane.showInputDialog(null,"color del carro"));
		System.out.println(renault.dame_largo());
		System.out.println(renault.dame_color());
		System.out.println(renault.Dime_datos_generales());*/
		
		/*furgoneta[] furgo = new furgoneta[3];
		furgo[0]= new furgoneta(6,2);
		furgo[1]= new furgoneta(12,2);
		furgo[2]= new furgoneta(8,2);
		for(furgoneta e: furgo) {
			System.out.println(e.Dime_datos_generales()+" "+e.Dame_capacidad_carga());
			System.out.println();
		}*/
		coche micoche1 = new coche();
		micoche1.cambia_color("rojo");
		furgoneta mifurgoneta1 = new furgoneta(580,7);
		mifurgoneta1.cambia_color("azul");
		
		System.out.println(micoche1.Dime_datos_generales()+"\ncolor "+micoche1.dame_color());
		System.out.println();
		System.out.println(mifurgoneta1.Dime_datos_generales()+"\n"
				+ mifurgoneta1.Dame_capacidad_carga()+"\ncolor: "+mifurgoneta1.dame_color());
		
	}

}
