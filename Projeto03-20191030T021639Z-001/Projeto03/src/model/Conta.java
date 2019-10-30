package model;

public class Conta {

	private String agencia;
	private String numero;
	private double saldo;
	
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double sacar(double valor) {
		return this.saldo - valor;
	}
	
	public double depositar(double valor) {
		return this.saldo + valor;
	}
	
	public boolean transferir(double valor, Conta conta) throws ExceptionTranferir {
		
		String mensagem = "";
		if(saldo >= valor) {
			if(conta.getNumero() != this.numero) {
				conta.setSaldo(conta.getSaldo() + valor);
				return true;
			}else {
				mensagem = "Você está tentando transferir para uma mesma conta";
			}			
		}else {
			mensagem = "Saldo Insuficiente";
		}
		throw new ExceptionTranferir(mensagem);
		
	}
	
	public String getAgencia() {
		return agencia;
	}
}
