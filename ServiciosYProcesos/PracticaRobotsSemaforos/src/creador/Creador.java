package creador;
import java.util.concurrent.*;

public class Creador {

	public static void main(String args[]) throws Exception{
		Semaphore semcinta=new Semaphore(1);
		Robots[] robots=new Robots[6];
		RobotPaquetes robotpaq=new RobotPaquetes(semcinta);
		
		robots[0]=new Robots('L',1);
		robots[1]=new Robots('L',2);
		robots[2]=new Robots('N',3);
		robots[3]=new Robots('N',4);
		robots[4]=new Robots('I',5);
		robots[5]=new Robots('I',6);
		
		
		Cinta.InicializarPaquetes(semcinta);
		robotpaq.start();
		
		for(int i=0;i<6;i++){
			robots[i].start();
		}
		for(int i=0;i<6;i++){
			robots[i].join();
		}
		
		robotpaq.join();
	}

}
