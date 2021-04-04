package Carrito.models;

import java.time.LocalDate;

public class Orden {
	
	private int id;
	private int idUsuario;
	private int idDomicilio;
	private int idCarrito;
	private String metodoPago;
	private LocalDate fecha;
	private float total;
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
	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public int getIdCarrito() {
		return idCarrito;
	}
	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	

}
