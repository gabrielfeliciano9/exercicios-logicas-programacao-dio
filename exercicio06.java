import java.util.Scanner;

public class exercicio06 {
		public static void main (String[]args) {
            // lê um valor int e imprime na tela com um reajuste de 5%.
			Scanner teclado = new Scanner(System.in);
				
				System.out.println("Informe um valor: ");
				double valor = teclado.nextDouble();

				double cincoPorcento = valor * 0.05;
				double valorReajustado = valor + cincoPorcento;

				System.out.printf("seu valor com reajuste de 5%%: %.2f", valorReajustado);

teclado.close();

}
	}

