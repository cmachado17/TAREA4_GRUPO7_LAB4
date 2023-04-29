package tp4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Contacto extends JFrame{

	private static final long serialVersionUID = 1L;
	
	//atributos
			private JPanel panel;
			private JLabel nombre;
			private JLabel apellido;
			private JLabel telefono;
			private JLabel fechaNacimiento;
			private JTextField txtNombre;
			private JTextField txtApellido;
			private JTextField txtTelefono;
			private JTextField txtFechaNacimiento;
			private JLabel resultado;
			
			//constructor
			public Contacto (){
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(550,250,300,300);
				setTitle("Contactos");
				setLayout(null);
				
				nombre = new JLabel();
				nombre.setText("Nombre:");
				nombre.setBounds(30, 10, 100, 30);
				
				apellido = new JLabel();
				apellido.setText("Apellido:");
				apellido.setBounds(30, 50, 100, 30);
				
				telefono = new JLabel();
				telefono.setText("Telefono:");
				telefono.setBounds(30, 90, 100, 30);
				
				fechaNacimiento = new JLabel();
				fechaNacimiento.setText("Fecha Nac.:");
				fechaNacimiento.setBounds(30, 130, 100, 30);
				
				txtNombre = new JTextField();
				txtNombre.setBounds(100, 15, 150, 20);
				
				txtApellido = new JTextField();
				txtApellido.setBounds(100, 55, 150, 20);
				
				txtTelefono = new JTextField();
				txtTelefono.setBounds(100, 95, 150, 20);
				
				txtFechaNacimiento = new JTextField();
				txtFechaNacimiento.setBounds(100, 135, 150, 20);
				
				
				panel = new JPanel();
				panel.setBounds(550,250,300,300);
				panel.setLayout(null);
				
				panel.add(nombre);
				panel.add(apellido);
				panel.add(telefono);
				panel.add(fechaNacimiento);
				panel.add(txtNombre);
				panel.add(txtApellido);
				panel.add(txtTelefono);
				panel.add(txtFechaNacimiento);
				
				
				setContentPane(panel);
				
				
			}
			
			//metodos
			public void cambiarVisibilidad(boolean estado) {
				setVisible(estado);
			}

}
