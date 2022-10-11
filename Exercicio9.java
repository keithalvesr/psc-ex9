import java.util.Scanner;

public class Exercicio9 {

     public static void main(String args []) {
        // Faça um Programa que peça a temperatura em graus Fahrenheit, t
        // transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).

        double temperaturaF;
        double temperaturaC;

        System.out.println("Programa de Temperatura. Bem vindo!");

        // 1) Ação do usuario: temperatura Fahrenheit
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a tempertatura em graus Fahrenheit:");
        temperaturaF = teclado.nextDouble();
        teclado.close();

        // 2) Tarefa do programa: Transformar F em Celsius 
        temperaturaC = 5 * ((temperaturaF-32)/9);

        // 3) Resposta do programa: Mostrar a temperatura em graus C
        System.out.print("A temperatura em Celsius é: " + temperaturaC);
       


   }
}