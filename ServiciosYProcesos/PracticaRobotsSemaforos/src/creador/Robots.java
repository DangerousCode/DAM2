package creador;

public class Robots extends Thread {

	char direccion;
	int id;

	Robots(char direccion, int id) {
		this.direccion = direccion;
		this.id = id;
	}

	public void run() {
		int pesorecogido = 0;
		while (true) {
			for (int i = 0; i < 100; i++) {
				System.out.println(direccion);
				System.out.println(id);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (Cinta.paquetes[i].getDireccion() == this.direccion) {

					switch (direccion) {
					case 'L':
						System.out.println("Paquete con destino: Local");
						break;
					case 'N':
						System.out.println("Paquete con destino: Nacional");
						break;
					case 'I':
						System.out.println("Paquete con destino: Internacional");
						break;
					}

					pesorecogido += Cinta.paquetes[i].peso;

					System.out.println("El peso recogido por el robot " + id + " es: " + pesorecogido);
					
				}
			}
		}
	}
}