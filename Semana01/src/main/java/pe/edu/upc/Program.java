package pe.edu.upc;

public class Program {

	public static void main(String[] args) {

		Student student = new Student(); // creas un objeto

		student.setFirstName("Carlos Ramos Rojas"); // invocación a los metodos y escribir el nombre
		student.setId(1L);

		System.out.println(student); //imprime todo lo que invocamos student
		//System.out.println(student.getFirstName()); // imprimir el valor del nombre en pantalla
		
		
	}

}
