package proyectoPabloLadronOrdoyo;

public class PabloLadronCine {

	//Atributos
	public String nombreHobby;
	public String nombreDirector;
	public String nombreCompositor;
	
	//Constructor
	public PabloLadronCine(String nombreHobby, String nombreDirector, String nombreCompositor) {
		super();
		this.nombreHobby = nombreHobby;
		this.nombreDirector = nombreDirector;
		this.nombreCompositor = nombreCompositor;
	}

	public String getNombreHobby() {
		return nombreHobby;
	}
	
	public void setNombreHobby(String nombreHobby) {
		this.nombreHobby = nombreHobby;
	}
	
	public String getNombreDirector() {
		return nombreDirector;
	}
	
	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}
	
	public String getNombreCompositor() {
		return nombreCompositor;
	}
}
