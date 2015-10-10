//Winter is coming...
package calculos;

public class Calculos {
	public static void main(String[] args) throws InterruptedException{
		int parametro=21;
		int hilos=20;
		int veces=0;
		boolean primo=true;
		//Mientras los hilos sean mayores que
		//uno el bucle se mantendra
		while(hilos>1){
			//Si el modulo del parametro y los hilos
			//es 0, se habra obtenido la cantidad mas eficiente
			//de hilos para realizar el calculo y saldra del bucle.
			//Tambien se obtendra la cantidad de veces que debe sumar los numeros.
			if(parametro%hilos==0){
				veces=parametro/hilos;
				break;
			}
			hilos--;
		}
		//Comprobacion de primos menores que 19.(Ya que 20 no es primo)
		if(parametro<=19){
			for(int i=2;i<parametro;i++){
				if(parametro%i==0){
					primo=false;
					break;
				}
			}
		}
		//Si no lo es, solo comprobara la cantidad de hilos para
		//saber si es primo o no.
		else{
			primo=false;
		}
		
		Suma sumatotal=new Suma();
		if(hilos==1 || primo){
			Hilo hilo=new Hilo(parametro,sumatotal,parametro);
			System.out.println("La cantidad de hilos utilizada es: 1\n");
			hilo.start();
			hilo.join();
			System.out.println("La suma total es: "+sumatotal.sumatotal);
		}
		
		else{
			Hilo[] hilo=new Hilo[hilos];
			
			for(int i=0;i<hilos;i++){
				hilo[i]=new Hilo(veces, sumatotal, parametro);
				//Se resta veces a parametro para indicar al siguiente hilo desde donde
				//debe continuar sumando numeros.
				parametro=parametro-veces;
			}
			System.out.println("La cantidad de hilos utilizada es: "+hilos+"\n");
			for(int i=0;i<hilos;i++){
				hilo[i].start();
			}
			for(int i=0;i<hilos;i++){
				hilo[i].join();
			}
			System.out.println("La suma total es: "+sumatotal.sumatotal);
		}
		
		
	}
}
