public class Person{
	public int id;
	public String nombre;
	public int edad;

	public Person(int id; String nombre; int edad){
		this.edad = edad;
		this.nombre = nombre;
		this.id = id;
	}

	@Override
	public int hashCode(){
		final int prime = 13;
		int result = 1;{
		result = result * prime + id;
		return result;
	}
	@Override
	public boolean equals(Object obj){
		if(this.id == ((Person)obj).id){
			return true;
		}
		else
			return false;
	}
}
