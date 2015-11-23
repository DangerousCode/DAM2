/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5.xpath;

/**
 *
 * @author Alvaro
 */
public class Practica5XPATH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String practica="practica.xml";
        System.out.println("1. País de la Universidad: \n");
        herramientas.Herramientas.consultasXPATH(practica, "/universidad/pais");
        System.out.println("\n2. Nombres de las Carreras: \n");
        herramientas.Herramientas.consultasXPATH(practica, "/universidad/carreras/carrera/nombre");
        System.out.println("\n3. Nombres de todos los alumnos: \n");
        herramientas.Herramientas.consultasXPATH(practica, "/universidad/alumnos/alumno/nombre");
        System.out.println("\n4. Identificadores de todas las carreras: \n");
        herramientas.Herramientas.consultasXPATHAtributos(practica, "//carrera[@id]", "id");
        System.out.println("\n5. Datos de la carrera cuyo id es c01: \n");
        herramientas.Herramientas.consultasXPATH(practica, "//carrera[@id='c01']/*");
        System.out.println("\n6. Centro en que se estudia de la carrera cuyo id es c02: \n");
        herramientas.Herramientas.consultasXPATH(practica, "//carrera[@id='c02']/centro");
        System.out.println("7. Códigos de las carreras en las que hay algún alumno matriculado: ");
        herramientas.Herramientas.consultasXPATHAtributos(practica, "//alumno/estudios/carrera","codigo");
        System.out.println("8. Apellidos y Nombre de los alumnos con beca: ");
        herramientas.Herramientas.consultasXPATH(practica, "//alumno[@beca='si']/nombre");
        herramientas.Herramientas.consultasXPATH(practica, "//alumno[@beca='si']/apellido1");
        herramientas.Herramientas.consultasXPATH(practica, "//alumno[@beca='si']/apellido2");
        System.out.println("9. Nombre de las asignaturas de la titulación c04:");
        herramientas.Herramientas.consultasXPATH(practica, "//asignatura[@titulacion='c04']/nombre");
        System.out.println("10.Nombre de las asignaturas que no tienen 4 créditos teóricos:");
        herramientas.Herramientas.consultasXPATH(practica, "//asignatura[creditos_teoricos!='4']/nombre");
        System.out.println("11.Nombre de los alumnos que matriculados en la asignatura a02: ");
        herramientas.Herramientas.consultasXPATH(practica, "//alumno/estudios/asignaturas/asignatura[@codigo='a02']/../../../nombre");
        System.out.println("12.Códigos de las carreras que estudian los alumnos matriculados en  alguna asignatura:");
        herramientas.Herramientas.consultasXPATHAtributos(practica, "//alumno/estudios/asignaturas/asignatura[@codigo]/../../carrera[@codigo]","codigo");
        System.out.println("13.Apellidos de todos los hombres: ");
        herramientas.Herramientas.consultasXPATH(practica, "//alumno[sexo='Hombre']/apellido1");
        System.out.println("14.Nombre de la carrera que estudia Víctor Manuel: ");
        herramientas.Herramientas.consultasXPATH(practica, "//carreras/carrera[@id=//alumno[nombre='Victor Manuel']/estudios/carrera/@codigo]/nombre");
    }
    
}
