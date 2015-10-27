package tg;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.*;
import java.io.*;
public class Creador {
	public static void main(String[] args){
		try{
			int ninios=0;
			BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
			ninios=Integer.parseInt(sc.readLine());
			Semaphore semaforo=new Semaphore(ninios);
			Madre madre=new Madre(semaforo,ninios);
			Ninio[] ninio=new Ninio[ninios];
			for(int i=0;i<ninio.length;i++){
				ninio[i]=new Ninio(semaforo, madre);
			}
			for(int i=0;i<ninio.length;i++){
				ninio[i].start();
			}
			for(int i=0;i<ninio.length;i++){
				ninio[i].join();
			}
		}catch(IOException e){
			System.out.println("Excepcion IO");
		}catch(InterruptedException e){
			System.out.println("Excepcion interrupcion");
		}
	}
}