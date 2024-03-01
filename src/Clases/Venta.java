package Clases;

public class Venta {
	
	//Atributos
	private int codigoCliente, codigoProducto, cantidad;
	private double precio;
	private String fecha;
	private static int codigoVenta = 3000;
	
	//Constructor
	public Venta(int codigoCliente, int codigoProducto, int cantidad, double precio, String fecha) {
		
		this.codigoCliente = codigoCliente;
		this.codigoProducto = codigoProducto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fecha = fecha;
	}
	public Venta() {
	}
	
	//Metodos
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public static int getCodigoVenta() {
		return codigoVenta;
	}
	public static void setCodigoVenta(int codigoVenta) {
		Venta.codigoVenta = codigoVenta;
	}
	
	
	
	
	
}
