
public class CContar {
	static char[] letras = new char[65536];
	
	static int contarCaracteresTotal(String cadena) {
		int contador=0;
		for(int i =0;i<cadena.length();i++) {
			if(cadena.charAt(i) != ' ') 
				contador++;
		
	}
		return contador;	
	}
	
	static int contarNumeroPalabras(String cadena) {
		int contador=1;
		for(int i =0;i<cadena.length();i++) {
			if(cadena.charAt(i) == ' ')
				contador++;
		}
		return contador;
	}
	
	
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
