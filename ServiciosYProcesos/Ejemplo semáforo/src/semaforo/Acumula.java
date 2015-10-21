package semaforo;

import java.util.concurrent.Semaphore;

class Acumula {

	public static int acumulador = 0; // inicializa el acumulador a 0

}

class Sumador extends Thread {

	private int cuenta;

	private Semaphore semaforo;

	// Constructor

	Sumador(int hasta, int id, Semaphore semaforo) {

		this.cuenta = hasta;

		this.semaforo = semaforo;

	}

	// Metodo incrementa el acumulador

	public void sumar() {

		Acumula.acumulador++;

	}

	public void run() {

		for (int i = 0; i < cuenta; i++) {

			try {

				semaforo.acquire(); // Se�al Wait del Semaforo. Disminuye en 1

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			sumar();

			semaforo.release(); // Se�al Signal del semaforo. Incrementa en

		}

	}

}
