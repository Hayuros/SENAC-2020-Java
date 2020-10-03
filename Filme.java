public class Filme {
  int id;
  String dataLancamento;
  String previsaoInvestimento;
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
  public void Filme (int id, String dataLancamento String previsaoInvestimento) {
    this. id = id;
    this.dataLancamento = dataLancamento;
    this.previsaoInvestimento = previsaoInvestimento;
  }
  
  public void quantidadeHerois () {
    
  }
  
  public void valorTotalHerois () {
    
  }
  
  public void valores () {
    
  }
  
}