/**
 * 
 */
package com.buenmaestro.tiendaMusicaldata.dao.impl;

import com.buenmaestro.tiendaMusicaldata.common.CommonDAO;
import com.buenmaestro.tiendaMusicaldata.dao.PersonaDAO;
import com.buenmaestro.tiendaMusicalentities.entities.Persona;

/**
 * @author Eliezer
 * Clase que implementa el CRUD  Generico y las funciones de la interfaz de PersonaDAO
 *
 */
public class PersonaDAOImpl extends CommonDAO<Persona, PersonaDAO> {
	
	/**
	 * Metodo que permite consultar una persona por su usuario y contraseña
	 * @param usuario {@link String} usuario capturado por la persona
	 * @param password {@link String} constraseña capturada por la persona
	 * @return {@link Persona} persona encontrada
	 */
	public Persona findUsuarioAndPassword(String usuario, String password) {
		return this.repository.findByUsuarioAndPassword(usuario, password);
	}

}
