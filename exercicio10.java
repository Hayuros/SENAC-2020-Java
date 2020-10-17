import java.util.Scanner;
public class exercicio10{
    public static void main(String args[]){
        String string1="";
        String string2="";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a Primeira String: ");
                string1 =scanner.nextLine();
        System.out.println("Digite a Segunda String: ");
        string2 = scanner.nextLine();
            
        } catch (Exception exception){
            System.out.println("Erro de Digitação" + exception.getMessage());
        }
       System.out.println("As Strings são Iguais" +string1.equals(string2));
        scanner.close();
    }
}