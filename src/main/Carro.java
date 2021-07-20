package main;

import java.util.ArrayList;
import java.util.List;

public class Carro extends Thread{

	private List<Passageiro> lugares = new ArrayList<Passageiro>();
	int id=0;
	static Fila fila;

	public Carro(Fila fila) {
		id++;
		Carro.fila=fila;
	}

	@Override
	public void run() {
		System.out.println("starting "+this.getName());
		while (!fila.fila.isEmpty()) {
			System.out.println("carro na estação, chamando proximos da fila");
			
			this.lugares.removeAll(lugares);
			System.out.println("carro vazio");
			while(this.lugares.size()<4) {
				this.popularCarro(fila.fila.peek());
				this.removePassageiroDaFila(fila.fila.peek());
			}

			try {
				System.out.println("carro: "+id+" andando, volta em: 5 segundos");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("********CARRO DORMINDO********");
	}

	public void popularCarro(Passageiro passageiro) {
		this.lugares.add(passageiro);
	}
	public void removePassageiroDaFila(Passageiro passageiro) {
		this.fila.fila.remove(passageiro.id);
	}

}
