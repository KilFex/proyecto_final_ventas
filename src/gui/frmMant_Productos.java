package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class frmMant_Productos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblStockactual;
	private JLabel lblStockminimo;
	private JLabel lblStockmaximo;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtStockActual;
	private JTextField txtStockMinimo;
	private JTextField txtStockMaximo;
	private JButton bntIngresar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JButton btnListado;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMant_Productos frame = new frmMant_Productos();
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
	public frmMant_Productos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(55, 11, 78, 31);
		contentPane.add(lblNewLabel);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setBounds(55, 53, 78, 31);
		contentPane.add(lblPrecio);
		
		lblStockactual = new JLabel("StockActual");
		lblStockactual.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStockactual.setBounds(55, 95, 128, 31);
		contentPane.add(lblStockactual);
		
		lblStockminimo = new JLabel("StockMinimo");
		lblStockminimo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStockminimo.setBounds(55, 137, 128, 31);
		contentPane.add(lblStockminimo);
		
		lblStockmaximo = new JLabel("StockMaximo");
		lblStockmaximo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStockmaximo.setBounds(55, 179, 128, 31);
		contentPane.add(lblStockmaximo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(180, 11, 100, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(180, 56, 100, 26);
		contentPane.add(txtPrecio);
		
		txtStockActual = new JTextField();
		txtStockActual.setColumns(10);
		txtStockActual.setBounds(180, 95, 100, 26);
		contentPane.add(txtStockActual);
		
		txtStockMinimo = new JTextField();
		txtStockMinimo.setColumns(10);
		txtStockMinimo.setBounds(180, 137, 100, 26);
		contentPane.add(txtStockMinimo);
		
		txtStockMaximo = new JTextField();
		txtStockMaximo.setColumns(10);
		txtStockMaximo.setBounds(180, 179, 100, 26);
		contentPane.add(txtStockMaximo);
		
		bntIngresar = new JButton("Ingresar");
		bntIngresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		bntIngresar.setBounds(424, 16, 113, 30);
		contentPane.add(bntIngresar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setBounds(424, 53, 113, 30);
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificar.setBounds(424, 95, 113, 30);
		contentPane.add(btnModificar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(424, 142, 113, 30);
		contentPane.add(btnConsultar);
		
		btnListado = new JButton("Listado");
		btnListado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnListado.setBounds(424, 184, 113, 30);
		contentPane.add(btnListado);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 238, 902, 331);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
