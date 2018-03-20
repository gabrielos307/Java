public class holamundo{
	public static void main(String args[]){
		Ciudadano [] ciuddadanos = {
			new Español(), 
			new Inglés(),
		}
		for(Ciudadano c : ciudadanos){
			c.saludar();
		}
	}
}
