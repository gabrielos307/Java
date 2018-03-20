public class Persona{
	private String nombre;
	private String sexo;
	private int edad;

	public void caminar(){
		System.out.println("caminando");
	}
//Getter
public String getNombre(){
        return nombre;
}
//Setter
public void setNombre(String nombreP){
        nombre = nombreP;
}

//Sobrecarga de metodo
public void caminar(String nombre){
	System.out.printf("Soy %s y voy caminando", nombre);
}

public Persona(){

}
public Persona(String nombre, int edad, String sexo){
	this.nombre = nombre;
	this.edad = edad;
	this.sexo = sexo;
	caminar();
}
}





