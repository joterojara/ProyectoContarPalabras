


import java.util.Scanner;
/**
 * 
 * @author Jesus Otero
 *
 */
public class CMain {
	static CContar contar;
	static CMostrar mostrar;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		System.out.println("Deme la frase a calcular: ");
		frase= teclado.nextLine();
		int contadorCaracteres= contar.contarCaracteresTotal(frase);
		int contadorPalabras = contar.contarNumeroPalabras(frase);
		int[] letraMasRepe = new int [65536];
		letraMasRepe = contar.contarTodosCaracteres(frase);
		System.out.println(mostrar.textoCaracteresTotal(contadorCaracteres));
		System.out.println(mostrar.textoNumeroPalabras(contadorPalabras));
		System.out.println(mostrar.textoTodosCaracteres(letraMasRepe));
	}
	
	

	
	
		
		
	
} 

