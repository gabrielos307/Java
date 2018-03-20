public class Trabajador{
	private int salario = 0;
	
	public void setSalario (int salario){
		if (salario>0)
			this.salario = salario;
		else
			System.out.println("Error, invalido");
	}
	
	public int getSalario(){
		return salario;
	} 
}
