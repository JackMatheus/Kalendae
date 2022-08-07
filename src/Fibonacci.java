public class Fibonacci {
	    //atual=2+1=3
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...	
	public static void main(String[] args) {
		System.out.println(contagem(10));
    }
	
	public static int contagem (int numero) {
		
		int anterior = 0;
        int atual = 0;
				
        for (int contador = 1; contador <= numero; contador++) {
            if (contador == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
                System.out.println(anterior);
            }

        }
		return atual;
	}
}