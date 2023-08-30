package entities;

public class Conta {
	private int numero;
	private String Cpf;
	private double Saldo = 10000.0;
	private boolean ativo;
	
	
public Conta(int numero, String cpf,  boolean ativo) {
		
		numero = numero;
		Cpf = cpf;
		ativo = ativo;
	}
	


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCpf() {
		return Cpf;
	}


	public void setCpf(String cpf) {
		Cpf = cpf;
	}


	public double getSaldo() {
		return Saldo;
	}


	public void setSaldo(double saldo) {
		Saldo = saldo;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public double sacar(double saque){
		return Saldo-= saque;
	}
	
	
	
	
	public double deposito(double valorDeposito){
		return Saldo+= valorDeposito;
	}


	@Override
	public String toString(){
		return "O Numero da conta é = " 
				+ numero 
				+ ", o Cpf do cliente é= " 
				+ Cpf  
				+ " e seu status de atividade é = " 
				+ ativo
				+ " saldo da conta: "
				+ Saldo;
	
}
}
