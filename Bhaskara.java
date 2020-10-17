public class Bhaskara{
    public static void main(String args[]){
      int a=10;
      int b=25;
      int c=19;
      float delta=(b*b)-(4*a*c);
      Math.sqrt(delta);
      if(delta<0) {
          System.out.println("O Delta e Negativo iremos multiplica-lo por -1");
          delta=delta *(-1);
      }
      float bhaskara_positivo=(-b+delta)/(2*a);
float bhaskara_negativo=(-b-delta)/(2*a);
      System.out.println("O Valor Positivo e = " + bhaskara_positivo);
 System.out.println("O Valor Negativo e = " + bhaskara_negativo);
   
    }
}
