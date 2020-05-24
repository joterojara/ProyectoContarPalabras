
public class CMostrar {
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
