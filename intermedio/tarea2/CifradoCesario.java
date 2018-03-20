import java.io.File;

public class CifradoCesario{
	public static void(String[] args){
		Cesario obj = new Cifrado(iMayus, iMinus);
		File f = new File("miarchivo.txt");
		String iMayus = "ABCDEFGHIJKLMNñOPQRSTUWXYZ";
		String iMinus = "abcdefghijklmnñopqrstuwxyx";
		if(!f.exists()){
			try{
				f.createNewFile();
			}catch(IOException ex){}	
			System.out.println(obj.cifrar("./miarchivo.txt");
			System.out.println(obj.descifrar("./miarchivo.txt");
		}
	}

}	
