package operacionesbasicasXML;

import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class ModificarAtributoLista {
	public static void main(String[] args){
		try{
			SAXBuilder sx=new SAXBuilder();
			Document doc=sx.build("Ejercicio2.xml");
			Element root=doc.getRootElement();
			List elementos=root.getChildren("tipo");
			((Element) elementos.get(0)).getChild("historieta").getAttribute("nombre").setName("titulo");
			new XMLOutputter().output(doc, System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
