import java.util.Scanner;
public class exercicio11{
    public static void main(String args[]){
        String num="";
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite um Número com ponto");
        num =scanner.nextLine();
        } catch (Exception e){
            System.out.println("Erro de Digitação: " + e.getMessage());
        }
        double numero = Integer.parseInt(num);
        System.out.println("Aqui está o número Convertido: " + numero);
        scanner.close();
    }
}