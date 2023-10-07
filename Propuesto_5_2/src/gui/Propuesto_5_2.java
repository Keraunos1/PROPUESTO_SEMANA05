package gui;

import semana_05.ArregloPrecios;
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

public class Propuesto_5_2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_5_2 frame = new Propuesto_5_2();
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
	public Propuesto_5_2() {
		setTitle("Propuesto_5_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(77, 11, 95, 23);
		contentPane.add(btnListar);

		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(182, 11, 95, 23);
		contentPane.add(btnReportar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 406);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);

		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ap.generarPrecios();
				imprimir();
				imprimir("Los precios han sido generados. Pulse el botón [Listar]");
			}
		});
		btnGenerar.setBounds(302, 11, 89, 23);
		contentPane.add(btnGenerar);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}

	ArregloPrecios ap = new ArregloPrecios();

	protected void actionPerformedBtnListar(ActionEvent arg0) {
		for (int i = 0; i < ap.tamanio(); i++) {
			imprimir("Sueldos[" + i + "] :  " + ap.obtener(i));
		}
	}

	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		imprimir();
		imprimir("Tamaño total del arreglo			:  " + ap.tamanio());
		imprimir("Precio promedio 					:  " + ap.precioPromedio());
		imprimir("Precio mayor 						:  " + ap.precioMayor());
		imprimir("Precio menor 						:  " + ap.precioMenor());
		imprimir("Cantidad mayor al promedio 		:  " + ap.cantMayoresPrecioPromedio());
		imprimir("Menores al precio promedio 		:  " + ap.cantMenoresPrecioPromedio());
		imprimir("Primer precio mayor al segundo 	:  " + ap.posPrimerPrecioMayorAlSegundo());
		imprimir("Ultimo precio menor al penultimo 	:  " + ap.posUltimoPrecioMenorAlPenultimo());
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