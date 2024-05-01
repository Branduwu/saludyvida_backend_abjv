package org.saludyvida.app.service;

import org.saludyvida.app.models.Categorias;

import java.util.List;

public interface CategoriasServicio {
    List<Categorias> obtenerTodasLasCategorias();
    Categorias obtenerCategoriaPorId(Long id);
    Categorias guardarCategoria(Categorias categoria);
    Categorias actualizarCategoria(Categorias categoria, Long id);
    void eliminarCategoria(Long id);
}