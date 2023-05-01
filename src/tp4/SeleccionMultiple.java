package tp4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class SeleccionMultiple extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(36, 59, 409, 42);
		contentPane.add(panel);
		
		JLabel lblSistemaOperativo = new JLabel("Elije un sistema operativo");
		lblSistemaOperativo.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblSistemaOperativo);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(rdbtnLinux);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(36, 138, 409, 106);
		contentPane.add(panel_1);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setVerticalAlignment(SwingConstants.BOTTOM);
		lblElijeUnaEspecialidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JCheckBox chckbxProgramacin = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacin.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxProgramacin.setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBox chckbxDiseoGrfico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseoGrfico.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxDiseoGrfico.setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracin.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxAdministracin.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(52, Short.MAX_VALUE)
					.addComponent(lblElijeUnaEspecialidad)
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxDiseoGrfico)
						.addComponent(chckbxAdministracin)
						.addComponent(chckbxProgramacin))
					.addGap(94))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(16)
					.addComponent(chckbxProgramacin)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxAdministracin)
						.addComponent(lblElijeUnaEspecialidad))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxDiseoGrfico)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadDeHoras.setBounds(68, 297, 221, 14);
		contentPane.add(lblCantidadDeHoras);
		
		textField = new JTextField();
		textField.setBounds(299, 294, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(356, 349, 89, 23);
		btnAceptar.setBackground(SystemColor.activeCaption);
		contentPane.add(btnAceptar);

	}
}
