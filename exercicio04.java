import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
    // algoritmo que recebe um número inteiro e imprime na tela o seu antecessor e o seu sucessor
      Scanner teclado = new Scanner(System.in);

      System.out.println("Informe um número: ");
      int n = teclado.nextInt();

      int ant = n - 1;
      int suc = n + 1;

      System.out.println("Antecessor: " + ant + " | Sucessor: " + suc);
      
    teclado.close();
    }
}
