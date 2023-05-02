package tp4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;

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
			private JLabel label;
			
			
			//constructor
			public Contacto (){
				//CONFIGURO PARÁMETROS Y UBICACIÓN DE LA VENTANA
				Dimension dVentana = new Dimension(400, 300);	//MISMO TAMAÑO QUE EN SETBOUNDS!!!
				Dimension dPantalla = Toolkit.getDefaultToolkit().getScreenSize();
				int posX = (int) (dPantalla.getWidth() - dVentana.getWidth()) / 2;
				int posY = (int) (dPantalla.getHeight() - dVentana.getHeight()) / 2;
				//this.setLocation(posX, posY);
				//this.setSize(dVentana);
				
				setTitle("Contactos");
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setBounds(posX,posY,400,300);
				setTitle("Contactos");
				getContentPane().setLayout(null);
				
				nombre = new JLabel();
				nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
				nombre.setText("Nombre:");
				nombre.setBounds(50, 43, 74, 30);
				
				apellido = new JLabel();
				apellido.setFont(new Font("Tahoma", Font.BOLD, 11));
				apellido.setText("Apellido:");
				apellido.setBounds(50, 83, 74, 30);
				
				telefono = new JLabel();
				telefono.setFont(new Font("Tahoma", Font.BOLD, 11));
				telefono.setText("Telefono:");
				telefono.setBounds(50, 123, 74, 30);
				
				fechaNacimiento = new JLabel();
				fechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
				fechaNacimiento.setText("Fecha Nac.:");
				fechaNacimiento.setBounds(50, 163, 74, 30);
				
				txtNombre = new JTextField();
				txtNombre.setColumns(10);
				txtNombre.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent letra) {
						char c = letra.getKeyChar();
						
						if((c<'a' || c>'z') && (c<'A' || c>'Z')) letra.consume();	
						
						
					}
				});
				txtNombre.setBounds(130, 48, 200, 20);
				
				txtApellido = new JTextField();
				txtApellido.setColumns(10);
				txtApellido.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char c = e.getKeyChar();
						
						if ((c<'a' || c>'z') && (c<'A' || c>'Z')) e.consume();	
					}
				});
				txtApellido.setBounds(130, 88, 200, 20);
				
				txtTelefono = new JTextField();
				txtTelefono.setColumns(10);
				txtTelefono.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent a) {
						char c = a.getKeyChar();
						
						if(c<'0' || c>'9') a.consume();
						
					}
				});
				txtTelefono.setBounds(130, 128, 200, 20);
				
				txtFechaNacimiento = new JTextField();
				txtFechaNacimiento.setColumns(10);
				txtFechaNacimiento.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent f) {
						char c= f.getKeyChar();
						
						if((c<'0' || c>'9') && (c<'/' || c>'/')) f.consume();
					}
				});
				txtFechaNacimiento.setBounds(130, 168, 200, 20);
				
				//campo para mostrar los datos ingresados
				resultado = new JLabel();
				resultado.setFont(new Font("Tahoma", Font.PLAIN, 11));
				resultado.setBounds(39, 301, 300, 37);
				
				
				//crear el boton mostar
				btnAceptar = new JButton();
				btnAceptar.setBackground(SystemColor.activeCaption);
				btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnAceptar.setText("Mostrar");
				btnAceptar.setBounds(230, 203, 100, 30);
				
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
				
				label = new JLabel();
				label.setBounds(29, 279, 208, 14);
				panel.add(label);
				
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
						label.setText("Los datos ingresados fueron:");
						resultado.setText(txtNombre.getText() + ", " 
									+ txtApellido.getText() + ", " + txtTelefono.getText() 
									+ ", " + txtFechaNacimiento.getText());
						resetearCampos();
					}else {
						resultado.setText("");
						label.setText("");
					}
				}
				
			}
			
			private void resetearCampos() {
				txtNombre.setBackground(Color.WHITE);
				txtNombre.setText("");
				txtApellido.setBackground(Color.WHITE);
				txtApellido.setText("");
				txtTelefono.setBackground(Color.WHITE);
				txtTelefono.setText("");
				txtFechaNacimiento.setBackground(Color.WHITE);
				txtFechaNacimiento.setText("");
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
