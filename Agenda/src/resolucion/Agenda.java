package resolucion;

public class Agenda {
    private Persona[] contactos;
    private String[] telefonos;
    
    public Agenda(int tamanio) {
    	this.contactos = new Persona[tamanio];
    	this.telefonos = new String[tamanio];
    }
    
    public void guardar(Persona contacto, String telefono) {
    	//1° verificar si hay un lugar disponible
    	int pos = posicionLibre();
    	//2° si no hay lugar disponible, agregar espacio y hacer un back up
    	if(pos == -1){
    		this.agregarEspacioYhacerBackUp();
    		pos = posicionLibre();
    	}
    	//3° agregar a la persona y su telefono
//    	this.contactos[pos] = contacto;//--> aliasing
    	this.contactos[pos] = new Persona(contacto.getNombre(),contacto.getEdad(),contacto.getDNI());
    	this.telefonos[pos] = telefono;
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

	private int posicionLibre() {
		for (int i = 0; i < this.contactos.length; i++) {
			if(this.contactos[i] == null){
				return i;
			}
		}
		return -1;
	}

	public void eliminar(Persona contacto) {
    	//buscar el contacto y dejar la posición en null, usar misma persona
		for (int i = 0; i < this.contactos.length; i++) {
			if(this.contactos[i] != null && this.contactos[i].mismaPersona(contacto)) {
				this.contactos[i] = null;
				this.telefonos[i] = null;
				return;
			}
		}
	}
    
    public boolean pertenece(Persona contacto) {
    	for (int i = 0; i < this.contactos.length; i++) {
			if(this.contactos[i] != null && this.contactos[i].mismaPersona(contacto))
				return true;
		}
    	return false;
    }
    
    public String dameTelefono(Persona contacto) {
    	if(this.pertenece(contacto)) {
    		for (int i = 0; i < contactos.length; i++) {
				if(this.contactos[i].mismaPersona(contacto)) {
					return this.telefonos[i];
				}
			}
    	}
    	throw new RuntimeException("El contacto no esta");
    }
    void imprimir(){
    	for (int i = 0; i < contactos.length; i++) {
			if(this.contactos[i] != null)
				System.out.println(contactos[i].getNombre() +" telefono: "+ telefonos[i]);
		}
    }
}
