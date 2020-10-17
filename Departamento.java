public class Departamento {
  int id;
  String descricao;
  Gerente gerente1 = new Gerente(12, "Jose de Anchieta", "Rua dos Coronéis, 2198");
  System.out.println(gerente1);
  public Departamento(int id, String descricao) {
    this.id = id;
    this.descricao = descricao;
  }
}