package creador;
import java.util.concurrent.*;
import java.util.*;
public class RobotPaquetes extends Thread{
	Semaphore semcinta;
	RobotPaquetes(Semaphore semcinta){
		this.semcinta=semcinta;
	}
	public void run(){
		//Se crean dos random para el peso y la direccion.
		Random randdireccion=new Random();
		Random randpeso=new Random();
		try{
			while(true){
				for(int i=0;i<20;i++){
					if(Cinta.paquetes[i]==null){
						switch(randdireccion.nextInt(3)){
						case 1:
							Paquete paqueteL=new Paquete('L',randpeso.nextInt(1000));
							Cinta.AniadirPaquete(paqueteL,i);
							break;
						case 2:
							Paquete paqueteN=new Paquete('N',randpeso.nextInt(1000));
							Cinta.AniadirPaquete(paqueteN,i);
							break;
						case 3:
							Paquete paqueteI=new Paquete('I',randpeso.nextInt(1000));
							Cinta.AniadirPaquete(paqueteI,i);
							break;
						}
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
