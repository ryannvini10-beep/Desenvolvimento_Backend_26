package Projeto;

public class Main {

    public static void main (){
        // instanciando os objetos

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Daniel";
        aluno1.idade = 31;
        aluno1.nota1 = 9;
        aluno1.nota2 = 10;
        aluno1.apresentar();
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Situação: " + aluno1.verificarSituacao());
    }
    
}
