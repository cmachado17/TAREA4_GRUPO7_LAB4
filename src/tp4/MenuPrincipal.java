package tp4;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;



public class MenuPrincipal extends JFrame{
	
private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JLabel label;
	
	public MenuPrincipal() {
		//CONFIGURO PARÁMETROS Y UBICACIÓN DE LA VENTANA
		Dimension dVentana = new Dimension(450, 300);	//MISMO TAMAÑO QUE EN SETBOUNDS!!!
		Dimension dPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int posX = (int) (dPantalla.getWidth() - dVentana.getWidth()) / 2;
		int posY = (int) (dPantalla.getHeight() - dVentana.getHeight()) / 2;
		//this.setLocation(posX, posY);
		this.setSize(new Dimension(412, 300));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(posX, posY, 450,300);
		setTitle("Principal");
		
		
		//crear el boton
		boton1 = new JButton();
		boton1.setText("Ejercicio 1");
		boton1.setBounds(173, 57, 100, 30);
		boton2 = new JButton();
		boton2.setText("Ejercicio 2");
		boton2.setBounds(173, 107, 100, 30);
		boton3 = new JButton();
		boton3.setText("Ejercicio 3");
		boton3.setBounds(173, 157, 100, 30);
		
		//texto del label
		label = new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setText("GRUPO NRO: 7");
		label.setBounds(50, 24, 100, 30);

		//agrego los componentes al panel
		panel = new JPanel();
		panel.setBounds(550,250,300,300);
		panel.add(label);
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.setLayout(null);
		setContentPane(panel);
		

		//para que respete las x e y que se indican en los controles.
		getContentPane().setLayout(null);
		
		//agregar evento al hacer clic en el boton 1
		boton1.addActionListener(new eventoEjercicio1());
		boton2.addActionListener(new eventoEjercicio2());
		boton3.addActionListener(new eventoEjercicio3());
	}
	
	
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(estado);
	}
	
	
	//eventos
		class eventoEjercicio1 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Contacto ejercicio1 = new Contacto();
				ejercicio1.cambiarVisibilidad(true);
			}
		}
		class eventoEjercicio2 implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent c) {
				Promedio ejercicio2 = new Promedio();
			    ejercicio2.cambiarVisibilidad();
				}	
		}
		class eventoEjercicio3 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent c) {
				SeleccionMultiple ejercicio3 = new SeleccionMultiple();
			    ejercicio3.cambiarVisibilidad();
				}
		}
}

