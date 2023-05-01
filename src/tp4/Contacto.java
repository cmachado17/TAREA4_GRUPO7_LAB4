package tp4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tp4.MenuPrincipal.eventoEjercicio1;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
			private JButton btnAceptar = new JButton();
			
			//constructor
			public Contacto (){
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setBounds(550,250,400,400);
				setTitle("Contactos");
				getContentPane().setLayout(null);
				
				nombre = new JLabel();
				nombre.setText("Nombre:");
				nombre.setBounds(40, 10, 100, 30);
				
				apellido = new JLabel();
				apellido.setText("Apellido:");
				apellido.setBounds(40, 50, 100, 30);
				
				telefono = new JLabel();
				telefono.setText("Telefono:");
				telefono.setBounds(40, 90, 100, 30);
				
				fechaNacimiento = new JLabel();
				fechaNacimiento.setText("Fecha Nac.:");
				fechaNacimiento.setBounds(40, 130, 100, 30);
				
				txtNombre = new JTextField();
				txtNombre.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent letra) {
						char c = letra.getKeyChar();
						
						if((c<'a' || c>'z') && (c<'A' || c>'Z')) letra.consume();					
					}
				});
				txtNombre.setBounds(120, 15, 200, 20);
				
				txtApellido = new JTextField();
				txtApellido.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char c = e.getKeyChar();
						
						if ((c<'a' || c>'z') && (c<'A' || c>'Z')) e.consume();	
					}
				});
				txtApellido.setBounds(120, 55, 200, 20);
				
				txtTelefono = new JTextField();
				txtTelefono.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent a) {
						char c = a.getKeyChar();
						
						if(c<'0' || c>'9') a.consume();
						
					}
				});
				txtTelefono.setBounds(120, 95, 200, 20);
				
				txtFechaNacimiento = new JTextField();
				txtFechaNacimiento.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent f) {
						char c= f.getKeyChar();
						
						if((c<'0' || c>'9') && (c<'/' || c>'/')) f.consume();
					}
				});
				txtFechaNacimiento.setBounds(120, 135, 200, 20);
				
				//campo para mostrar los datos ingresados
				resultado = new JLabel();
				resultado.setBounds(30, 200, 300, 200);
				
				
				//crear el boton mostar
				btnAceptar = new JButton();
				btnAceptar.setText("Mostrar");
				btnAceptar.setBounds(220, 170, 100, 30);
				
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
				panel.add(btnAceptar);
				panel.add(resultado);
				
				setContentPane(panel);
				
				btnAceptar.addActionListener(new eventoMostrar());
				
				
			}
			
			//metodos
			public void cambiarVisibilidad(boolean estado) {
				setVisible(estado);
			}
			
			//eventos
			class eventoMostrar implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					boolean bValidacion = true;
					if(txtNombre.getText().equals("")){
						txtNombre.setBackground(Color.RED);
						bValidacion = false;
					} else {
						txtNombre.setBackground(Color.WHITE);
					}
					if(txtApellido.getText().equals("")){
						txtApellido.setBackground(Color.RED);
						bValidacion = false;
					}else {
						txtApellido.setBackground(Color.WHITE);
					}
					
					if(txtTelefono.getText().equals("")){
						txtTelefono.setBackground(Color.RED);
						bValidacion = false;
					}else {
						txtTelefono.setBackground(Color.WHITE);
					}
					if(txtFechaNacimiento.getText().equals("")){
						txtFechaNacimiento.setBackground(Color.RED);
						bValidacion = false;
					}else {
						txtFechaNacimiento.setBackground(Color.WHITE);
					}
					if (bValidacion) {
						resultado.setText("Los datos ingresados fueron: " + txtNombre.getText() + ", " 
									+ txtApellido.getText() + ", " + txtTelefono.getText() 
									+ ", " + txtFechaNacimiento.getText());
						txtNombre.setBackground(Color.WHITE);
						txtNombre.setText("");
						txtApellido.setBackground(Color.WHITE);
						txtApellido.setText("");
						txtTelefono.setBackground(Color.WHITE);
						txtTelefono.setText("");
						txtFechaNacimiento.setBackground(Color.WHITE);
						txtFechaNacimiento.setText("");
					}
				}
				
			}
			
			public JPanel getPanel() {
				return panel;
			}

			public void setPanel(JPanel panel) {
				this.panel = panel;
			}

			public JLabel getNombre() {
				return nombre;
			}

			public void setNombre(JLabel nombre) {
				this.nombre = nombre;
			}

			public JLabel getApellido() {
				return apellido;
			}

			public void setApellido(JLabel apellido) {
				this.apellido = apellido;
			}

			public JLabel getTelefono() {
				return telefono;
			}

			public void setTelefono(JLabel telefono) {
				this.telefono = telefono;
			}

			public JLabel getFechaNacimiento() {
				return fechaNacimiento;
			}

			public void setFechaNacimiento(JLabel fechaNacimiento) {
				this.fechaNacimiento = fechaNacimiento;
			}

			public JTextField getTxtNombre() {
				return txtNombre;
			}

			public void setTxtNombre(JTextField txtNombre) {
				this.txtNombre = txtNombre;
			}

			public JTextField getTxtApellido() {
				return txtApellido;
			}

			public void setTxtApellido(JTextField txtApellido) {
				this.txtApellido = txtApellido;
			}

			public JTextField getTxtTelefono() {
				return txtTelefono;
			}

			public void setTxtTelefono(JTextField txtTelefono) {
				this.txtTelefono = txtTelefono;
			}

			public JTextField getTxtFechaNacimiento() {
				return txtFechaNacimiento;
			}

			public void setTxtFechaNacimiento(JTextField txtFechaNacimiento) {
				this.txtFechaNacimiento = txtFechaNacimiento;
			}

			public JLabel getResultado() {
				return resultado;
			}

			public void setResultado(JLabel resultado) {
				this.resultado = resultado;
			}

			public JButton getBtnAceptar() {
				return btnAceptar;
			}

			public void setBtnAceptar(JButton btnAceptar) {
				this.btnAceptar = btnAceptar;
			}

			public static long getSerialversionuid() {
				return serialVersionUID;
			}

}
