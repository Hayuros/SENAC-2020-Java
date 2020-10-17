/*3) Crie uma classe que represente uma Conta Corrente, 
devendo ter as propriedades Número da Conta, Agência, Saldo, Nome do Titular 
e os métodos Depósito, Saque e Saldo Total.*/
 public class Conta {
  String numConta;
  String agencia;
  double saldo = 0;
  String nomeTitular; 
  double deposito = 0;
  double saque = 0;
  
  public Conta() { 
    this.numConta = numConta;
    this.agencia = agencia; 
    this.saldo = saldo; 
    this.nomeTitular = nomeTitular;
    this.deposito = deposito;
    this.saque = saque;
  } 
}
 public void deposito {
   this.saldo += this.deposito;
   System.out.println("Você depositou R$: "+this.deposito);
 }
 public void saque {
   this.saldo -= this.saque;
   System.out.println("Você Sacou R$: "+this.saque)
 }
 public void saldoTotal{
   System.out.println("Seu saldo atual é R$: "+this.saldo);
 }