import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Aluno objetoAluno = new Aluno ();

        Scanner input = new Scanner (System.in);

        //Input do nome do Aluno

        System.out.print("Digite o nome do aluno: ");

        String nomeAluno = input.nextLine();

        objetoAluno.setNomeAluno(nomeAluno);

        //Input da data de nascimento

        System.out.print("Digite a data de nascimento do aluno: ");

        String dataNascimento = input.nextLine();

        objetoAluno.setDataNascimento(dataNascimento);

        //Input da série

        System.out.print("Digite a série sendo cursada no momento pelo aluno: ");

        String serie = input.nextLine();

        objetoAluno.setSerie(serie);

        /* Output das três informações.
        Primeiro o nome, depois a data de nascimento e, por fim, a serie */

        System.out.println("Nome: " + objetoAluno.getNomeAluno());

        System.out.println("Data de nascimento: " + objetoAluno.getDataNascimento());

        System.out.println("Série: " + objetoAluno.getSerie());


    }

}