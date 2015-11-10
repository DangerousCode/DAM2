package ejercicio1;

import org.jdom2.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class Ejercicio1 {
	public static void main(String args[]){
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio1.xml");
			
			new XMLOutputter().output(doc,System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}