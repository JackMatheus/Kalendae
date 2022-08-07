import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String s ;
		System.out.printf("Entrada: ");
		s = leitor.nextLine();
		System.out.printf("Saida: %s\n", InverteCaracteres(s));
	}

	public static String InverteCaracteres(String s) {
		int i;
		String aux = "";
		for (i = (s.length() - 1); i >= 0; i--) {
			aux = aux + s.charAt(i);			
		}
		return aux;
	}

}
