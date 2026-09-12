import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
    /* Algoritmo que lê dois valores A e B, se os valores de A e B forem iguais, soma os dois valores, 
     caso contrário multiplica A por B. Ao final de qualquer um dos cálculos atribui o resultado
      a uma variável C e imprime seu valor na tela */
      Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int a = teclado.nextInt();

        System.out.println("Informe o valor de B: ");
        int b = teclado.nextInt();
        
        int c;
        
        if (a == b){
          c = a + b;
          System.out.println("Soma: " + c);
        } else {
          c = a * b;
          System.out.println("Multiplicação: " + c);
        }
teclado.close();
    }
}
