package herramientas;
import java.util.*;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

import java.io.*;
import org.jdom2.output.XMLOutputter;
public class Herramientas {
	
	public static void recorrerColeccion(Collection coleccion){
		Iterator it=coleccion.iterator();
		while(it.hasNext()){
		    System.out.println(it.next());
		}
	}
	public static void recorrerMapString(Map Map){
		Iterator it=Map.keySet().iterator();
		while(it.hasNext()){
			String clave=(String)it.next();
			Object valor=(Object)Map.get(clave);
			System.out.println(clave+" "+valor);
		}
	}
	
	public static void recorrerMapInteger(Map Map){
		Iterator it=Map.keySet().iterator();
		while(it.hasNext()){
			Integer clave=(Integer)it.next();
			Object valor=(Object)Map.get(clave);
			System.out.println(clave+" "+valor);
		}
	}
	
	public static void buscarDuplicados(Object obj, Collection<Object> coleccion){
		Iterator it=coleccion.iterator();
		if(coleccion.contains(obj)){
			System.out.println("El objeto se encuentra a en la coleccion");
			
		}
		else{
			System.out.println("El objeto no se encuentra en la coleccion y se a�adir�.");
			coleccion.add(obj);
		}
		Herramientas.recorrerColeccion(coleccion);
	}
        
        public static void escribirFichero(String nombre, String linea) throws IOException{
            BufferedWriter fw=new BufferedWriter(new FileWriter(nombre));
            fw.write(linea);
            fw.newLine();
            fw.close();
        }
        
        public static void leerFichero(String nombre) throws IOException{
            String linea="";
            BufferedReader fr=new BufferedReader(new FileReader(nombre));
            while(fr.ready()){
                linea=fr.readLine();
                System.out.println(linea);
            }
            fr.close();
        }
        
        public static String convertUTF(String txt, int largo){
        	if(txt.length()>largo){
        		return txt.substring(0,largo);
        	}
        	for(int n=txt.length(); n<largo; n++){
        		txt=txt+" ";
        	}
        	return txt;
        }
        public static void crearFTokenTeclado(String ruta, String token) throws IOException{
            BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(new FileWriter(ruta));
            for(int i=0;i<2;i++){
                System.out.println("La primera fila:dato"+token+"dato");
                System.out.println("Las siguientes:"+token+"dato"+token+"dato");
                System.out.print("Introduce el dato: ");
                StringTokenizer st=new StringTokenizer(sc.readLine(),token,true);
                while(st.hasMoreTokens()){
                    bw.write(st.nextToken());
                }
            }
            bw.close();
        }
        public static void serializarArray(int array[], String ruta) throws IOException{
        	ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream(ruta));
        	salida.writeObject(array);
        	salida.close();
        }
        public static void desserializarArray(String ruta) throws IOException, ClassNotFoundException{
        	ObjectInputStream entrada=new ObjectInputStream(new FileInputStream(ruta));
        	int[] obj=(int[])entrada.readObject();
        	for (int i=0;i<obj.length;i++){
        		System.out.println("El objeto es: "+obj[i]);
        	}
        	entrada.close();
        }
        public static void serializarObject(Object obj, ObjectOutputStream oos) throws IOException{
        	oos.writeObject(obj);
        }
        public static void desserializarObject(String ruta) throws IOException, ClassNotFoundException{
        	ObjectInputStream entrada=new ObjectInputStream(new FileInputStream(ruta));
        	Object obj=(Object)entrada.readObject();
      		System.out.println("El objeto es: "+obj);
        	entrada.close();
        }
        
        public static void leerObjetos(ObjectInputStream leer) throws IOException, ClassNotFoundException {
            try {
                while (true) {
                    Object c = (Object) leer.readObject();
                    System.out.println(c);
                }
            } catch (EOFException ex) {
                // tratamiento de Accion (-pintar pantalla -guardar en una coleccion -guardar en un Map -guardar fichero
                System.out.println("Final de fichero");
            } finally {
                if (leer != null) {
                    leer.close();
                }
            }
        }
        
        public static void desserializarMap(ObjectInputStream l)throws IOException, ClassNotFoundException{
        	Map m=null;
        	try{
        		while(true){
        		m=(HashMap)l.readObject();
        		}
        	}catch(EOFException e){
        		System.out.println("final de fichero");
        		System.out.println(m.toString());
        	}finally{
        		if(l!=null){
        			l.close();
        		}
        	}
        }
        
        public static void consultasXPATH(String ruta, String operacion){
        	SAXBuilder b=new SAXBuilder();
        	Document doc;
			try {
				doc = b.build(new FileInputStream(ruta));
				XPathExpression<Element> xpath=XPathFactory.instance().compile(operacion,Filters.element());
	        	List<Element> elemento=xpath.evaluate(doc);
	        	Iterator it=elemento.iterator();
	        	while(it.hasNext()){
	        		Element at=(Element) it.next();
	        		//SOUT de lo que queramos mostrar
	        		//System.out.println(at.getAttributeValue("nacimiento"));
                                XMLOutputter out=new XMLOutputter();
                                out.output(at, System.out);
	        	}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JDOMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        
}
