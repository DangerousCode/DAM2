package operacionesbasicasXML;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class BuscarDatoAtributo {
	public static void main(String[] args){
		try{
			SAXBuilder sx=new SAXBuilder();
			Document doc=sx.build("Operaciones.xml");
			Element root=doc.getRootElement();
			Element c=root.getChild("computadora");
			if(c.getAttributeValue("nombre").equals("iBook")){
				System.out.println(c.getAttributeValue("precio"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
