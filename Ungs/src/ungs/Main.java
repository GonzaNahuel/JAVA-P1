package ungs;

public class Main {

	public static void main(String[] args) {
		Docente[] docentes1 = new Docente[3];
		docentes1[0] = new Docente("Lucifer!",1234);
		docentes1[1] = new Docente("Leonardo",5454);
		docentes1[2] = new Docente("Hernan",65543);
		
		Docente[] docentes2 = new Docente[1];
		docentes2[0] = new Docente("Javier",1234);
		
		Docente[] docentes3 = new Docente[3];
		docentes3[0] = new Docente("Jaimito",1234);
		docentes3[1] = new Docente("José",5454);
		docentes3[2] = new Docente("Waldo",65543);
		
		Docente[] docentes4 = new Docente[3];
		docentes4[0] = new Docente("Profe1",1234);
		docentes4[1] = new Docente("Profe2",5454);
		docentes4[2] = new Docente("Profe3",65543);
		
		
		Comision c1 = new Comision("Programación 1",1,docentes1,estudiantes1(),calificaciones1());
		Comision c2 = new Comision("Logica y teoria de numeros",2,docentes2,estudiantes1(),calificaciones1());
		Comision c3 = new Comision("Orga 1",2,docentes3,estudiantes1(),calificaciones1());
		Comision c4 = new Comision("Psec",2,docentes4,estudiantes2(),calificaciones2());
		
		UNGS ungs = new UNGS();
		ungs.agregarComisiones(c1);
		ungs.agregarComisiones(c2);
		ungs.agregarComisiones(c3);
		ungs.agregarComisiones(c4);
		
//		ungs.imprimir();
//		System.out.println(ungs.suficientesDocentes());
//		System.out.println(ungs.cursaCon2(new Estudiante("Celso",24), new Docente("Diego",1234)));
//		ungs.elMasEstudioso();
	}
	
	static Estudiante[] estudiantes1() {
		Estudiante[] estudiantes = new Estudiante[25];
		estudiantes[0] = new Estudiante("Sabina",0);
		estudiantes[1] = new Estudiante("Honoria",1);
		estudiantes[2] = new Estudiante("Tránsito",2);
		estudiantes[3] = new Estudiante("Higinio",3);
		estudiantes[4] = new Estudiante("Ufano",4);
		estudiantes[5] = new Estudiante("Hilario",5);
		estudiantes[6] = new Estudiante("Jacinta",6);
		estudiantes[7] = new Estudiante("Cándido",7);
		estudiantes[8] = new Estudiante("Teodorcia",8);
		estudiantes[9] = new Estudiante("Cástulo",9);
		
		estudiantes[10] = new Estudiante("Gervacia",10);
		estudiantes[11] = new Estudiante("Epifanio",11);
		estudiantes[12] = new Estudiante("Gaudelia",12);
		estudiantes[13] = new Estudiante("Eufenio",13);
		estudiantes[14] = new Estudiante("Eustaquio",14);
		estudiantes[15] = new Estudiante("Brígida",15);
		estudiantes[16] = new Estudiante("Melitón",16);
		estudiantes[17] = new Estudiante("Leonila",17);
		estudiantes[18] = new Estudiante("Nicanor",18);
		estudiantes[19] = new Estudiante("Martina",19);
		
		estudiantes[20] = new Estudiante("Rébulo",20);
		estudiantes[21] = new Estudiante("Teodora",21);
		estudiantes[22] = new Estudiante("Teódulo",22);
		estudiantes[23] = new Estudiante("Tiburcio",23);
		estudiantes[24] = new Estudiante("Celso",24);
		return estudiantes;
	}
	
	static int[] calificaciones1() {
		int[] calif = new int[25];
		
		for (int i = 0; i < calif.length; i++) {
			calif[i] = 8;
		}
		calif[24] = 10;
		return calif;
	}
	
	static Estudiante[] estudiantes2() {
		Estudiante[] estudiantes = new Estudiante[60];
		
		for (int i = 0; i < estudiantes.length; i++) {
			estudiantes[i] = new Estudiante("Estudiante " + i,i);
		}
		
		estudiantes[59] = estudiantes1()[24];
		
		return estudiantes;
	}
	
	static int[] calificaciones2() {
		int[] calif = new int[60];
		
		for (int i = 0; i < calif.length; i++) {
			calif[i] = 8;
		}
		calif[59] = 10;
		return calif;
	}
	
}
