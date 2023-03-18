/**
 * 
 */
package com.buenmaestro.tiendaMusicalservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buenmaestro.tiendaMusicaldata.dao.PersonaDAO;
import com.buenmaestro.tiendaMusicalentities.entities.Persona;
import com.buenmaestro.tiendaMusicalservices.service.LoginService;

/**
 * @author Eliezer
 * Clase que implementa las funciones  para la logica de negocio para la pantalla de login
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private PersonaDAO personaDAOImpl;

	@Override
	public Persona consultarUsuarioLogin(String usuario, String password) {
		
		return this.personaDAOImpl.findByUsuarioAndPassword(usuario, password);
	}

}
