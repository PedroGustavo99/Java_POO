package application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcioario");
        System.out.print("NOME: ");
        funcionario.nome = scanner.nextLine();
        System.out.print("Salário Bruto: ");
        funcionario.salarioBruto = scanner.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = scanner.nextDouble();

        System.out.println();
        System.out.println("Funcionário, " + funcionario);

        System.out.println();
        System.out.print("Qual a porcentagem de aumento de salário ?");
        double porcentagem = scanner.nextDouble();
        funcionario.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Atualização do salário líquido: " + funcionario);


        scanner.close();
    }
}
