public class Loja {
  public static void main(String[] args) {
    Cerveja brahma = new Cerveja("água, malte, lúpulo", "Brahma Pilsen", "Pilsen", "29/12/2035");
    Cerveja skol = new Cerveja("água, malte, lúpulo", "Skol Latão", "0% Álcool", "23/09/1987");
    try {
      brahma.cervejaCompleta();
      skol.cervejaCompleta();
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}