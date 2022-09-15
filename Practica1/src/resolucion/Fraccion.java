package resolucion;

import javax.tools.JavaCompiler;

import org.w3c.dom.css.CSSImportRule;

public class Fraccion {
    int numerador;
    int denominador;
    
    Fraccion(int numerador, int denominador) {
    	this.setNumerador(numerador);
    	this.setDenominador(denominador);
    }
    void setNumerador(int numerador) {
    	if (numerador == 0) {
    		throw new RuntimeException("El numerador no puede ser 0");
    	}
    	this.numerador = numerador;
    }
    
    void setDenominador(int denominador) {
    	if (denominador == 0) {
    		throw new RuntimeException("El denominador no puede ser 0");
    	}
    	this.denominador = denominador;
    }
    void imprimir() {
    	System.out.print(numerador + "/" + denominador);
    }
    void invertirSigno() {
    	if (numerador < 0) {
    		numerador = numerador * (-1);
    	}
    	else if (numerador > 0) {
    		numerador = numerador * (-1);
    	}
    	
    	if (denominador < 0) {
    		denominador = denominador * (-1);
    	}
    	else if (denominador > 0) {
    		denominador = denominador * (-1);
    	}
    }
    void invertir() {
    	int auxDenominador = denominador;
    	int auxNumerador = numerador;
    	numerador = auxDenominador;
    	denominador = auxNumerador;
    }
    
    double aDouble() {
    	double numer = numerador;
    	double denomin = denominador;
    	return numer/denomin;
    }
    
    void reducir() {
    	int mcd = maximoComunDivisorRecursivo(numerador, denominador);
    	numerador = numerador / mcd;
    	denominador = denominador / mcd;
    }
    
    static int maximoComunDivisorRecursivo(int a, int b) {
        if (b == 0) return a;
        return maximoComunDivisorRecursivo(b, a % b);
    }
    
    static Fraccion producto(Fraccion q1, Fraccion q2) {
    	
    }
}

/*
a) Escribir el constructor Fraccion(int numerador, int denominador).

b) Escribir el metodo de instancia void imprimir() que imprime en pantalla la fraccion en algun
formato comodo. Crear en un main una Fraccion e imprimirla con este metodo.

c) Escribir el metodo de instancia void invertirSigno() que invierte el signo del numero: si era
negativo pasa a ser positivo y viceversa.

d) Escribir el metodo de instancia void invertir() que invierte el numerador y el denominador de
la fraccion. Ej. invertir(1/2) = 2/1.

e) Escribir el metodo de instancia double aDouble() que convierte el numero racional en un double
(numero de punto flotante) y devuelve el resultado.

f) Escribir el metodo de instancia void reducir() que reduce el numero racional a sus terminos mas
chicos. Para esto buscar el MCD del numerador y el denominador y luego dividir numerador y
denominador por su MCD. Usar la funcion ya programada de la practica anterior.

g) Escribir el metodo de clase static Fraccion producto(Fraccion q1, Fraccion q2) que calcula el
producto entre dos fracciones en nuevo objeto Fraccion. Este debe estar reducido a su mınima expresion, 
de modo que el numerador y el denominador no tengan un divisor comun mayor a 1.
¿Por que en este caso hace falta la palabra clave static?

h) Escribir el metodo de clase static Fraccion suma(Fraccion q1, Fraccion q2) que calcula la suma
de dos fracciones en un nuevo objeto Fraccion. Este debe debe estar reducido a su mınima expresion.
*/