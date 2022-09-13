package ungs;

public class Estudiante {

	String nombre;
	int legajo;
	
	
	
	public Estudiante() {
	}



	public Estudiante(String nombre, int legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + legajo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (legajo != other.legajo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Nombre: " + this.nombre + ", Legajo: " + this.legajo ;
	}
	
}
