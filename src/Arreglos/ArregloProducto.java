package Arreglos;

import java.util.ArrayList;

import Clases.Producto;

public class ArregloProducto {

	ArrayList<Producto> arrProducto;
	
public void crearArrayListProducto() {
	
	arrProducto = new ArrayList();
	
}

public void agregarProducto(Producto producto) {
	arrProducto.add(producto);
}
public int longitud() {
	return arrProducto.size();
}
public Producto obtenerProducto(int index) {
	return arrProducto.get(index);
}
public void eliminarProducto(Producto p) {
	arrProducto.remove(p);
}
public void modificarProductos(String codigo, int stockActual, int stockMinimo, int stockMaximo, String nombre, double precio) {
	for(Producto producto:arrProducto) {
		if(producto.getProductoCodigo()== codigo) {
			producto.setNombre(nombre);
			producto.setPrecio(precio);
			producto.setStockActual(stockActual);
			producto.setStockMaximo(stockMaximo);
			producto.setStockMinimo(stockMinimo);
		}
	}
	
	
}
	
}
