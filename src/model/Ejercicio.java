package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Ejercicio database table.
 * 
 */
@Entity
@NamedQuery(name="Ejercicio.findAll", query="SELECT e FROM Ejercicio e")
public class Ejercicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEjercicio;

	private int categoria;

	private String enunciado;

	private String solucion;

	//bi-directional many-to-one association to Lugar
	@ManyToOne
	@JoinColumn(name="Lugar_idLugar")
	private Lugar lugar;

	//bi-directional many-to-one association to NotaEjercicioUser
	@OneToMany(mappedBy="ejercicio")
	private List<NotaEjercicioUser> notaEjercicioUsers;

	public Ejercicio() {
	}

	public int getIdEjercicio() {
		return this.idEjercicio;
	}

	public void setIdEjercicio(int idEjercicio) {
		this.idEjercicio = idEjercicio;
	}

	public int getCategoria() {
		return this.categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getEnunciado() {
		return this.enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getSolucion() {
		return this.solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public Lugar getLugar() {
		return this.lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public List<NotaEjercicioUser> getNotaEjercicioUsers() {
		return this.notaEjercicioUsers;
	}

	public void setNotaEjercicioUsers(List<NotaEjercicioUser> notaEjercicioUsers) {
		this.notaEjercicioUsers = notaEjercicioUsers;
	}

	public NotaEjercicioUser addNotaEjercicioUser(NotaEjercicioUser notaEjercicioUser) {
		getNotaEjercicioUsers().add(notaEjercicioUser);
		notaEjercicioUser.setEjercicio(this);

		return notaEjercicioUser;
	}

	public NotaEjercicioUser removeNotaEjercicioUser(NotaEjercicioUser notaEjercicioUser) {
		getNotaEjercicioUsers().remove(notaEjercicioUser);
		notaEjercicioUser.setEjercicio(null);

		return notaEjercicioUser;
	}

}