import java.util.ArrayList
public class Materia  {
  int id;
  String descricao;
  ArrayList <Professor> professor;
  Professor professor1 = new Professor();
  public void Materia(int id, String descricao, Professor professor) {
    this.id = id;
    this.descricao = descricao;
    this.professor = professor;
  }
}