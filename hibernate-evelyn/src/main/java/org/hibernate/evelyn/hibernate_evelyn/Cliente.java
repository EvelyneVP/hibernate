package org.hibernate.evelyn.hibernate_evelyn;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="clientes")
public class Cliente{

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private long id;
	
	private String nombre;
	
	private String  apellidos;
	
	@Column(name ="fecha_nac")
	private  Date fechaNac;
	
	private String telefono;
	
	private char estado;
	
	
    
	public Cliente(){
		
	}

	public Cliente(long id, String nombre, String apellidos, Date fechaNac, String telefono, char estado) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.telefono = telefono;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac
				+ ", telefono=" + telefono + ", estado=" + estado + "]";
	}
	
	
	
	
	
	
	
}
