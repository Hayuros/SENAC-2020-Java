import java.util.ArrayList
public class Professor {
  int id;
  String nome;
  String escolaridade;
  ArrayList<Materia> materias;
  Materia matematica = new Materia();
  public void Professor(int id, String nome, String escolaridade, Materia materias) {
    this.id = id;
    this.nome = nome;
    this.escolaridade = escolaridade;
    this.materias = materias;
  }
  
}