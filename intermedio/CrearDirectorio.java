import java.io.*;
public class CrearDirectorio{
	public static void main(String[] args){
		File file = new File("./directorio");
		if(!file.exist())
			if(file.mkdir())
				System.out.println("Directorio: "+file.getName()+"creado");
			else
				System.out.println("No se pudo crear el directorio" +file.getName());
		}
		File file2 = new File("./directorio2/subdir/sudir-subdir");
		if(file2.mkdirs()){
			System.out.println("Directorios creados");
		}
		File archivo = new File("./directorio/archivoNuevo.txt");
		if(archivo.createNewFile()){
			System.out.println(Se ha creado el archivo "+archivo.getName());
			System.out.println("Tamaño del archivo: "+archivo.lenth() + "bytes");
		}
	}
}
