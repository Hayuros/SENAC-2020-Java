public class Robo {
  String falar;
  String andar;
  String musica;
 
  public Robo(String falar, String andar, String musica) {
    this.falar = falar;
    this.andar = andar;
    this.musica = musica;
  }
  
  public void Falar(String falar) {
    System.out.println(this.falar);
  }
  public void Andar(String andar) {
    System.out.println(this.andar);
  }
  public void tocarMusica(String musica) {
    System.out.println(this.musica);
  }
}