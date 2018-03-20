public class Empleado{
	String nombre;
	int numEmpleado;
	protected int sueldo;

	static private int contador = 0;
	
	public Empleado(String nombre, int sueldo){
		this.nombre= nombre;
		this.sueldo = sueldo;
		numEmpleado = ++contador;
	}

	public void aumentarSueldo(int aumento){
	sueldo += (int)(sueldo * aumento / 100);	
	}

	public String toString(){
		return "Num. empleado " + numEmpleado + "\nNombre: "+nombre + 			"\nSueldo: "+sueldo;
	}
	
	
}
