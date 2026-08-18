// Exemplo classe calculadora notas

public class CalculadoraNotas {

    // Criando o primeiro metodo

    public static double calcularMedia (double nota1, double nota2){
        return (nota1+nota2)/2;
    }

    // Cria o metodo para verificar a situação

    public static String verificarSituacao(double media){
        if(media >=7){
            return "Aprovado";
        }else if (media >=5){
            return "Recuperação";
        }
        else{
            return "Reprovado";
        }
    }

    // Cria metodo exibir resultados

    public static void exibirResultado(String nome, double media, String situacao){
        System.out.println("Aluno: " + nome);
        System.out.println("Media " + media);
        System.out.println("situacao " + situacao);
    }

    // Cria o metodo void main
    
    public static void main (){
        String nome = "Mariana ";
        double nota1 = 5;
        double nota2 = 9;
        double media = calcularMedia (nota1, nota2);
        String situacao = verificarSituacao(media);
        exibirResultado(nome, media, situacao);
    }


    }
