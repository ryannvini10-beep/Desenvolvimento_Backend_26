package Exercicio;
import java.util.Scanner;

public class Nome {
    // Criando o objeto scanner que permite capturar as informações digitadas pelo usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Armazena o nome do aluno

        System.out.println("Olá, " + nome);

        scanner.close();
    }
}


