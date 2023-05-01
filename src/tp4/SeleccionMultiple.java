package tp4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SeleccionMultiple extends JFrame {

	private JPanel contentPane;

	public void cambiarVisibilidad() {
		setVisible(true);
	}
	
	public SeleccionMultiple() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//CONFIGURO PARÁMETROS Y UBICACIÓN DE LA VENTANA
		Dimension dVentana = new Dimension(500, 350);	//MISMO TAMAÑO QUE EN SETBOUNDS!!!
		Dimension dPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int posX = (int) (dPantalla.getWidth() - dVentana.getWidth()) / 2;
		int posY = (int) (dPantalla.getHeight() - dVentana.getHeight()) / 2;
		//this.setLocation(posX, posY);
		//this.setSize(dVentana)
		
		setTitle("Seleccion multiple");
		setBounds(posX, posY, 500, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}

}
