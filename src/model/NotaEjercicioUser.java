package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NotaEjercicioUser database table.
 * 
 */
@Entity
@NamedQuery(name="NotaEjercicioUser.findAll", query="SELECT n FROM NotaEjercicioUser n")
public class NotaEjercicioUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idNotaEjercicioUser;

	private int nota;

	//bi-directional many-to-one association to Ejercicio
	@ManyToOne
	@JoinColumn(name="Ejercicio_idEjercicio")
	private Ejercicio ejercicio;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="User_idUser")
	private User user;

	public NotaEjercicioUser() {
	}

	public int getIdNotaEjercicioUser() {
		return this.idNotaEjercicioUser;
	}

	public void setIdNotaEjercicioUser(int idNotaEjercicioUser) {
		this.idNotaEjercicioUser = idNotaEjercicioUser;
	}

	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Ejercicio getEjercicio() {
		return this.ejercicio;
	}

	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}