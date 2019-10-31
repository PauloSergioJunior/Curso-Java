package model;

import java.util.Scanner;

public class ContaPoupanca extends Conta {
	
	private static String operacaoTransferencia = "001";
	private static String operacaoSaque = "002";
	private static String operacaoDeposito = "003";
	
	public boolean operacoes(String operacoes, Conta cOrigem,Conta cDestino) throws ExceptionTranferir {
		
		if(operacoes.contains("001")) {
						
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor para transferir");
			double valor = sc.nextDouble();
			
			return cOrigem.transferir(valor, cOrigem, cDestino);
		}
		
		return false;
		
	}
	
	

	
	
		
}
