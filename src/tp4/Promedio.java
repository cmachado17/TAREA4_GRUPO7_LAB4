package tp4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;

public class Promedio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
		
	public void cambiarVisibilidad() {
		setVisible(true);
	}
	
	public Promedio() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota1 ");
		lblNota1.setBounds(77, 47, 46, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota2");
		lblNota2.setBounds(77, 78, 46, 14);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota3");
		lblNota3.setBounds(77, 109, 46, 14);
		contentPane.add(lblNota3);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(131, 44, 134, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(131, 75, 134, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(131, 106, 134, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Notas del estudiante");
		lblNewLabel.setBounds(49, 11, 139, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(331, 43, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(331, 74, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBackground(SystemColor.activeCaption);
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setBounds(331, 105, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("Notas del Estudiante");
		lblNewLabel_1.setBounds(49, 193, 145, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPromedios = new JLabel("Promedios");
		lblPromedios.setBounds(77, 232, 71, 14);
		contentPane.add(lblPromedios);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(77, 267, 71, 14);
		contentPane.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(151, 229, 134, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(151, 264, 134, 20);
		contentPane.add(txtCondicion);
		txtCondicion.setColumns(10);
	}
	
	
	
	
}
