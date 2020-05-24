
/**
 * 
 * @author Jesus Otero
 *
 */
public class CContar {
	/**
	 * array de todos los caracteres existentes
	 */
	static char[] letras = new char[65536];
	// cuenta todos los caracteres que hay en la cadena 
	static int contarCaracteresTotal(String cadena) {
		int contador=0;
		for(int i =0;i<cadena.length();i++) {
			if(cadena.charAt(i) != ' ') 
				contador++;
		
	}
		return contador;	
	}
	// cuenta el numero de palabras que tiene la cadena proporcionada
	static int contarNumeroPalabras(String cadena) {
		int contador=1;
		for(int i =0;i<cadena.length();i++) {
			if(cadena.charAt(i) == ' ')
				contador++;
		}
		return contador;
	}
	
	//cuenta la repeticion de los caracteres y los envia en forma de array
	static int[] contarTodosCaracteres(String cadena) {
		int contador[];
		contador = new int[65536];
		for (int i = 0;i<cadena.length();i++){ 
			char car = cadena.charAt(i); 
			int ascii = car;
			contador[ascii]++; 
			letras[ascii] = car;

			}
		
		return contador;
		}
}
