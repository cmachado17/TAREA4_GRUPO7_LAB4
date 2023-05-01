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
import java.awt.Toolkit;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//CONFIGURO PARÁMETROS Y UBICACIÓN DE LA VENTANA
		Dimension dVentana = new Dimension(500, 350);	//MISMO TAMAÑO QUE EN SETBOUNDS!!!
		Dimension dPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int posX = (int) (dPantalla.getWidth() - dVentana.getWidth()) / 2;
		int posY = (int) (dPantalla.getHeight() - dVentana.getHeight()) / 2;
		//this.setLocation(posX, posY);
		//this.setSize(dVentana)
		
		setTitle("Promedio");
		setBounds(posX, posY, 500, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		///JPANEL NOTAS
		JPanel panelNotas = new JPanel();
		panelNotas.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelNotas.setBounds(49, 11, 392, 171);
		contentPane.add(panelNotas);
		panelNotas.setLayout(null);
				
		
		///NOTA 1
		JLabel lblNota1 = new JLabel("Nota1 ");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota1.setBounds(37, 36, 61, 14);
		panelNotas.add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.addKeyListener(new KeyAdapter() {	//configuro que sólo se puedan poner números y con una sola coma
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();

				
			   if(((key < '0') || (key > '9')) && (key != KeyEvent.VK_BACK_SPACE)
			    		&& (key !='.')) {
				   e.consume();
			   }
			   
			   if (key == '.' && txtNota1.getText().contains(".") || key == '.' && txtNota2.getText().contains(".") || key == '.' && txtNota3.getText().contains(".")) {
				   e.consume();
				   }
			}
		});
		txtNota1.setBounds(108, 33, 122, 20);
		txtNota1.setColumns(10);
		panelNotas.add(txtNota1);
		
		
		///NOTA 2
		JLabel lblNota2 = new JLabel("Nota2");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota2.setBounds(37, 66, 61, 14);
		panelNotas.add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {	//configuro que sólo se puedan poner números y con una sola coma
				int key = e.getKeyChar();
	
			   if(((key < '0') || (key > '9')) && (key != KeyEvent.VK_BACK_SPACE)
			    		&& (key !='.')) {
				   e.consume();
			   }
			   
			   if (key == '.' && txtNota1.getText().contains(".") || key == '.' && txtNota2.getText().contains(".") || key == '.' && txtNota3.getText().contains(".")) {
				   e.consume();
			   }
			}
		});
		txtNota2.setBounds(108, 63, 122, 20);
		txtNota2.setColumns(10);
		panelNotas.add(txtNota2);
		
		
		///NOTA 3
		txtNota3 = new JTextField();
		txtNota3.addKeyListener(new KeyAdapter() {	//configuro que sólo se puedan poner números y con una sola coma
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
	
			   if(((key < '0') || (key > '9')) && (key != KeyEvent.VK_BACK_SPACE)
			    		&& (key !='.')) {
				   e.consume();
			   }
			   
			   if (key == '.' && txtNota1.getText().contains(".") || key == '.' && txtNota2.getText().contains(".") || key == '.' && txtNota3.getText().contains(".")) {
				   e.consume();
			   }
			}
		});
		txtNota3.setBounds(108, 96, 122, 20);
		panelNotas.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota3");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota3.setBounds(37, 99, 61, 14);
		panelNotas.add(lblNota3);
		
		
		//DESPLEGABLE TP APROBADO/DESAPROBADO
		JLabel label = new JLabel("TPS");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(37, 130, 60, 14);
		panelNotas.add(label);
		
		JComboBox cbxTps = new JComboBox();
		cbxTps.setBounds(107, 127, 123, 20);
		cbxTps.addItem("Aprobado");
		cbxTps.addItem("Desaprobado");
		panelNotas.add(cbxTps);		
		

		///JPANEL CÁLCULO
		JPanel panelCalculo = new JPanel();
		panelCalculo.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCalculo.setBounds(49, 193, 392, 127);
		contentPane.add(panelCalculo);
		panelCalculo.setLayout(null);
		
		JLabel lblPromedios = new JLabel("Promedio");
		lblPromedios.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPromedios.setBounds(65, 39, 71, 14);
		panelCalculo.add(lblPromedios);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(146, 38, 134, 20);
		panelCalculo.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCondicion.setBounds(65, 75, 71, 14);
		panelCalculo.add(lblCondicion);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(146, 75, 134, 20);
		panelCalculo.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		
		///BOTÓN NUEVO
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBackground(SystemColor.activeCaption);
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNuevo.setBounds(259, 59, 110, 23);
		panelNotas.add(btnNuevo);
		
		
		///BOTÓN CALCULAR
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				float suma=0;
				float nota1=0, nota2=0, nota3=0;
				boolean hayNota=false;				
				boolean hayNotasDesaprobadas=false;
				
				
				///CÁLCULO DEL PROMEDIO
				try {
					if(txtNota1.getText().length()==0) {
						txtNota1.setBackground(Color.red);
					}
					else {
						txtNota1.setBackground(Color.white);
					}
					if(txtNota2.getText().length()==0) {
						txtNota2.setBackground(Color.red);
					}
					else {
						txtNota2.setBackground(Color.white);
					}
					if(txtNota3.getText().length()==0) {
						txtNota3.setBackground(Color.red);
					}
					else {
						txtNota3.setBackground(Color.white);
					}
					
					if(txtNota1.getText().length()!=0 && txtNota2.getText().length()!=0 && txtNota3.getText().length()!=0) {
//						suma=Float.parseFloat(txtNota1.getText()) + Float.parseFloat(txtNota2.getText()) + Float.parseFloat(txtNota3.getText());
						nota1=Float.parseFloat(txtNota1.getText());
						nota2=Float.parseFloat(txtNota2.getText());
						nota3=Float.parseFloat(txtNota3.getText());
						
						suma=nota1+nota2+nota3;
						hayNota=true;
						hayNotasDesaprobadas=hayDesaprobadas(nota1, nota2, nota3);
						
						txtPromedio.setText(Float.toString(suma/3));
					}
				} catch (NumberFormatException e) {
					 System.out.println("Sólo números!");
				}

				
				///CÁLCULO DE LA CONDICIÓN DEL ALUMNO
				if(hayNota){
						if(cbxTps.getSelectedIndex()!=0 || hayNotasDesaprobadas) {
							txtCondicion.setText("Libre");
						}
						else {
							if(cbxTps.getSelectedIndex()==0 && verificaRegularizacion(nota1, nota2, nota3)) {
								txtCondicion.setText("Regular");
							}
							else {
								if(cbxTps.getSelectedIndex()==0 && verificaPromocion(nota1, nota2, nota3)) {
									txtCondicion.setText("Promocionado");
								}
							}
						}
					}
				
				}
		});
		btnCalcular.setBackground(SystemColor.activeCaption);
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.setBounds(259, 25, 110, 23);
		panelNotas.add(btnCalcular);
		
		
		///BOTÓN SALIR
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(259, 93, 110, 23);
		panelNotas.add(btnSalir);
		btnSalir.setBackground(SystemColor.activeCaption);
		btnSalir.setForeground(Color.BLACK);
		
		

	}
	///MÉTODOS 
	public boolean hayDesaprobadas(float nota1, float nota2, float nota3) {
		
		if(nota1<6 || nota2<6 || nota3<6) {
			return true;
		}
		
		return false;
	}
	
	public boolean verificaRegularizacion(float nota1, float nota2, float nota3) {
		
		if(nota1>=6 && nota1<8 && nota2>=6 && nota2<8  && nota3>=6 && nota3<8 ) {
			return true;
		}
		
		return false;
	}
	
	public boolean verificaPromocion(float nota1, float nota2, float nota3) {
		
		if(nota1>=8 && nota2>=8  && nota3>=8 ) {
			return true;
		}
		
		return false;
	}
}

