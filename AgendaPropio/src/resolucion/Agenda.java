package resolucion;

public class Agenda {
    Persona[] contactos;
    String[] telefonos;
    
    //CONSTRUCTOR
    public Agenda(int tamanio) {
    	contactos = new Persona [tamanio];
    	telefonos = new String [tamanio];
    }
    
    public void guardar(Persona contacto, String telefono) { 
        //1ª verificar si hay un lugar disponible 
        int pos = posicionLibre(); 
        //2ª si no hay lugar disponible, agregar espacio y hacer un back up 
        if(pos == -1){ 
         this.agregarEspacioYhacerBackUp(); 
         pos = posicionLibre(); 
        } 
        //3ª agregar a la persona y su telefono 
//        this.contactos[pos] = contacto;//--> aliasing 
        this.contactos[pos] = new Persona(contacto.getNombre(),contacto.getEdad(),contacto.getDNI()); 
        this.telefonos[pos] = telefono; 
    } 
    
    private int posicionLibre() { 
    	for (int i = 0; i < this.contactos.length; i++) { 
    		if (this.contactos[i] == null) { 
    			return i;
    		} 
    	} 
    	return -1; 
    } 
    
    private void agregarEspacioYhacerBackUp() { 
    	Persona[] auxContactos = new Persona[this.contactos.length+1]; 
		String[] auxTelefonos = new String[this.telefonos.length+1]; 
		for (int i = 0; i < this.contactos.length; i++) { 
		   auxContactos[i] = this.contactos[i]; 
		   auxTelefonos[i] = this.telefonos[i]; 
		} 
		this.contactos = auxContactos; 
		this.telefonos = auxTelefonos; 
    } 
    
    
    public void eliminar(Persona contacto) {
    	//buscar el contacto y dejar la posici�n en null, usar misma persona
    	for (int i = 0; i < contactos.length; i++) {
    		if (contacto.equals(this.contactos[i])) {
    			this.contactos[i] = null;
    			this.telefonos[i] = null;
    		}
    	}
    }
    
    public boolean pertenece(Persona contacto) {
    	for (int i = 0; i < contactos.length; i++) {
    		if (this.contactos[i] == contacto) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public String dameTelefono(Persona contacto) {
    	for (int i = 0; i < contactos.length; i++) {
    		if (pertenece(contacto) == true) {
	    		return telefonos[i];
	    	}
    	}	
    	return "";
    }
    
}
/*
a) Escribir el constuctor Agenda(int tamanio) que inicializa contactos y telefonos con arreglos
del tamano dado.

b) Escribir el metodo de instancia void guardar(Persona contacto, String telefono) que guarda los
datos del contacto en la primera posicion libre que encuentre en los arreglos. Se supone que si
una posicion esta libre en un arreglo, tambien lo estara en el otro. Si no hay una posicion libre,
se deberan redimensionar los arreglos.

c) Escribir el metodo de instancia void eliminar(Persona contacto) que elimina de la agenda los
datos del contacto. Debe eliminar tanto a la persona como a su numero de telefono. Usar el
metodo mismaPersona del ejercicio 5. Si el contacto no aparece en la agenda, el metodo no hace
nada.

d) Escribir el metodo de instancia boolean pertenece(Persona contacto) que devuelve true si el
contacto esta en la Agenda o false en caso contrario.

e) Escribir el metodo de instancia String dameTelefono(Persona contacto). Usar el metodo
mismaPersona del ejercicio 5. (REQUIERE: pertenece(contacto)==true)
*/

