import java.util.Scanner;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class hello {
  public static void main(String args [])throws IOException {
    BufferedWriter buffWrite = new BufferedWriter(new FileWriter("oi.txt"));
    BufferedReader buffRead = new BufferedReader(new FileReader("oi.txt"));
    Scanner scanner = new Scanner(System.in);
    
    InputStream is = System.in;
    System.out.print("Digite um texto: ");
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    String digitado = br.readLine();

  }
}