/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

1.	Mostrar el  nombre de las personas que tenga el mismo lugar de nacimiento  que el director
2.	Mostrar el nombre de la madre de las personas  que sean distintas que la recepcionista
3.	Mostrar el identificador de las personas que no sean camareras y que su lugar de nacimiento  no coincida con el lugar de nacimiento del director
4.	Mostrar el cargo que ocupan las personas  que tienen más de 1 dirección de comtacto  y cuyo sueldo sea mayor al  que gana la recepcionista
5.	Muestra el nombre de todos las personas cuyo país de nacimiento sea distinto al de Jeanne Dupont

*/
package ejercicio.pkg3.xpath.abreviada.anidamiento;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1.	Mostrar el  nombre de las personas que tenga el mismo lugar de nacimiento  que el director");
        herramientas.Herramientas.consultasXPATH("ejercicio1.xml", "//persona/nacimiento[@lugar=//persona[@id=//puesto[@cargo='director']/@id]/nacimiento/@lugar]/../nombre");
        System.out.println("2.	Mostrar el nombre de la madre de las personas  que sean más jóvenes  que la recepcionista");
        herramientas.Herramientas.consultasXPATH("ejercicio1.xml", "");
    }
    
}
