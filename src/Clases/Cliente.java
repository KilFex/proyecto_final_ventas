package Clases;

public class Cliente {
	
	//Atributos
	private String nombres, apellidos, direccion, telefono, dni;
	private static  int codigoCliente = 1001;
	private String codigo;
	
	//Constructor
	public Cliente(String nombres, String apellidos, String direccion, String telefono, String dni) {
		
		this.codigo = clienteCodigo();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}
	public Cliente() {
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	private String clienteCodigo() {
		return String.valueOf(codigoCliente++);
	}
	
	
}
