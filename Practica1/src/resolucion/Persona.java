package resolucion;

import java.util.Objects;

public class Persona {
	
    private String nombre;
    private int edad;
    public int DNI;
    
    public Persona(String nombre, int edad){
    	this.setNombre(nombre);
    	this.setEdad(edad);
    }
    
    public Persona(String nombre, int edad, int DNI){
    	this.setNombre(nombre);
    	this.setEdad(edad);
    }
    
    public boolean masJovenQue(Persona otro) {
    	return this.edad < otro.edad;
    }
    
    public boolean tocayo(Persona otro) {
    	return this.nombre.equalsIgnoreCase(otro.nombre);
    }

	public String getNombre() {
		return nombre;
	}
	
	public boolean mismaPersona(Persona otro) {
		return this.DNI == otro.DNI;
	}

	public void setNombre(String nombre) {
		if(nombre == null) {
			throw new RuntimeException("El nombre no puede ser Null: " + nombre);
		}
		if(nombre.length() < 3) {
			throw new RuntimeException("El nombre no puede tener menos de 3 caracteres: " + nombre );
		}
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad < 0) {
			throw new RuntimeException("El nombre no puede ser negativa: " + edad );
		}
		this.edad = edad;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int DNI) {
		if(DNI < 1000000 || DNI > 99999999) {
			throw new RuntimeException("El DNI no es valido: " + DNI );
		}
		this.DNI = DNI;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return DNI == other.DNI && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
    
    
    
}

