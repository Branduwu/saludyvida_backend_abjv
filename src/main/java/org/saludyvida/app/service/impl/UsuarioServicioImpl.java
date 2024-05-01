package org.saludyvida.app.service.impl;

import java.util.List;

import org.saludyvida.app.models.Usuarios;
import org.saludyvida.app.service.UsuarioServicios;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements UsuarioServicios {

	@Override
	public Usuarios obtenerUsuarioPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios obtenerUsuarioPorCorreo(String correo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios guardarUsuario(Usuarios usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> obtenerUsuariosActivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> obtenerUsuariosInactivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> obtenerTodosLosUsuarios(boolean esActivo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios actualizarUsuario(Usuarios usuario, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarUsuario(Long id) {
		// TODO Auto-generated method stub
		
	}

    // Implementación de los métodos de la interfaz UsuarioServicios
    // ...

}