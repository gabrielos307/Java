public class TestAlumno{
	public static void main(String[] args){
		Alumno a1 = new Alumno("Gabriel", 19);
		Alumno a2 = new Alumno("Paco", 22);
		Alumno a3 = new Alumno("Pedro", 20);
		System.out.println("Se han inscrito: "+ Alumno.getContador());
	}
}
