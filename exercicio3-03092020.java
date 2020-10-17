import java.util.Scanner;
public class exercicio3{
    public static void main(String args[]){
        double[] num=new double[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10; i++) {
          System.out.println("Digite o "+(i+1)+" Número");
          num[i]=scanner.nextDouble();
        }
        for(double numeros:num) {
          System.out.println(numeros);
        }
        scanner.close();
    }
}
    