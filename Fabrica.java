public class Fabrica {
  public static void main(String[] args ) {
    Robo roboUm = new Robo("Olá tudo bem?", "frente, trás, esquerda, direita, 360", "");
    Robo roboDois = new Robo("Olha você aqui mais uma vez!", "360° ", "");
   
   try {
     rodoUm.Falar();
     rodoUm.tocarMusica();
     roboUm.Andar();
     rodoDois.Falar();
     roboDois.Andar();
     rodoDois.tocarMusica();
   } catch(Exception e) {
     System.out.println(e.getMessage());
   }
    
  }
}