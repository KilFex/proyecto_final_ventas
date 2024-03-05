package Arreglos;

import java.util.ArrayList;

import Clases.Cliente;
//import Clases.Persona;
//import Clases.Persona;

public class ArregloClientes {
	
	ArrayList<Cliente> arrClientes;
	
public void crearArrayListCliente() {
		
		arrClientes = new ArrayList(); 
	}
	
	
	public void insertarCliente(Cliente cliente) {
		arrClientes.add(cliente);
	}
	public  ArrayList<Cliente> devolverInformacion() {
		return arrClientes;
	}
	public int longitud() {
		return arrClientes.size();
	}
	public  Cliente getCliente(int index) {
		return arrClientes.get(index);
	}
	public void eliminarPorCodigo(String codigo) {
		
		arrClientes.removeIf(persona -> persona.getCodigo().equals(codigo));
		
		}
	public Cliente consultarPersona(String codigo) {
		for(int i = 0; i<longitud(); i++) {
			Cliente personaConsultar = arrClientes.get(i);
			if(personaConsultar.getCodigo()== codigo) {
				return personaConsultar;
			}
			
		}
		return null;
			
	}
	public void modificarCliente(String codigo,String nombres, String apellidos, String direccion, String telefono, String dni ) {
		for(Cliente cliente:arrClientes) {
			if(cliente.getCodigo()==codigo) {
				cliente.setNombres(nombres);
				cliente.setApellidos(apellidos);
				cliente.setDireccion(direccion);
				cliente.setTelefono(telefono);
				cliente.setDni(dni);
			}
		}
	}
	
	
	
	
	
	
	
	
}
