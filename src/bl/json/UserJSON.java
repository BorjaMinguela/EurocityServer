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
public class UserJSON {
	@XmlElement
	private String nombre;
	
	@XmlElement
	private String fotoPerfil;

	public UserJSON() {
	}
	
	public UserJSON(String nombre, String fotoPerfil) {
		this.nombre=nombre;
		this.fotoPerfil=fotoPerfil;
}
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getfotoPerfil() {
		return this.fotoPerfil;
	}

	public void setfotoPerfil(String fotoPerfil) {
		this.nombre = fotoPerfil;
	}
}
