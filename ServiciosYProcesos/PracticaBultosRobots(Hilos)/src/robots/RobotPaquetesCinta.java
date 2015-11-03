package robots;
import java.util.Random;
import java.util.concurrent.*;
public class RobotPaquetesCinta extends Thread{
	Semaphore semaforocinta;
	Paquetes[] paquete=new Paquetes[6];
	RobotPaquetesCinta(Semaphore semaforocinta){
		this.semaforocinta=semaforocinta;
	}
	public void run(){
		Random rand=new Random();
		int i=0;
		try{
			while(CreadorRobots.paquetestotales!=0){
				semaforocinta.acquire();//Baja en 1 si la cantidad de paquetes en cinta (Max 6)
				paquete[i]=new Paquetes(i,rand.nextInt(4));
				i++;
				Thread.sleep(50);
				if(i==0){
					semaforocinta.release();
				}
				if(i==0){
					i=6;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
