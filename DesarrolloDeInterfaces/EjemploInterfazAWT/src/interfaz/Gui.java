package interfaz;

import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame {
	Button b1, b2, b3;

	Gui() {
		setTitle("Titulo de la ventana");
		setLayout(new FlowLayout());
		setSize(400, 200);
		setVisible(true);
		b1 = new Button("Aceptar");
		b2 = new Button("Cancelar");
		b3 = new Button("Salir");
		add(b1);
		add(b2);
		add(b3);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("Pulsa Cancelar");
		} else if (e.getSource() == b2) {
			System.out.println("Si desea cerrar la ventana pulse en Salir");
		} else if (e.getSource() == b3) {
			System.out.println("Aqui tampoco se cierra, pulsa la X");
		}
	}
}
