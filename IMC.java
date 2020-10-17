public class IMC {
  public static void main(String[] args) {
    Pessoa pessoaUm = ("Jose de Alencar", 75.69, 1.97, "12/01/1978");
    Pessoa pessoaDois = ("Jose de Anchieta", 100.76, 1.56, "19/09/1876");
    if(imc < 18,5) {
      System.out.println("Seu IMC é:"+imc+"Você está Abaixo do Peso");
    } else if(imc < 24,9) {
      System.out.println("Seu IMC é:"+imc+"Você está com o seu Peso Ideal");
    } else if(imc < 29,9) {
      System.out.println("Seu IMC é:"+imc+"Você está Levemente acima do peso");
    } else if(imc < 34,9) {
      System.out.println("Seu IMC é:"+imc+"Você está com Obesidade Grau I");
    } else if(imc < 39,9) {
      System.out.println("Seu IMC é:"+imc+"Você está com Obesidade Grau II");
    } else if(imc > 40) {
      System.out.println("Seu IMC é:"+imc+"Você está com Obesidade Grau III (mórbida)");
    }
  }
}