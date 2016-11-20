package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="User.findAll", query="SELECT u FROM User u"),
@NamedQuery(name="User.findByName", query="SELECT u FROM User u WHERE u.nombre= :nombre")
})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUser;

	private String fotoPerfil;

	private String nombre;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="user")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Ejercicio
	@OneToMany(mappedBy="user")
	private List<Ejercicio> ejercicios;

	//bi-directional many-to-one association to Foto
	@OneToMany(mappedBy="user")
	private List<Foto> fotos;

	//bi-directional many-to-one association to Valoracion
	@OneToMany(mappedBy="user")
	private List<Valoracion> valoracions;

	public User() {
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFotoPerfil() {
		return this.fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
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
		comentario.setUser(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setUser(null);

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
		ejercicio.setUser(this);

		return ejercicio;
	}

	public Ejercicio removeEjercicio(Ejercicio ejercicio) {
		getEjercicios().remove(ejercicio);
		ejercicio.setUser(null);

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
		foto.setUser(this);

		return foto;
	}

	public Foto removeFoto(Foto foto) {
		getFotos().remove(foto);
		foto.setUser(null);

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
		valoracion.setUser(this);

		return valoracion;
	}

	public Valoracion removeValoracion(Valoracion valoracion) {
		getValoracions().remove(valoracion);
		valoracion.setUser(null);

		return valoracion;
	}

}