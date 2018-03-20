public class Alumno{
	private String nombre;
	private int edad;
	private static int contador = 0;

	public Alumno(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	public void setEdad (int anios){
		if(anios>0)
			this.edad = anios;
		else
			System.out.println("Error");
	}


	public String setNombre (){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}
	
	public int getEdad(){
		return edad;
	}

	public static int getContador(){
		return contador;
	}
}
