package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Arreglos.ArregloClientes;
import Clases.Cliente;
//import Clases.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMant_Clientes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblApellidos;
	private JLabel lblDireccion;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtDni;
	private JButton bntIngresar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnConsultar;
	private JScrollPane scrollPane;
	private JTable tabla;
	private String [] cabezera = {"CODIGO","NOMBRES","APELLIDOS","DIRECCION","TELEFONO","DNI"};
	DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMant_Clientes frame = new frmMant_Clientes();
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
	ArregloClientes arregloClientes;
	private JButton btnListado;
	public frmMant_Clientes() {
		
		arregloClientes = new ArregloClientes();
		arregloClientes.crearArrayListCliente();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1003, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(28, 31, 108, 30);
		contentPane.add(lblNewLabel);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellidos.setBounds(28, 77, 108, 30);
		contentPane.add(lblApellidos);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDireccion.setBounds(28, 118, 108, 30);
		contentPane.add(lblDireccion);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefono.setBounds(28, 165, 108, 30);
		contentPane.add(lblTelefono);
		
		lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDni.setBounds(28, 218, 108, 30);
		contentPane.add(lblDni);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(126, 35, 108, 24);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(126, 81, 108, 24);
		contentPane.add(txtApellidos);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(126, 118, 108, 24);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(126, 169, 108, 24);
		contentPane.add(txtTelefono);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(126, 224, 108, 24);
		contentPane.add(txtDni);
		
		bntIngresar = new JButton("Ingresar");
		bntIngresar.addActionListener(this);
		bntIngresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		bntIngresar.setBounds(381, 11, 113, 30);
		contentPane.add(bntIngresar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setBounds(381, 62, 113, 30);
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificar.setBounds(381, 114, 113, 30);
		contentPane.add(btnModificar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(381, 165, 113, 30);
		contentPane.add(btnConsultar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 280, 925, 328);
		contentPane.add(scrollPane);
		
		tabla = new JTable();
		scrollPane.setViewportView(tabla);
		
		btnListado = new JButton("Listado");
		btnListado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnListado.setBounds(381, 218, 113, 30);
		contentPane.add(btnListado);
		
		set_table();
		
	}
	
	public void set_table() {
		
	    model = new DefaultTableModel(); // Crea el modelo de la tabla con los datos y la cabecera
	    model.setColumnIdentifiers(cabezera);
	    int longitud = arregloClientes.longitud();
	    
	    for(int i = 0; i < longitud; i++) {
	    	
	    	Cliente cliente = arregloClientes.getCliente(i); 
	    	
	    	Object [] row = {cliente.getCodigo(),
	    					 cliente.getNombres(), 
	    					 cliente.getApellidos(), 
	    					 cliente.getDireccion(),
	    					 cliente.getTelefono(),
	    					 cliente.getDni()};
	    	
	    	model.addRow(row);
	    	
	    }
	    tabla.setModel(model); // Establece el modelo en la tabla
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == bntIngresar) {
			
			if(txtApellidos.getText().isEmpty() || txtDni.getText().isEmpty() || 
					txtNombres.getText().isEmpty() || txtDireccion.getText().isEmpty()||
					txtTelefono.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this,"No se a ingresado correctamente los datos");
			}else {
				actionPerformedBntIngresar(e);
				limpiar();
			set_table();
		}
		}
	}
	protected void actionPerformedBntIngresar(ActionEvent e) {
		
		String nombres = txtNombres.getText();
		String apellidos = txtApellidos.getText();
		String direccion = txtDireccion.getText();
		String telefono = txtTelefono.getText();
		String dni = txtDni.getText();
		
		Cliente cliente = new Cliente(nombres, apellidos, direccion, telefono, dni);
		arregloClientes.insertarCliente(cliente);
		
	}

	protected void actionPerformedBtnEliminar(ActionEvent e) {
		int filaSeleccionadad = tabla.getSelectedRow();
		if(filaSeleccionadad == -1) {
			JOptionPane.showMessageDialog(this,"No a seleccionado ninguna fila");
		} else {
		String selectCode = String.valueOf(model.getValueAt(filaSeleccionadad, filaSeleccionadad));
		arregloClientes.eliminarPorCodigo(selectCode);
		model.removeRow(filaSeleccionadad);
		}
	}
	void limpiar() {
		txtApellidos.setText("");
		txtDni.setText("");
		txtNombres.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
		frmModificar_Cliente modificarCliente = new frmModificar_Cliente();
		modificarCliente.setVisible(true);
	}
}
