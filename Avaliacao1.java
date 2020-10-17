import java.util.Scanner;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Avaliacao1 {
    public static void main(String args[])throws IOException{
        int tam = 0;
        int aux = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Resposta.txt"));
        BufferedWriter bufWrite = new BufferedWriter(new FileWriter("Leitura.txt"));
       
        
        System.out.println("Digite o Tamanho do Vetor: ");
        tam = scanner.nextInt();
        
        int[] vetor = new int[tam];
        TreeSet<Integer> tree = new TreeSet<Integer>(); 

       for(i=0; i<tam; i++) {
         System.out.println("Digite o "+(i+1)+" Número");
         vetor[i] = scanner.nextInt();
         bufWrite.append(" " +vetor[i]);
       }
      
       //Pegando os arquivos do leitura.txt e passando eles para um vetor
       int[] vet = new int[tam];
       try{
         BufferedReader buffRead = new BufferedReader(new FileReader("Leitura.txt"));
         String linha = buffRead.readLine();           
       do {
           System.out.println("\nMostrando os vetores do Leitura");
           System.out.println("\nVetor Desordenado: ");
           System.out.print(linha);
           for(int conta = 0; conta<tam; conta++) {
             vet[conta] = Integer.parseInt(linha);
             tree.add(vet[conta]);
           }
         } while(linha!= null);
         buffRead.close();
       } catch (FileNotFoundException exception) {
         System.out.println(exception.getMessage());
       } catch(IOException exception) {
         System.out.println(exception.getMessage());
       }
       
       
       
       
       //Ordenando o Vetor e Enviando a outro arquivo
       
        //Ordenando o Vetor com o BubbleSort
        buffWrite.append("\nVetor Desordenado: ");
        for(i = 0; i<tam; i++){
          buffWrite.append(" "+vet[i]);
          System.out.println(" " + vet[i]);
        }
        buffWrite.append(" ");
        System.out.print(" ");
        
        for(i = 0; i<tam; i++){
          for(int j = 0; j<(tam-1); j++){
            if(vet[j] > vet[j + 1]){
              aux = vet[j];
              vet[j] = vet[j+1];
              vet[j+1] = aux;
            }
          }
        }
        
        buffWrite.append("\nOrdenado com o Bubble Sort:");
        System.out.print("\nOrdenado com o Bubble Sort:");
        for(i = 0; i<tam; i++){
           buffWrite.append(" "+vet[i]);
           System.out.println(" "+vet[i]);
        }
        
        
        //Ordenando o Vetor com o TreeSet
        buffWrite.append("\nOrdenado com o TreeSet: " + tree);   
        System.out.println("\nOrdenado com o TreeSet: " + tree);   
        
        
        buffWrite.close();
        bufWrite.close();
    }
}
