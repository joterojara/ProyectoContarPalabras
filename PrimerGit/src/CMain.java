//Jesus Otero Jara



import java.util.Scanner;

public class CMain {
	static CContar contar;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		System.out.println("Deme la frase a calcular: ");
		frase= teclado.nextLine();
		int contadorCaracteres= contar.contarCaracteresTotal(frase);
		int contadorPalabras = contar.contarNumeroPalabras(frase);
		int[] letraMasRepe = new int [65536];
		letraMasRepe = contar.contarTodosCaracteres(frase);
		System.out.println(textoCaracteresTotal(contadorCaracteres));
		System.out.println(textoNumeroPalabras(contadorPalabras));
		System.out.println(textoTodosCaracteres(letraMasRepe));
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

