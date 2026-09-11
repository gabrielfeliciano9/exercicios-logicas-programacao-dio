import java.util.Scanner;git
public class exercicio02 {
    public static void main(String[] args) {
    // Algoritmo que recebe um número e imprime se o número é par ou ímpar, positivo ou negativo
      Scanner teclado = new Scanner(System.in);

      System.out.println("Informe um número: ");
      int num = teclado.nextInt();

        if (num % 2 == 0){
          System.out.println(num + " é par ");

        } else {
          System.out.println(num + " é ímpar ");
        }
          if (num > 0) {
            System.out.println(num + " é positivo ");
        } else if (num < 0) {
            System.out.println(num + " é negativo ");
        } else {
            System.out.println(num + " é igual a zero");
        }
      teclado.close();
    }
}
