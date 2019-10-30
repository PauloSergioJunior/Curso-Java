/**
 * 
 */
package view;

import model.Conta;
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

		Conta c = new Conta();
		c.setSaldo(120);
		c.setNumero("123");
		Conta c2 = new Conta();
		c2.setNumero("124");
		System.out.println(c.transferir(1000, c2));
		
		
	}

}
