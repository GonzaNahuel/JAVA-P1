package ungs;

import java.util.Arrays;
import java.util.Iterator;

public class Comision {

	String materia;
	int numero;
	Docente[] docentes;
	Estudiante[] inscriptos;
	int[] calificaciones;
	
	public Comision(String materia, int numero, Docente[] docentes,
			Estudiante[] inscriptos, int[] calificaciones) {
		this.materia = materia;
		this.numero = numero;
		this.docentes = docentes;
		this.inscriptos = inscriptos;
		this.calificaciones = calificaciones;
	}
	
	public String getMateria() {
		return materia;
	}

	public int getNumero() {
		return numero;
	}

	public Docente[] getDocentes() {
		return docentes;
	}

	public Estudiante[] getInscriptos() {
		return inscriptos;
	}

	public int[] getCalificaciones() {
		return calificaciones;
	}

	@Override
	public String toString() {
		String aux = "Materia=" + materia+ "\n";
		aux += "numero=" + numero+"\n";
		aux += "docentes: ";
		for (Docente d : this.docentes) {
			if(d != null)
				aux += d + " ";
		}
		aux +="\n inscriptos: \n";
		
		for (int i = 0; i < this.inscriptos.length; i++) {
			aux += this.inscriptos[i] + ", Calificación: " + this.calificaciones[i] +"\n";
		}
		return  aux;
	}
	
	
}
