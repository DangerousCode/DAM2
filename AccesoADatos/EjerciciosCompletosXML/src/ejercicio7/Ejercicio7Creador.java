package ejercicio7;
import java.io.FileOutputStream;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
public class Ejercicio7Creador {
	public static void main(String[] args){
		Element root=new Element("menu");
		Element comida=new Element("comida");
		root.addContent(comida);
		Element plato=new Element("plato");
		comida.addContent(plato);
		Element nombre=new Element("nombre");
		nombre.setText("Macarrones");
		plato.addContent(nombre);
		Element ingredientes=new Element("ingredientes");
		ingredientes.setText("Pasta, tomate y queso");
		plato.addContent(ingredientes);
		
		SAXBuilder builder=new SAXBuilder();
		Document doc=new Document(root);
		try{
			new XMLOutputter().output(doc, new FileOutputStream("Ejercicio7.xml"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
