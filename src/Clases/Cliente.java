package Clases;

public class Cliente {
	
	//Atributos
	private String nombres, apellidos, direccion, telefono, dni;
	private static  int codigoCliente = 1000;
	
	//Constructor
	public Cliente(String nombres, String apellidos, String direccion, String telefono, String dni) {
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}
	public Cliente() {
	}

	//Metodos
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public static int getCodigocliente() {
		return codigoCliente;
	}
	
	
}
