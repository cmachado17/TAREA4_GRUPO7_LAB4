package tp4;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SeleccionMultiple extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtHoras;

	public void cambiarVisibilidad() {
		setVisible(true);
	}
	
	public SeleccionMultiple() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//CONFIGURO PARÁMETROS Y UBICACIÓN DE LA VENTANA
		Dimension dVentana = new Dimension(500, 385);	//MISMO TAMAÑO QUE EN SETBOUNDS!!!
		Dimension dPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int posX = (int) (dPantalla.getWidth() - dVentana.getWidth()) / 2;
		int posY = (int) (dPantalla.getHeight() - dVentana.getHeight()) / 2;
		//this.setLocation(posX, posY);
		//this.setSize(dVentana)
		
		setTitle("Seleccion multiple");
		setBounds(posX, posY, 500, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		///SECCIÓN SISTEMAS OPERATIVOS
		JPanel panelSO = new JPanel();
		panelSO.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSO.setBounds(36, 30, 409, 42);
		contentPane.add(panelSO);
		
		
		/// CREACIÓN DE RADIO BUTTONS
		JLabel lblSistemaOperativo = new JLabel("Elige un sistema operativo");
		lblSistemaOperativo.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelSO.add(lblSistemaOperativo);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelSO.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelSO.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelSO.add(rdbtnLinux);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnWindows);
		grupo.add(rdbtnMac);
		grupo.add(rdbtnLinux);
		
		
		/// SECCIÓN ESPECIALIDAD
		JPanel panelEspecialidad = new JPanel();
		panelEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEspecialidad.setBounds(36, 98, 409, 106);
		contentPane.add(panelEspecialidad);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elige una especialidad");
		lblElijeUnaEspecialidad.setVerticalAlignment(SwingConstants.BOTTOM);
		lblElijeUnaEspecialidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		
		///CHECKS BOX ESPECIALIDAD
		JCheckBox chckbxProgramacin = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacin.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxProgramacin.setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBox chckbxDiseoGrfico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseoGrfico.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxDiseoGrfico.setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracin.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxAdministracin.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panelEspecialidad = new GroupLayout(panelEspecialidad);
		gl_panelEspecialidad.setHorizontalGroup(
			gl_panelEspecialidad.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelEspecialidad.createSequentialGroup()
					.addContainerGap(52, Short.MAX_VALUE)
					.addComponent(lblElijeUnaEspecialidad)
					.addGap(30)
					.addGroup(gl_panelEspecialidad.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxDiseoGrfico)
						.addComponent(chckbxAdministracin)
						.addComponent(chckbxProgramacin))
					.addGap(94))
		);
		gl_panelEspecialidad.setVerticalGroup(
			gl_panelEspecialidad.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEspecialidad.createSequentialGroup()
					.addGap(16)
					.addComponent(chckbxProgramacin)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelEspecialidad.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxAdministracin)
						.addComponent(lblElijeUnaEspecialidad))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxDiseoGrfico)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panelEspecialidad.setLayout(gl_panelEspecialidad);
		
		
		///SECCIÓN HORAS
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadDeHoras.setBounds(79, 240, 221, 14);
		contentPane.add(lblCantidadDeHoras);
		
		txtHoras = new JTextField();
		txtHoras.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if ((c<'0' || c>'9')) e.consume();	
				
			}
		});
	
		txtHoras.setBounds(310, 237, 86, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		
		///BOTÓN ACEPTAR
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(356, 294, 89, 23);
		btnAceptar.setBackground(SystemColor.activeCaption);
		contentPane.add(btnAceptar);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				String primero = null;
				ArrayList <String> segundo = new ArrayList <String>();
				String tercero = null;
							
				if(rdbtnLinux.isSelected()) {
					primero = rdbtnLinux.getText();
				}else if(rdbtnWindows.isSelected()) {
					primero = rdbtnWindows.getText();
				}else {
					primero = rdbtnMac.getText();
				}
			 
				if(chckbxProgramacin.isSelected()) {
					segundo.add(chckbxProgramacin.getText());
				}
				 
				if(chckbxAdministracin.isSelected()) {
					segundo.add(chckbxAdministracin.getText());
				}
				
				if(chckbxDiseoGrfico.isSelected()) {
					segundo.add(chckbxDiseoGrfico.getText());
				}
							
				tercero = txtHoras.getText();
				
				
				///MENSAJE EMERGENTE
				if(primero.isEmpty() || segundo.isEmpty() || tercero.isEmpty()) 
			   {
					Mensaje mensaje = new Mensaje("Seleccione correctamente todos los campos solicitados.");
					mensaje.setLocationRelativeTo(null);
					mensaje.cambiarVisibilidad(true);
			   }
				else {
				Mensaje mensaje = new Mensaje(primero, segundo, tercero);
				mensaje.setLocationRelativeTo(null);
				mensaje.cambiarVisibilidad(true);
				}
			}
		});

	}
}
