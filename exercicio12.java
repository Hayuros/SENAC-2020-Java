import java.util.Scanner;
public class exercicio11{
    public static void main(String args[]){
        double salario=0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o Seu Salario");
        salario =scanner.nextLine();
        } catch (Exception exception){
            System.out.println("Erro de Digitação: " + exception.getMessage());
        }
        if(salario <= 1903.98) {
            System.out.println("Você está Isento do Imposto de Renda");
        } else if(salario >= 1903.99 && <= 2826.65) {
System.out.println("Sua Alíquota é: 7,5%");
        } else if(salario >= 2826.66 && =< 3751.05) {
            System.out.println("Sua Alíquota é: 15%");
        } else if(salario >= 3751.06 && <= 4664.68) {
            System.out.println("Sua Alíquota é: 22,5%");
        } else if(salario > 4664.68) {
            System.out.println("Sua Alíquota é: 27,5%");
        }
        }
        scanner.close();
    }
}
