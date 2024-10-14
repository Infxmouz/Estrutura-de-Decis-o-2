package horas;
import java.util.Scanner;

public class Horas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double horasTrabalhadas;
        
        System.out.println("Digite o turno de trabalho(N pra noturno, outros para Diurno): ");
        String turno = scanner.next();
        
        System.out.println("Digite a quantidade de Horas Trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();
        
        double valorHora;
        
        if(turno.equalsIgnoreCase("n")){
            valorHora = 45.00;
        } else {
            valorHora = 37.50;
        }
        double salário = valorHora * horasTrabalhadas;
        
        System.out.println("O salário é: R$" + salário);
        
        scanner.close();
         }
    }
