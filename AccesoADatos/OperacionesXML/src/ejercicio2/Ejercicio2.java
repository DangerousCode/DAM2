package ejercicio2;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class Ejercicio2 {

	public static void main(String[] args) {
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio2.xml");
			Element root=doc.getRootElement();
			List<Element> elementos=root.getChildren("tipo");
			Element mueble=new Element("mueble");
			Element persianas=new Element("persianas");
			mueble.setText("muebles baratos");
			persianas.setText("De colores");
			
			elementos.get(0).addContent(mueble);
			elementos.get(0).addContent(persianas);
			elementos.get(1).addContent(mueble);
			elementos.get(1).addContent(persianas);
			
			new XMLOutputter().output(doc,System.out);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
