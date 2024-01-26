package application;
import entities.Estudante;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do aluno: ");
        estudante.nome = scanner.nextLine();
        System.out.println("Digite as 3 notas do aluno: ");
        estudante.nota1 = scanner.nextDouble();
        estudante.nota2 = scanner.nextDouble();
        estudante.nota3 = scanner.nextDouble();

        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());

        if (estudante.notaFinal() < 60) {
            System.out.println("RETIDO");
            System.out.printf("Faltam %.2f pontos%n", estudante.pontosFaltantes());
        } else {
            System.out.println("APROVADO !");
        }

        scanner.close();
    }
}
