package tp4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Mensaje extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private String primero;
	private ArrayList <String> segundo;
	private String tercero;
	
	public void cambiarVisibilidad(boolean estado) {
				setVisible(estado);
	}
	
	public Mensaje(String primero, ArrayList <String> segundo, String tercero) {
		
		this.primero = primero;
		this.segundo = segundo;
		this.tercero = tercero;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 350, 700, 150);
		setTitle("Mensaje");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("logo.jpg"));
		lblLogo.setBounds(21, 22, 56, 51);
		contentPane.add(lblLogo);
		
		JLabel lblInfo = new JLabel("");
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInfo.setBounds(87, 22, 500, 47);
		contentPane.add(lblInfo);
		
		lblInfo.setText(primero);
		
		//mostrar label
		for (String string : segundo) {
			System.out.println("esto tiene string: " + string);
			if(string != null) {
				System.out.println(lblInfo.getText());
				lblInfo.setText(lblInfo.getText() + "- " + string);
			
			}
		}
		
		lblInfo.setText(lblInfo.getText() + "- " + tercero);
		System.out.println(lblInfo.getText());
		
		JButton btn = new JButton("Aceptar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarVisibilidad(false);
			}
		});
		btn.setBounds(300, 80, 89, 23);
		contentPane.add(btn);
	}

	public String getPrimero() {
		return primero;
	}

	public void setPrimero(String primero) {
		this.primero = primero;
	}

	public ArrayList<String> getSegundo() {
		return segundo;
	}

	public void setSegundo(ArrayList<String> segundo) {
		this.segundo = segundo;
	}

	public String getTercero() {
		return tercero;
	}

	public void setTercero(String tercero) {
		this.tercero = tercero;
	}
	
	

}
