package gui;

import semana_05.ArregloEdades;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_5_1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JButton btnGenerar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_5_1 frame = new Problema_5_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_5_1() {
		setTitle("Problema_5_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(71, 11, 89, 23);
		contentPane.add(btnListar);

		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(171, 11, 89, 23);
		contentPane.add(btnReportar);

		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(this);
		btnGenerar.setBounds(271, 11, 89, 23);
		contentPane.add(btnGenerar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 406);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGenerar) {
			actionPerformedBtnGenerar(arg0);
		}
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}

	// Declare y cree el objeto global ae de tipo ArregloEdades.
	ArregloEdades ae = new ArregloEdades();

	// A la pulsación del botón Listar visualice las edades del arreglo.
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		for (int i = 0; i < ae.tamanio(); i++) {
			imprimir("n[" + i + "] :  " + ae.obtener(i));
		}
	}
	
	/*A la pulsación del botón Reportar visualice: cantidad de edades, 
	 * edad promedio, edad mayor, edad menor, cantidad de personas mayores
	 *  de edad, cantidad de personas menores de edad, posición de la primera
	 *   edad adolescente y posición de la última edad adolescente
	 */
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		imprimir();    	
    	imprimir("Edad promedio 			:  " + ae.edadPromedio());    	
    	imprimir("Edad mayor 				:  " + ae.edadMayor());
    	imprimir("Edad menor 				:  " + ae.edadMenor());
    	imprimir("Mayores de edad 			:  " + ae.cantMayoresEdad());
    	imprimir("Menores de edad 			:  " + ae.edadMenor());
    	imprimir("Primera edad adolescente 	:  " + ae.posPrimeraEdadAdolescente());
    	imprimir("Ultima edad adolescente 	:  " + ae.posUltimaEdadAdolescente());
    	         
	}

	protected void actionPerformedBtnGenerar(ActionEvent arg0) {
		ae.generarEdades();
		imprimir();
		imprimir("Las edades han sido generadas. Pulse [Listar]");
	}

	// M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}

	// M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}

}