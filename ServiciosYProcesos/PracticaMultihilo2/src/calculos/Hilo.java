package calculos;

public class Hilo extends Thread{
	int sumanum=0;
	int veces=0;
	Suma sumatotal;
	int parametro=0;
	Hilo(){
		
	}
	Hilo(int veces, Suma sumatotal, int parametro){
		this.veces=veces;
		this.sumatotal=sumatotal;
		this.parametro=parametro;
	}
	public void run(){
		for(int i=veces;i>0;i--){
			sumanum=sumanum+parametro;
			parametro--;
		}
		System.out.println("La suma del hilo es: "+sumanum);
		sumatotal.sumarNumerosHilos(sumanum);
	}
}
