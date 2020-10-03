public class Heroi {
  int id;
  String nome;
  String localizacao;
  String identidade;
  double preco;
  ArrayList<Franquia> franquias = new ArrayList<>();
  Franquia ligaDaJustica = new Franquia(1, "Liga da Justiça", "Liga", "19/06/2015");
  franquias.add(ligaDaJustica);
  Franquia superMan1 = new Franquia(2, "Superman 1", "Homen de Aço 1" ,"12/04/1987");
  franquias.add(superMan1);
  Franquia batman2 = new Franquia(3, "Batman 2: O retorno do Coringa", "Batman 2", "21/09/2010");
  franquias.add(batman2);
  Franquia flecha3 = new Franquia(4, "Flecha 3: Juntando a Liga Novamente", "Flecha 3", "18/01/2019");
  franquias.add(flecha3);
  Franquia ligaDaJustica3 = new Franquia(5, "Liga da Justiça 3: A luta contra Adão Negro", "Liga da Justiça 3", "30/12/2016");
  franquias.add(ligaDaJustica3);
public Heroi(int id, String nome, String localizacao, String identidade double preco, Franquia franquias) {
  this.id = id;
  this.nome = nome;
  this.localizacao = localizacao;
  this.identidade = identidade;
  this.preco = preco;
  this.franquias = franquias;
  }
  public void valorInvestimentos () {
    
  }
  
  public void quantidadeFilmes () {
    
  }
  for(int i=0; i <6; i++) {
    System.out.println(franquias);
  }
}