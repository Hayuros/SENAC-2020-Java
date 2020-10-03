import java.util.ArrayList;
public class GerenciamentoHeroi {
  public static void main(String[] args) {
    ArrayList<Heroi> herois = new ArrayList<>();
    Heroi doutorOculto = new Heroi(1, "Doutor Oculto", "Nova York, EUA", "Richard Occult", 128.89);
    herois.add (doutorOculto);
    Heroi gongo = new Heroi (2, "Gongo", "Estados Unidos da América", "Brian O' Brien", 132.769);
    herois.add(gongo);
    Heroi sheena = new Heroi (3, "Sheena", "Estados Unidos da América", "Janet Ames", 1973.726);
    herois.add(sheena);
    Heroi superMan = new Heroi (4, "SuperMan", "Metropolis", "Clark Clent", 1500.00);
    herois.add(superMan);
    Heroi zatara = new Heroi (5, "Zatara", "Estados Unidos da América", "Giovanni Zatara", 1983.082);
    herois.add(zatara);
    Heroi flecha = new Heroi (6, "Flecha", "Estados Unidos da América", "Ralph Payne", 9739.187);
    herois.add(flecha);
    Heroi vingadorEscarlate = new Heroi (7, "Vingador Escarlate", "Estados Unidos da América", "Lee Travis", 9738.108);
    herois.add(vingadorEscarlate);
    Heroi namor = new Heroi (8, "Namor", "Estados Unidos da América", "Namor McKenzie", 9172.917);
    herois.add (namor);
    Heroi batman = new Heroi (9, "Batman", "Gothan City", "Bruce Wayne", 0171.187);
    herois.add(batman);
    Heroi homenMiraculoso = new Heroi (10, "Homen Miraculoso", "Estados Unidos da América", "Fred Carson", 9162.298);
    herois.add(homenMiraculoso);
    for(int i=0; i<11; i++) {
      System.out.println(herois);
    }
  }
}