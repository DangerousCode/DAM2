package aeropuerto;
import java.util.concurrent.*;
public class Creador {
	public static int avionesaterrizados;
	public static int avionesesperando;
	public static int tiempo;
	public static void main(String[] args){
		Semaphore pista=new Semaphore(1);
		boolean booleano=false;
		Tiempo t=new Tiempo(booleano);
		t.start();
		Aviones[] avion=new Aviones[100];
		try{
			for(int i=0;i<100;i++){
				avion[i]=new Aviones(pista,i);
				avion[i].start();
				avionesesperando++;
				Thread.sleep(1000);
			}
			for(int i=0;i<100;i++){
				avion[i].join();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		t.booleano=true;
	}
}
