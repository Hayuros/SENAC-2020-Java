public class Bhaskara {
    public static void main(String args[]) {
      int a=10;
      int b=25;
      int c=19;
      float delta=(b*b)-(4*a*c);
      Math.sqrt(delta);
      if(delta>0) {
          System.out.println("O Delta e Negativo");
      }
      float positivo=(-b+delta)/(2*a);
float negativo=(-b-delta)/(2*a);
      System.out.println("O Valor Positivo e " + positivo);
 System.out.println("O Valor Negativo e " + negativo);
   }
}
