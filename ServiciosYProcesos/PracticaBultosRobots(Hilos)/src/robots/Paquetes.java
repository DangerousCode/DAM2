package robots;

public class Paquetes {
	int numero;
	String direccion;
	public Paquetes(int numero,int direccion) {
		this.numero=numero;
		switch(direccion){
		case 1:
			this.direccion="Madrid";
		case 2:
			this.direccion="Peninsula";
		case 3:
			this.direccion="Espania";
		case 4:
			this.direccion="Europa";
		}
	}

}
