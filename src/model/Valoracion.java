package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Valoracion database table.
 * 
 */
@Entity
@NamedQuery(name="Valoracion.findAll", query="SELECT v FROM Valoracion v")
public class Valoracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idValoracion;

	private int nota;

	//bi-directional many-to-one association to Lugar
	@OneToMany(mappedBy="valoracion")
	private List<Lugar> lugars;

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

	public List<Lugar> getLugars() {
		return this.lugars;
	}

	public void setLugars(List<Lugar> lugars) {
		this.lugars = lugars;
	}

	public Lugar addLugar(Lugar lugar) {
		getLugars().add(lugar);
		lugar.setValoracion(this);

		return lugar;
	}

	public Lugar removeLugar(Lugar lugar) {
		getLugars().remove(lugar);
		lugar.setValoracion(null);

		return lugar;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}