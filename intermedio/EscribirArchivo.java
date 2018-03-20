import java.io.*;
import java.util.Scanner;

public class EscribirArchivo{
	public static void main(String[] args){
		try{
			File archivo = new File("miarchivo.txt");
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			Scanner sc = new Scanner(System.in);
			String cadena;

			do{
				cadena = sc.nextLine();
				bw.write(cadena);
				bw.newLine();
			}while(!cadena.equals("adios"));
			bw.close();
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}
}
