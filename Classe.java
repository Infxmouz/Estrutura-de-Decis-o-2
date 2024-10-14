package classe;
import java.util.Scanner;

public class Classe {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();

        if(idade < 16){
        System.out.println("Você não é eleitor!! ");
        }else if(idade >= 18 && idade <= 65){
        System.out.println("Eleitor obrigatório!! ");
        }else{
        System.out.println("Eleitor facultativo!! ");
        }
    }
    
}
