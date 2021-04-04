package Carrito.models;


import java.util.List;

public class Carrito {
	
	private int id;
	private int idUsuario;
	private List[] idProductos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public List[] getIdProductos() {
		return idProductos;
	}
	public void setIdProductos(List[] idProductos) {
		this.idProductos = idProductos;
	}
	
}
