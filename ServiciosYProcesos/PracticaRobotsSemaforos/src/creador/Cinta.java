package creador;
import java.util.*;
import java.util.concurrent.*;
public class Cinta{
	public static Paquete paquetes[]=new Paquete[20];
	public static Semaphore sempaq[]=new Semaphore[20];

	public static void InicializarPaquetes(Semaphore semcinta){
		for(int i=0;i<paquetes.length;i++){
			paquetes[i]=null;
			sempaq[i]=new Semaphore(1);
		}
		semcinta.release();
	}
	
	public static void BorrarPaquete(int pos) throws Exception{
		//Borra la posicion del array.
		paquetes[pos]=null;
	}
	public static void AniadirPaquete(Paquete paquete, int i){
		//Recorre el array para ver si hay algun null. Si lo hay añade una paquete
		paquetes[i]=paquete;
	}
}
