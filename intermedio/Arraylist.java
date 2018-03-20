import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList{
	public static void main(String[] args){
		ArrayList<Person> agenda = new ArrayList<Person>();
		
	Person persona1 = new Person(0, "Paco el chato", 20);
        Person persona2 = new Person(0, "Berewell", 20);
	Person persona3 = new Person(1, "Pedro de la Mar", 20);
        Person persona4 = new Person(2, "Irish", 20);
        Person persona5 = new Person(2, "Torvip", 20);

	agenda.add(persona1);
        agenda.add(persona2);
        agenda.add(persona3);
        agenda.add(persona4);
        agenda.add(persona5);

	Iterator iterador = agenda.iterator();

	while(iterador.hasNext()){
		Person p = (Person)iterator.next();
		System.out.println(p.nombre);
	}
	System.out.println();
	System.out.println("Persona3 esta en la posicion: "+agenda.indexOf(persona3));
	System.out.println("El nombre de la persona es: "+agenda.get(3).nombre);
}
