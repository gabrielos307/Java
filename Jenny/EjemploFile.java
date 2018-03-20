import java.io.File;
import java.util.Date;

public class EjemploFile{
	public EjemploFile(String path){
		File f = new File(path);
		if(f.exists()){
			System.out.println("\nNombre de archivo: "+f.getName());
                        System.out.println("Tamaño: "+f.length());
                        System.out.println("Ruta absoluta: "+f.getAbsolutePath());
                        System.out.println("Puede leerse: "+f.canRead());
                        System.out.println("Es archivo: "+f.isFile());
                        System.out.println("Modificado por ultima vez: "+ new Date(f.lastModified()));
                        System.out.println("Es directorio: "+f.isDirectory());
			if(f.isDirectory()){
				System.out.println("\nContenido en la carpeta": ");
				System.out.println("-.-.-.-.-.-.-.-.");
				String[] contenido = f.list();
				for(String archivo: contenido){
					System.out.println("-->"+archivo);
				}
			}
			else{
				System.out.println("El archivo no existe");
			}

	}
}
