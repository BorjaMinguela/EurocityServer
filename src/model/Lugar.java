package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Lugar database table.
 * 
 */
@Entity
@NamedQuery(name="Lugar.findAll", query="SELECT l FROM Lugar l")
public class Lugar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLugar;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="lugar")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Ejercicio
	@OneToMany(mappedBy="lugar")
	private List<Ejercicio> ejercicios;

	//bi-directional many-to-one association to Foto
	@OneToMany(mappedBy="lugar")
	private List<Foto> fotos;

	//bi-directional many-to-one association to Valoracion
	@ManyToOne
	@JoinColumn(name="Valoracion_idValoracion")
	private Valoracion valoracion;

	public Lugar() {
	}

	public int getIdLugar() {
		return this.idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setLugar(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setLugar(null);

		return comentario;
	}

	public List<Ejercicio> getEjercicios() {
		return this.ejercicios;
	}

	public void setEjercicios(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}

	public Ejercicio addEjercicio(Ejercicio ejercicio) {
		getEjercicios().add(ejercicio);
		ejercicio.setLugar(this);

		return ejercicio;
	}

	public Ejercicio removeEjercicio(Ejercicio ejercicio) {
		getEjercicios().remove(ejercicio);
		ejercicio.setLugar(null);

		return ejercicio;
	}

	public List<Foto> getFotos() {
		return this.fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	public Foto addFoto(Foto foto) {
		getFotos().add(foto);
		foto.setLugar(this);

		return foto;
	}

	public Foto removeFoto(Foto foto) {
		getFotos().remove(foto);
		foto.setLugar(null);

		return foto;
	}

	public Valoracion getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(Valoracion valoracion) {
		this.valoracion = valoracion;
	}

}