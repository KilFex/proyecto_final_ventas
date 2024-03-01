package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMantenimiento extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mnCliente;
	private JMenuItem mnProductos;
	private JMenu mnNewMenu_1;
	private JMenu mntalmacen;
	private JMenu mntReportes;
	private JMenuItem mnVentas;
	private JMenuItem mnAlmacen;
	private JMenuItem mnReportes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMantenimiento frame = new frmMantenimiento();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmMantenimiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 382);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Mantemiento");
		menuBar.add(mnNewMenu);
		
		mnCliente = new JMenuItem("Cliente");
		mnCliente.addActionListener(this);
		mnNewMenu.add(mnCliente);
		
		mnProductos = new JMenuItem("Productos");
		mnProductos.addActionListener(this);
		mnNewMenu.add(mnProductos);
		
		mnNewMenu_1 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_1);
		
		mnVentas = new JMenuItem("Ventas");
		mnVentas.addActionListener(this);
		mnNewMenu_1.add(mnVentas);
		
		mntalmacen = new JMenu("Almacen");
		menuBar.add(mntalmacen);
		
		mnAlmacen = new JMenuItem("Almacen");
		mnAlmacen.addActionListener(this);
		mntalmacen.add(mnAlmacen);
		
		mntReportes = new JMenu("Reportes");
		menuBar.add(mntReportes);
		
		mnReportes = new JMenuItem("Reportes");
		mnReportes.addActionListener(this);
		mntReportes.add(mnReportes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mnReportes) {
			actionPerformedMnReportes(e);
		}
		if (e.getSource() == mnAlmacen) {
			actionPerformedMntmNewMenuItem_3(e);
		}
		if (e.getSource() == mnVentas) {
			actionPerformedMnVentas(e);
		}
		if (e.getSource() == mnProductos) {
			actionPerformedMnProductos(e);
		}
		if (e.getSource() == mnCliente) {
			actionPerformedMnCliente(e);
		}
	}
	protected void actionPerformedMnCliente(ActionEvent e) {
		frmMant_Clientes clientes = new frmMant_Clientes();
		clientes.setVisible(true);
	}
	protected void actionPerformedMnProductos(ActionEvent e) {
		frmMant_Productos productos = new frmMant_Productos();
		productos.setVisible(true);				
	}
	protected void actionPerformedMnVentas(ActionEvent e) {
		frmVentas ventas = new frmVentas();
		ventas.setVisible(true);		
	}
	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {
		frmAlmacen almacen = new frmAlmacen();
		almacen.setVisible(true);
	}
	protected void actionPerformedMnReportes(ActionEvent e) {
		frmReportes reportes = new frmReportes();
		reportes.setVisible(true);
	}
}
