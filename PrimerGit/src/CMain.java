//Jesus Otero Jara



import java.util.Scanner;

public class CMain {
	static char[] letras = new char[65536];
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		System.out.println("Deme la frase a calcular: ");
		frase= teclado.nextLine();
		int contadorCaracteres= contarCaracteresTotal(frase);
		int contadorPalabras = contarNumeroPalabras(frase);
		int[] letraMasRepe = new int [65536];
		letraMasRepe = contarTodosCaracteres(frase);
		System.out.println(textoCaracteresTotal(contadorCaracteres));
		System.out.println(textoNumeroPalabras(contadorPalabras));
		System.out.println(textoTodosCaracteres(letraMasRepe));
	}
	
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

	static String textoCaracteresTotal(int total) {
		return "El numero de caracteres total es: "+total+"\n";
	}
		
	static String textoNumeroPalabras(int total) {
		return "El numero de palabras total es: "+total+"\n";
	}
	
	static String textoTodosCaracteres(int[] array) {
		String resultado ="";
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0)
			resultado+="La letra: "+(char)i+" se repite :"+array[i]+" veces\n";
		}
	return resultado;
				
	}
	
		
		
	
} 

