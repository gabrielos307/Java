public class Hola{
	public static void main(String args[]){
		Saludar pepe = new Saludar("Pepe");
		Saludar sara = new Saludar("Sara");
		
		pepe.saludar();
		sara.saludar();
		
		new java.util.Scanner(System.in).nextLine();
		//System.in.read();
	}
}
