package Clases;

public class Producto {
	
	//Atributos
	private int stockActual, stockMinimo, stockMaximo;
	private String nombre;
	private double precio;
	private static int codigoProducto = 2000;
	
	//Constructor
	public Producto(int stockActual, int stockMinimo, int stockMaximo, String nombre, double precio) {
		
		this.stockActual = stockActual;
		this.stockMinimo = stockMinimo;
		this.stockMaximo = stockMaximo;
		this.nombre = nombre;
		this.precio = precio;
	}
	public Producto() {	
	}
	
	//Metodos
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	public int getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public int getStockMaximo() {
		return stockMaximo;
	}
	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public static int getCodigoProducto() {
		return codigoProducto;
	}
	public static void setCodigoProducto(int codigoProducto) {
		Producto.codigoProducto = codigoProducto;
	}
	
	
	
	
	

}
