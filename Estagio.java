package estagio;
import java.util.Scanner;

public class Estagio {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor da bolsa do estagiário:" );
        double bolsa = leia.nextDouble();
        
        System.out.println("Digite o tempo de estágio em anos: ");
        int tempoEstágio = leia.nextInt();
        
        if(bolsa >=750 && bolsa <=950 && tempoEstágio >= 2){
            System.out.println("Participará do treinamento");
        } else {
            System.out.println("Não participará do treinamento");
        }
    }
    
}
