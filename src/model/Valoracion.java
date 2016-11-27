package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Valoracion database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Valoracion.findAll", query="SELECT v FROM Valoracion v"),
	@NamedQuery(name="Valoracion.findByUser", query="SELECT v FROM Valoracion v WHERE v.user= :user")
})
public class Valoracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValoracion;

	private int nota;

	//bi-directional many-to-one association to Lugar
	@ManyToOne
	@JoinColumn(name="Lugar_idLugar")
	private Lugar lugar;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="User_idUser")
	private User user;

	public Valoracion() {
	}

	public int getIdValoracion() {
		return this.idValoracion;
	}

	public void setIdValoracion(int idValoracion) {
		this.idValoracion = idValoracion;
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