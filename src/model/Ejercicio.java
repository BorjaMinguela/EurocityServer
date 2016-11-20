package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Ejercicios database table.
 * 
 */
@Entity
@Table(name="Ejercicios")
@NamedQuery(name="Ejercicio.findAll", query="SELECT e FROM Ejercicio e")
public class Ejercicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEjercicios;

	private String categoria;

	private int nota;

	//bi-directional many-to-one association to Lugar
	@ManyToOne
	@JoinColumn(name="Lugar_idLugar")
	private Lugar lugar;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="User_idUser")
	private User user;

	public Ejercicio() {
	}

	public int getIdEjercicios() {
		return this.idEjercicios;
	}

	public void setIdEjercicios(int idEjercicios) {
		this.idEjercicios = idEjercicios;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Lugar getLugar() {
		return this.lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}