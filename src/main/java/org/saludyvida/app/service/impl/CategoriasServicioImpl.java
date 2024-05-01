package org.saludyvida.app.service.impl;

import org.saludyvida.app.models.Categorias;
import org.saludyvida.app.repository.CategoriasRepository;
import org.saludyvida.app.service.CategoriasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasServicioImpl implements CategoriasServicio {

    @Autowired
    private CategoriasRepository categoriasRepository;

    @Override
    public List<Categorias> obtenerTodasLasCategorias() {
        return categoriasRepository.findAll();
    }

    @Override
    public Categorias obtenerCategoriaPorId(Long id) {
        return categoriasRepository.findById(id).orElse(null);
    }

    @Override
    public Categorias guardarCategoria(Categorias categoria) {
        return categoriasRepository.save(categoria);
    }

    @Override
    public Categorias actualizarCategoria(Categorias categoria, Long id) {
        Categorias categoriaExistente = categoriasRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada con el id: " + id));

        categoriaExistente.setNombre(categoria.getNombre());
        // Actualizar otros campos de la categoría si es necesario

        return categoriasRepository.save(categoriaExistente);
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriasRepository.deleteById(id);
    }
}