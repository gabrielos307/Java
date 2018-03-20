public class Ejecutivo extends Empleado{
	int presupuesto;
	//Llamada explicita al contructor de la clase
	public Ejecutivo(String n, int s){
		super(n,s);
	}
	
	public void asignarPresupuesto(int p){
		presupuesto = p;
	}

	public String toString(){
		String s = super.toString();
		s = s + "\nPresupuesto: "+presupuesto;
		return s;	
	}
}
