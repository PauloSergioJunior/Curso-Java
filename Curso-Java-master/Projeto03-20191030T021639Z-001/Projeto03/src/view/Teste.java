/**
 * 
 */
package view;

import model.Conta;
import model.ContaPoupanca;
import model.ExceptionTranferir;

/**
 * @author lab10usuario41
 *
 */
public class Teste {

	/**
	 * @param args
	 * @throws ExceptionTranferir 
	 */
	public static void main(String[] args) throws ExceptionTranferir {
		// TODO Auto-generated method stub

		
		ContaPoupanca cP = new ContaPoupanca();
		Conta cOrigem = new Conta();
		cOrigem.setNumero("1000");
		cOrigem.setSaldo(12000);
		Conta cDestino = new Conta();
		cDestino.setNumero("5200");
		cDestino.setSaldo(0);
		
		
		System.out.println(cP.operacoes("001",cOrigem,cDestino)); 
		System.out.println(cOrigem.getSaldo());
		System.out.println(cDestino.getSaldo());
		
//		Conta origem = new Conta();
//		origem.setSaldo(1000);
//		origem.setNumero("123");
//		System.out.println(origem.getSaldo());
//		Conta destino = new Conta();
//		destino.setNumero("124");
//		destino.setSaldo(0);
//		System.out.println(destino.getSaldo()); 
//		origem.transferir(500, origem, destino);
//		System.out.println(destino.getSaldo());
//		System.out.println(origem.getSaldo());
	}

}
