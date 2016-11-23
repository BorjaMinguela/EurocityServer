package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Lugar database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Lugar.findAll", query="SELECT l FROM Lugar l"),
	@NamedQuery(name="Lugar.findByName", query="SELECT l FROM Lugar l WHERE l.nombre= :nombre")
})
public class Lugar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idLugar;

	@Column(name="Nombre")
	private String nombre;

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
	@OneToMany(mappedBy="lugar")
	private List<Valoracion> valoracions;

	public Lugar() {
	}

	public int getIdLugar() {
		return this.idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public List<Valoracion> getValoracions() {
		return this.valoracions;
	}

	public void setValoracions(List<Valoracion> valoracions) {
		this.valoracions = valoracions;
	}

	public Valoracion addValoracion(Valoracion valoracion) {
		getValoracions().add(valoracion);
		valoracion.setLugar(this);

		return valoracion;
	}

	public Valoracion removeValoracion(Valoracion valoracion) {
		getValoracions().remove(valoracion);
		valoracion.setLugar(null);

		return valoracion;
	}

}