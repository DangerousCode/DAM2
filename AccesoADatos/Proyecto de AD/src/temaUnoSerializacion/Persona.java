package temaUnoSerializacion;

public class Persona {
	String nombre;
	String apellidos;
	String DNI;
	int edad=0;
	Persona(){
		
	}
	Persona(String nombre, String apellidos, String DNI, int edad){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.DNI=DNI;
		this.edad=edad;
	}
}
