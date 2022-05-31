/**
 * Classe Calculadora.java
 * Classe que ens permetra fer calculs senzills aritmetics
 * En aquesta classe podrem fer cuatre tipus de operacions, les quals son la suma, la resta, la multiplicació, y la divisio,
 * cadascuna d'aquestes operacions estan definides en diferents metodes, els cuals tenen el proposit de cada operacio.
 * @author Rubén Seller Sanjuan
 * @version 2.5
 * @since 1.5 juny 2015
 */

package ed.ruben;

public class Calculadora {
	
	/**
	 * Aquest metode que ve a continuació el que fa es la simple operacio matematica de la suma a partir de dos nombres
	 * que es pasen com parametre
	 * @param a: es un dels valors de la suma el qual es un nombre enter
	 * @param b: es un dels valors de la suma el qual es un nombre enter
	 * @return retorna la suma de a i b com a nombre enter
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Aquest metode que ve a continuació el que fa es la simple operacio matematica de la resta a partir de dos nombres
	 * que es pasen com parametre
	 * @param a: es un dels valors de la resta el qual es un nombre enter
	 * @param b: es un dels valors de la resta el qual es un nombre enter
	 * @return retorna la resta de a i b com a nombre enter
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Aquest metode que ve a continuació el que fa es la simple operacio matematica de la multiplicació a partir de dos nombres
	 * que es pasen com parametre
	 * @param a: es un dels valors de la multiplicació el qual es un nombre enter
	 * @param b: es un dels valors de la multiplicació el qual es un nombre enter
	 * @return retorna el resultat de la multiplicació de a i b com a nombre enter
	 */
	public int multiplica(int a, int b) {
		return a * b;
	}
	
	/**
	 * Aquest metode que ve a continuació el que fa es la simple operacio matematica de la divisió a partir de dos nombres
	 * que es pasen com parametre
	 * @param a: es un dels valors de la divisió el qual es un nombre enter
	 * @param b: es un dels valors de la divisió el qual es un nombre enter
	 * @return retorna el resultat de la divisió de a i b com a nombre enter
	 * Si intentem dividir un nombre entre 0 ens eixira una ArithmeticException, la cual ens indicará que aquesta operacio
	 * no es pot realitzar
	 */
	public int divideix(int a, int b) {
		return a / b;
	}
	
	/**
	 * Aquest metode el que fa es multiplicar la variable total per la variable multiplicador tantes vegades com siga la variable maxContador
	 * degut a que aquesta actua com a tope per a la variable contador, cada vegada que açó pasa, la variable total incrementa un poc mes, o
	 * no, depenent de si el multiplicador es un 0 o 1 o si es un nombre mes alt que aquestos.
	 * @param multiplicador: Aquest parametre es el que fa que el total incremente, degut a que el total es multiplica en bucle per aquesta
	 * variable
	 * @param maxContador: Aquesta variable es la que fa referencia a fins aón arribara a contar la variable contador, y per tant cuant parara
	 * d'incrementarse la variable total
	 * @return retorna la variable total, la cual ja haura segut incrementada fins al final del bucle y tindra un valor gran o no tan gran,
	 * depenent dels parametres pasats
	 */
	public int multiplicarRepetidament(int multiplicador, int maxContador) {
		int total = 1;
		
		for(int contador = 0; contador < maxContador; contador++) {
			total = total * multiplicador;
		}
		
		return total;
	}
	
	/**
	 * Aquest metode simplement el que fa es indicar si un numero pasat com a parametre es parell o imparell, si es parell, resultat será igual a true,
	 * si no, tot el contrari
	 * @param numero: Aquest parametre es el numero que es pasará per a comprobar la seua paritat
	 * @return retorna la variable resultat, la qual emagatzema un boolean, y aquest será true o false depenent si el numero es parell o imparell
	 */
	public boolean comprobarParitat(int numero) {
		boolean resultat;
		
		if (numero % 2 == 0) {
			resultat = true;
		
		} else {
			resultat = false;
		}
		
		return resultat;
	}
	
	/**
	 * Aquest metode pasa un numero pasat com parametre a binari, depenent de lo llarg que aquest siga, tindrá mes digits o menos.
	 * @param numero: Aquest es el parametre el cual será el numero que voldrem pasar a binari, es a dir, si posem 5, el resultat haura de ser 101
	 * @return retorna la variable resultat, la qual es un String que tindra com a contingut una cadena que sera el numero pasat anteriorment en decimal
	 * com a binari
	 */
	public String pasarNumerosABinari(int numero) {
		String resultat = "";
		
		int valor = numero;
		int valor1;
		
		while(valor > 0) {
			valor1 = valor % 2;
			resultat = valor1 + resultat;
			valor = valor / 2;
		}
		
		return resultat;
	}
}
