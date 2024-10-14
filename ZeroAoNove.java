package zeroaonove;
import java.util.Scanner;

public class ZeroAoNove {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 9: ");
        int número = scanner.nextInt();
        
        if(número >=0 && número <=9){
            System.out.println("Valor correto");
        } else {
            System.out.println("Valor incorreto");
        }
    }
    
}
