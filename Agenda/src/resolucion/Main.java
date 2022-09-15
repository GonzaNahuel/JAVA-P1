package resolucion;

public class Main {

	
	public static void main(String[] args) 
	{
		Agenda agenda = new Agenda(3);
		Persona p1 = new Persona("Juancito",23,12345678);
		Persona p2 = new Persona("Maria",25,12345656);
		Persona p3 = new Persona("Josè",25,3434342);
		
		agenda.guardar(p1, "123454567");
		agenda.guardar(p2, "1223343534");
		agenda.guardar(p3, "02320-343534");
		agenda.guardar(new Persona("Pepe",25,5600000), "02320-555000");
		p1.setNombre("Juan");
		agenda.imprimir();
	}

}
