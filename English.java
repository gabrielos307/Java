public class English extends Ciudadano{
	public English(){
		nacionalidad = "English";
	}
	@Override
	public void saludar(){
		super.saludar();
		System.out.prinln("Hello world"),
	}
}
