public class Remedio {
  /*Características*/
    String curar;
    String dtValidade;
    String dtFabricacao;
    String bula;
    String formaDeTomar;
    String contraIndicacoes;
    String danosCausados;
}
 /*Ações*/
    public void Curar {
      System.out.println("Este Remédio tem a Função de Curar: "+curar);
    }
    public void Datas {
      System.out.println("A data de Validade é: "+dtValidade);
      System.out.println("A data de Fabricação é:"+dtFabricacao);
      if(dtValidade < dtFabricacao){
        System.out.print("Este Remédio Ainda possui uma validade de:"+validade);   
      } else if(validade > dtValidade) {
        System.out.print("Este Remédio não possui mais Validade:"+dtValidade);
      }
    }
    public void Bula {
      
    }
    public void ContraIndicacoes {
      
    }