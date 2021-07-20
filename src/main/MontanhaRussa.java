package main;

public class MontanhaRussa {


	public static void main(String[] args) throws InterruptedException {


		Fila fila = new Fila();
		
//		Carro carro = new Carro(fila);
		for (int i=0 ; i<12 ; i++) {
		Passageiro passageiro = new Passageiro(i, fila);
		System.out.print(((Passageiro)fila.fila.peek()).id);
		}
//		carro.start();


	}

}
