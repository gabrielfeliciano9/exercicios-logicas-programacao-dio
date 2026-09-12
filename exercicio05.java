import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
   /* algoritmo que lê o valor do salário mínimo e o valor do salário de um usuário
 calcula quantos salários mínimos esse usuário ganha e imprime na tela o resultado.
 (BASE SALÁRIO MÍNIMO: R$ 1.621,00) */

    Scanner teclado = new Scanner(System.in);

      System.out.println("Informe seu salário R$: ");
      double salUsers = teclado.nextDouble();

      System.out.println("Informe o valor do salário mínimo: ");
      double salMin = teclado.nextDouble();

      double calculo = salUsers / salMin;

      System.out.printf("Você ganha %.2f salários mínimos", calculo);
      
teclado.close();
    }
}
