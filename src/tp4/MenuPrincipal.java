package tp4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MenuPrincipal extends JFrame{
	
private static final long serialVersionUID = 1L;
	
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JLabel label;
	
	public MenuPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Principal");
		
		//crear el boton
		boton1 = new JButton();
		boton1.setText("Ejercicio 1");
		boton1.setBounds(40,85,140,30);
		boton2 = new JButton();
		boton2.setText("Ejercicio 2");
		boton2.setBounds(40,155,140,30);
		boton3 = new JButton();
		boton3.setText("Ejercicio 3");
		boton3.setBounds(40,215,140,30);
		
		//texto del label
		label = new JLabel();
		label.setText("GRUPO NRO: 7");
		label.setBounds(15,15,140,30);

		//agrego los componentes al panel
		getContentPane().add(boton1);
		getContentPane().add(boton2);
		getContentPane().add(boton3);
		getContentPane().add(label);
		

		//para que respete las x e y que se indican en los controles.
		setLayout(null);
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
	}
}
