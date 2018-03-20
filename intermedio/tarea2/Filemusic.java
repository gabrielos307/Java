import java.util.io.*;
import java.util.File;
import java.util.Scanner;

public class Filemusic{
	public static void main(String[] args, String path){
		String cancion;
		String destino;
		Scanner leer = new Scanner(System.in);		
		System.out.println("Nombre de la cancion: ");
		cancion = leer.nextLine;
		FileInputStream copy = new FileInputStream("./home/Música"+cancion);
	
		if(!copy.exist()){
			System.out.println("Se copió la canción");
			System.out.println("A que carpeta lo deseas copiar");
			destino = leer.nextLine;
			FileInputStream target = new FileInputStream("./home"+detino);
			Files.move(copy, target, StandardCopyOption.REPLACE_EXISTING);
		}else{
			System.out.println("La canción no existe :V");
		}
	}
}		

