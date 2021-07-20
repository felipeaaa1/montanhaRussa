package main;


public class Passageiro extends Thread{
	int id;
	static Fila fila;


	public Passageiro(int id, Fila fila) {
		this.id = id;
		Passageiro.fila = fila;
		fila.fila.add(this);
	}
	@Override
	public void run() {
		System.out.println("startando thread passageiro");
		try {
			System.out.println("passageiro #"+this.id+" entrou na fila");
			Thread.currentThread().wait();
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("********FIM PASSAGEIRO********");

	}


	//	public boolean filaVazia() {
	//		return fila.filaVazia();
	//	}
	//
	//	public int ultimoDaFila() {
	//		return fila.tamanhoDaFila();
	//	}
	//
	//	public int tamanhoDaFila() {
	//		synchronized (this) {
	//			return fila.tamanhoDaFila();
	//		}
	//	}
	//
	//	public synchronized void entraNaFila(Fila fila) {
	//			fila.add(this);
	//	}


}
