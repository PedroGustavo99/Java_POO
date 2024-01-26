package application;
import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle x;
        x = new Rectangle();

        System.out.println("Entre com as informações do retângulo:");
        System.out.print("Largura: ");
        x.altura = scanner.nextDouble();
        System.out.print("Altura: ");
        x.largura = scanner.nextDouble();

        double areaRetangulo = x.area();
        System.out.printf("AREA = %.2f%n", areaRetangulo);

        double perimetroRetangulo = x.perimetro();
        System.out.printf("PERIMETRO = %.2f%n", perimetroRetangulo);

        double diagonalRetangulo = x.diagonal();
        System.out.printf("DIAGONAL = %.2f%n", diagonalRetangulo);

        scanner.close();
    }
}
