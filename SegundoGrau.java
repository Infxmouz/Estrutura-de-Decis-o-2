package segundograu;

import java.util.Scanner;

public class SegundoGrau {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de a");
        double a = leia.nextDouble();

        System.out.println("Digite o valor de b");
        double b = leia.nextDouble();

        System.out.println("Digite o valor de c");
        double c = leia.nextDouble();

        double delta = (b * b) - 4 * a * c;

        if(delta>=0){

        double raiz1 = (-b + Math.sqrt(delta))/(2 * a);
        double raiz2 = (-b - Math.sqrt(delta))/(2 * a);

        System.out.println(String.format("As raízes da equação são: %.2f e %.2f", raiz1, raiz2));
        } else {
           System.out.println("Delta é negativo. Não dá para calcular raizes reais.");
        }
    }
    
}
