package creador;
import java.util.*;
import java.util.concurrent.*;
public class Cinta{
	public static Paquete paquetes[]=new Paquete[100];

	public static void InicializarPaquetes(){
		for(int i=0;i<paquetes.length;i++){
			paquetes[i]=null;
		}
	}
	
	public static void BorrarPaquete(int pos){
		//Borra la posicion del array.
		paquetes[pos]=null;
	}
	public static void AniadirPaquete(Paquete paquete, int i){
		//Recorre el array para ver si hay algun null. Si lo hay a�ade una paquete
		paquetes[i]=paquete;
	}
}
