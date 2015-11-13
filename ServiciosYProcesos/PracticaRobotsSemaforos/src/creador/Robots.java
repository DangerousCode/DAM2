package creador;


public class Robots extends Thread {

	char direccion;
	int id;
	Ventanas ventana=new Ventanas(""+id);

	Robots(char direccion, int id) {
		this.direccion = direccion;
		this.id = id;
	}

	public void run() {
		int pesorecogido = 0;
		while (true) {
			try {
				Thread.sleep(500);
				for (int i = 0; i < 20; i++) {
					if (Cinta.paquetes[i].getDireccion() == this.direccion) {
						Cinta.sempaq[i].acquire();

						switch (direccion) {
						case 'L':
							ventana.escribecadena("Paquete con destino: Local\n");
							break;
						case 'N':
							ventana.escribecadena("Paquete con destino: Nacional\n");
							break;
						case 'I':
							ventana.escribecadena("Paquete con destino: Internacional\n");
							break;
						}

						pesorecogido += Cinta.paquetes[i].peso;

						ventana.escribecadena("El peso recogido por el robot " + id + " es: " + pesorecogido+"\n");
						Cinta.BorrarPaquete(i);
						Cinta.sempaq[i].release();
						
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}