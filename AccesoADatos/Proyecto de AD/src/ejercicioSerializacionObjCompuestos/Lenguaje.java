package ejercicioSerializacionObjCompuestos;
import java.io.*;
public class Lenguaje implements Serializable{
	String nombrelenguaje;
	String software;
	Lenguaje(){
		
	}
	
	Lenguaje(String nombrelenguaje,String software){
		this.nombrelenguaje=nombrelenguaje;
		this.software=software;
	}
	
	public void setNombreLenguaje(String nombrelenguaje){
		this.nombrelenguaje=nombrelenguaje;
	}
	
	public void setSoftware(String software){
		this.software=software;
	}
	
	public String getNombreLenguaje(String nombrelenguaje){
		return nombrelenguaje;
	}
	
	public String getSoftware(String software){
		return software;
	}
}
