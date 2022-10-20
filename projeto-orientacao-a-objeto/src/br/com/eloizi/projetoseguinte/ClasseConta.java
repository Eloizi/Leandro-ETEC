package br.com.eloizi.projetoseguinte;

public class ClasseConta {
	
	int atributoNumeroConta; //0
	//String atributoNomeConta; //Null //Null !=""
	double atributoSaldoConta; //0.0
	//int atributoCPF;
	//int atributoRG;
	ClassePessoa atributoClienteConta;

	void metodoDepositar(double parametroValor) { //método
		
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor * .1);
		//this.atributoSaldoConta += parametroValor
		
	}
}
