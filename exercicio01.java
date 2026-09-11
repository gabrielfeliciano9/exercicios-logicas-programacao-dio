import java.util.Scanner;

  public class exercicio01{
    public static void main (String[]args){
      //Algoritmo que lê os valores de A,B,C e depois imprime a soma entre A e B, e mostra se a soma é menor que C
        int na,nb,nc,soma;
          Scanner teclado = new Scanner(System.in);

          System.out.println("Informe o valor de A: ");
          na = teclado.nextInt();

          System.out.println("Informe o valor de B: ");
          nb = teclado.nextInt();

          System.out.println("Informe o valor de C: ");
          nc = teclado.nextInt();

          soma = na + nb;

            System.out.println("A soma entre " + na + " e " + nb + " é igual a " + soma);

              if (soma > nc){
                System.out.printf(soma + " é maior que " + nc);
              } else if (soma < nc) {
                System.out.println(soma + " é menor que " + nc);

              } else {
                System.out.println(soma + " é igual a " + nc);
              }
      teclado.close();
    }
  }