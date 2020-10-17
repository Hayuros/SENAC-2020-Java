import java.util.Scanner;
public class exercicio1{
    public static void main(String args[]){
        int tam = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a Quantidade de notas a ser Calculada: ");
        tam=scanner.nextInt();
        
        double[] nota = new double [tam];
        for(int i=0; i<tam; i++) {
          System.out.println("Digite a "+(i+1)+" Nota");
          nota[i]=scanner.nextDouble();
        }
        double media=0; 
        for(double notas:nota) {
          media += notas;
         }
         System.out.println("A Média das Notas é: "+media/tam);
        scanner.close();
    }  
}