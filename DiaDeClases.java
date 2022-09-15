package trabajoPractico;

public class DiaDeClases {
	int grado;
	char div;
	String dia;
	String[] materias;
	boolean horaExtra;


	//getters:
	public int getGrado() {
		return this.grado;
	}
	
	public char getDiv() {
		return this.div;
	}
	
	public String getDia() {
		return this.dia;
	}
	
	public String [] getMaterias() {
		return this.materias;
	}
	
	//setters:
	public void setGrado(int gr) {
		if (gr <= 0 || gr > 6) {
			throw new RuntimeException("el grado: " + gr + " no es valido");
		}
		this.grado = gr;
	}
	
	public void setDiv(char d) {
		if (d != 'A' || d != 'B' || d != 'C' || d != 'D') { 
			throw new RuntimeException("La division: " + d + " no es valida");
		}
		this.div = d;
	}
	
	public void setDia (String day) {
		if (!day.equals("Lunes") || !day.equals("Martes") || !day.equals("Miercoles") || !day.equals("Jueves") || !day.equals("Viernes") ) {
			throw new RuntimeException("El dia: " + day + " no es valido");
		}
		this.dia = day;
	}
	
	public void setMaterias(String [] m) {
		for (String mat:materias) {
			if (!mat.equals("Lengua") || !mat.equals("Matematica") || !mat.equals("Cs Sociales") || !mat.equals("Cs Naturales") || !mat.equals("Educacion Fisica") || !mat.equals("Arte") || !mat.equals("Otros")){
				throw new RuntimeException("La materia: " + mat + " no es valida");
			}
		}
		this.materias = m;
	}
	
	//variables de instancia:
	void horaExtra() {
		if (materias.length < 6 && materias.length >0) {
			horaExtra = false;
		}	
		else if (materias.length == 6) {
			horaExtra = true;
		}
	}
}

/*
1. La clase DiaDeClases modela un d´ıa de clases un grado de una escuela primaria. Cada d´ıa de la
semana hay 5 horas-c´atedra en las que se dictan las materias Lengua, Matem´atica, Cs Sociales, Cs
Naturales, Educaci´on F´ısica, Artes, y otros. Cuando hora extra es true ese d´ıa hay 6 horas c´atedra.
Tener en cuenta que los d´ıas de clases son de lunes a viernes y que consideramos que en cada grado
hay 4 divisiones: A, B, C o D.
*/	 
