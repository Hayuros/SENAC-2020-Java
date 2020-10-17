import java.util.Scanner;
public class exercicio4{
    public static void main(String args[]){
        int[] num=new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10; i++) {
          System.out.println("Digite o "+(i+1)+" Número");
          num[i]=scanner.nextInt();
        }
        for(int numeros:num) {
          String msg=(numeros%2==0) ?"Par":"Ímpar";
          System.out.println("Este Numero "+numeros+" é: "+ msg);
        }
        scanner.close();
    }
}
