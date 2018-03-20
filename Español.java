public class Español extends Ciudadano{
	public Español(){
		nacionalidad = "España";
	}
	@Override
	public void saludar(){
		super.saludar();
		System.out.prinln("Hola mundo"),
	}
}
