package operacionesbasicasXML;

import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.jdom2.contrib.dom.*;
import org.jdom2.*;

public class ModificarAtributo {
	public static void main(String[] args){
		try{
			SAXBuilder sx=new SAXBuilder();
			Document doc=sx.build("Operaciones.xml");
			Element root=doc.getRootElement();
			System.out.println(root);
			root.getChild("nivel").setAttribute("precio", "2300");
			//XMLOutputter se pone al final para cambiar el dato precio.
			new XMLOutputter().output(doc, System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}