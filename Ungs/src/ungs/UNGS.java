package ungs;

public class UNGS {

	Comision[] comisiones;

	public UNGS() {
		this.comisiones = new Comision[4];
	}
	

	
	public Comision[] getComisiones() {
		return comisiones;
	}

	public void agregarComisiones(Comision c) {
		for (int i = 0; i < this.comisiones.length; i++) {
			if (this.comisiones[i] == null) {
				this.comisiones[i] = c;
				return;
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < comisiones.length; i++) {
			if (this.comisiones[i] != null)
				System.out.println(this.comisiones[i]);
		}

	}
	
	boolean cursaCon(Estudiante e, Docente d) {
		for (Comision com:comisiones) {
			if (com.estaDocente(d) && com.estaEstudiante(e)) {
				return true;
			}
		}
		return false;
	}

}
