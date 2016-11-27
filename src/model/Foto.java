package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Fotos database table.
 * 
 */
@Entity
@Table(name="Fotos")
@NamedQueries({
	@NamedQuery(name="Foto.findAll", query="SELECT f FROM Foto f"),
	@NamedQuery(name="Foto.findByUser", query="SELECT f FROM Foto f WHERE f.user= :usuario"),
	@NamedQuery(name="Foto.findByLugar", query="SELECT f FROM Foto f WHERE f.user= :usuario AND f.lugar= :lugar")
})
public class Foto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idFotos;

	private String path;

	//bi-directional many-to-one association to Lugar
	@ManyToOne
	@JoinColumn(name="Lugar_idLugar")
	private Lugar lugar;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="User_idUser")
	private User user;

	public Foto() {
	}

	public int getIdFotos() {
		return this.idFotos;
	}

	public void setIdFotos(int idFotos) {
		this.idFotos = idFotos;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
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