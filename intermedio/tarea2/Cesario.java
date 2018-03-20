import java.util.io.*;
import java.util.File;
import java.util.Scanner;

public class Cesario{
	private String iMayus;
	private String iMinus;
	public Cesario(String iMayus, String iMinus){
		this.iMayus = iMayus;
		this.iMenus = iMinus;		
	}
	public String cifrar(String texto, int desplazamiento){
		String salida = "";
		for (int i = 0; i < texto.length(); i++){{
			if (this.iMayus.indexOf(texto.charAt(i)) != -1 || (this.iMinus.index(texto.charAt(i)) != -1);
				salida += (this.iMayus.index(texto.charAt(i)) != -1) ? this.iMayus.charAt(this.iMayus.indexOf(texto.charAt(i)) + desplazamiento)%this.iMayus.length()) : this.iMinus.charAt(this.iMinus.indexOf(texto.charAt(i)) + desplazamiento)%this.iMinus.length())
			}else{
				texto += text.charAt(i);
			}
	}
	public String descifrar(String texto, int desplazamiento){
		String salida = "";
		for (int i = 0; i < texto.length(); i++){{
			if (this.iMayus.indexOf(texto.charAt(i)) != -1 || (this.iMinus.index(texto.charAt(i)) != -1){
				if(this.iMayus.indexOf(texto.charAt(i)) - desplazamiento != -1)){
					if(this.iMayus.charAt(i) < 0){
						salida += this.iMayus.charAt(this.iMayus.length())+((this.iMayus.indexOf(texto.charAt(i))) - desplazamiento));
					}else{
						salida += this.iMayus.charAt((this.iMayus.indexOf(texto.charAt(i))) - desplazamiento) % (this.iMayus.length());
					}
				}else{
					if(this.iMinus.charAt(i) < 0){
						salida += this.iMinus.charAt(this.iMinus.length())+((this.iMinus.indexOf(texto.charAt(i))) - desplazamiento));
					}else{
						salida += this.iMinus.charAt((this.iMinus.indexOf(texto.charAt(i))) - desplazamiento) % (this.iMinus.length());
					}
				}
			}else{
				salida += text.charAt(i);
			}
		}
	}
	return salida;
}

		
}
