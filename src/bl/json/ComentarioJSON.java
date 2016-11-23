/*
 * $Id: StudentJSON.java Nov 3, 2016 tta1617$
 * 
 * Copyright (C) 2015 Maider Huarte Arrayago
 * 
 * This file is part of TTA1617_LS-EX_9-11S.zip.
 * 
 * TTA1617_LS-EX_9-11S.zip is based on templates by Eclipse.org and it is
 * intended for learning purposes only.
 * 
 * TTA1617_LS-EX_9-11S.zip is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * TTA1617_LS-EX_9-11S.zip is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details <http://www.gnu.org/licenses/>.
 */

package bl.json;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ComentarioJSON {
	@XmlElement
	private String comentario;
	@XmlElement
	private String categoria;
	@XmlElement
	private String user;
	@XmlElement
	private String lugar;

	public ComentarioJSON() {
	}
	
	public ComentarioJSON(String comentario,String categoria,String user,String lugar) {
		this.comentario=comentario;
		this.categoria=categoria;
		this.user=user;
		this.lugar=lugar;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
}
