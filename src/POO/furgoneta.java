package POO;

public class furgoneta extends coche {

private int capacidad_carga;
private int plazas_extras;

public furgoneta(int capacidad_carga,int plazas_extras) {
	super();
	this.capacidad_carga = capacidad_carga;
	this.plazas_extras = plazas_extras;

}
public String Dame_capacidad_carga() {
	return "capacidad de carga "+capacidad_carga;
}

}
