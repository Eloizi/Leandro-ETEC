package br.com.eloizi.projetoseguinte;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClasseConta objetoConta1 = new ClasseConta(); //Instancia um Objeto 
	
		
		objetoConta1.atributoClienteConta = new ClassePessoa();
		
		objetoConta1.atributoClienteConta.atributoNomePessoa= "Eloizi";
		objetoConta1.atributoClienteConta.atributoCPFPessoa= 1234;
		objetoConta1.atributoClienteConta.atributoRGPessoa= 456789;
		
		
		objetoConta1.atributoNumeroConta = 1234;
		//objetoConta1.atributoSaldoConta = 10.0000 + (10.000 * 20%);
		//objetoConta1.atributoSaldoConta = 10.0000; // 20%
		objetoConta1.metodoDepositar(10.000);
				
		System.out.println(objetoConta1.atributoNumeroConta);
		System.out.println(objetoConta1.atributoSaldoConta);

		ClasseConta objetoConta2 = new ClasseConta(); //Instancia um Objeto 
		
		objetoConta2.atributoClienteConta = new ClassePessoa();
		
		objetoConta2.atributoClienteConta.atributoNomePessoa= "Geovana";
		objetoConta2.atributoClienteConta.atributoCPFPessoa= 456789;
		objetoConta2.atributoClienteConta.atributoRGPessoa= 231156;
		
		//objetoConta2.atributoNomeConta = "Bob Esponja";
		//objetoConta2.atributoNumeroConta = 1234;
		//objetoConta2.metodoDepositar(10.000);
	
		//System.out.println(objetoConta2.atributoNomeConta);
		//System.out.println(objetoConta2.atributoNumeroConta);
		//System.out.println(objetoConta2.atributoSaldoConta);
	}

}
