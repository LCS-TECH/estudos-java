package listaNe;

import java.util.Scanner;

public class Questao1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int idade,dias;

    System.out.println("Digite sua idade em anos: ");
    idade = sc.nextInt();

    dias = idade * 365;
    System.out.println("Você tem " + dias +" dias de vida!!!");
  }
}
