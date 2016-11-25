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
public class NotaJSON {
	@XmlElement
	private int nota;
	@XmlElement
	private String user;
	@XmlElement
	private EjercicioJSON ejercicio;


	public NotaJSON() {
	}
	
	public NotaJSON(int nota,String user, EjercicioJSON ejercicio) {
		this.nota=nota;
		this.setEjercicio(ejercicio);
		this.setUser(user);
	}

	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public EjercicioJSON getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(EjercicioJSON ejercicio) {
		this.ejercicio = ejercicio;
	}


}
