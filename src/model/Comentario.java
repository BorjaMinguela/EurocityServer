package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Comentarios database table.
 * 
 */
@Entity
@Table(name="Comentarios")
@NamedQuery(name="Comentario.findAll", query="SELECT c FROM Comentario c")
public class Comentario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idComentarios;

	private String categoria;

	private String comentario;

	//bi-directional many-to-one association to Lugar
	@ManyToOne
	@JoinColumn(name="Lugar_idLugar")
	private Lugar lugar;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="User_idUser")
	private User user;

	public Comentario() {
	}

	public int getIdComentarios() {
		return this.idComentarios;
	}

	public void setIdComentarios(int idComentarios) {
		this.idComentarios = idComentarios;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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